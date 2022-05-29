package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.Guest;
import model.GuestList;
import model.GuestModelManager;
import model.Rooms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GuestInformationController
{
  private GuestModelManager modelManager;
  private ViewHandler viewHandler;
  private Region root;

  @FXML private TextField NameTF;
  @FXML private TextField EmailTF;
  @FXML private TextField PhoneNumberTF;
  @FXML private DatePicker CheckInDP;
  @FXML private DatePicker CheckOutDP;
  @FXML private TextField IDProofTF;
  @FXML private Button SearchButton;
  @FXML private Button BackButton;
  @FXML private Button UpdateButton;
  @FXML private Button ExitButton;
  @FXML private ComboBox<Guest> GuestBox;
  @FXML private ComboBox<Rooms> RoomBox;

  public void init(ViewHandler viewHandler, GuestModelManager modelManager, Region root)
  {
    this.modelManager = modelManager;
    this.root = root;
    this.viewHandler = viewHandler;
  }

  public void UpdateGuestBox()
  {
    int index = GuestBox.getSelectionModel().getSelectedIndex();
    GuestBox.getItems().clear();

    GuestList guests = modelManager.getAllGuest();
    for (int i = 0; i < guests.size(); i++)
    {
      GuestBox.getItems().add(guests.get(i));
    }
    if (index == -1 && GuestBox.getItems().size() > 0)
    {
      GuestBox.getSelectionModel().select(0);
    }
    else
    {
      GuestBox.getSelectionModel().select(index);
    }
  }

  public void handleAction(ActionEvent e)
  {
    if(e.getSource() == SearchButton)
    {
      if ((modelManager != null))
      {
        UpdateGuestBox();
        Guest temp = GuestBox.getSelectionModel().getSelectedItem();

        if(temp != null)
        {
          NameTF.setText(temp.getName());

          PhoneNumberTF.setText(temp.getPhoneNumber());
          CheckInDP.setValue(temp.getCheckInDate());
          CheckOutDP.setValue(temp.getCheckOutDate());
          //RoomBox.setValue(temp.getRoomType());
          IDProofTF.setText(temp.getIdProof());
        }
      }
    }

    else if (e.getSource() == UpdateButton)
    {
      String name = NameTF.getText();
      String address = EmailTF.getText();
      String phoneNumber = PhoneNumberTF.getText();
      LocalDate checkIn = LocalDate.parse(
          CheckInDP.getValue().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
      LocalDate checkOut = LocalDate.parse(
          CheckOutDP.getValue().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
      String roomType = String.valueOf(RoomBox.getSelectionModel().getSelectedItem());
      String idProof = IDProofTF.getText();

      modelManager.changeGuestInformation(name,phoneNumber,idProof,checkIn,checkOut,roomType);
      UpdateGuestBox();
    }
    else if (e.getSource() == ExitButton)
    {
      System.exit(1);
    }
  }

  public void reset()
  {
  }

  public Region getRoot()
  {
    return root;
  }
}
