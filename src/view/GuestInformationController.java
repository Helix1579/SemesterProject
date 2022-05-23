package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.Guest;
import model.GuestList;
import model.GuestModelManager;
import model.Rooms;

import java.time.format.DateTimeFormatter;

public class GuestInformationController
{
  private GuestModelManager modelManager;

  @FXML private TextField NameTF;
  @FXML private TextField AddressTF;
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

  public void init(GuestModelManager modelManager)
  {
    this.modelManager = modelManager;
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
          AddressTF.setText(temp.getAddress());
          PhoneNumberTF.setText(String.valueOf(temp.getPhoneNumber()));
          CheckInDP.setValue(temp.getCheckInDate());
          CheckOutDP.setValue(temp.getCheckOutDate());
          //RoomBox.setValue(temp.getRoomType());
          IDProofTF.setText(String.valueOf(temp.getIdProof()));
        }
      }
    }

    else if (e.getSource() == UpdateButton)
    {
      String name = NameTF.getText();
      String address = AddressTF.getText();
      long phoneNumber = Long.parseLong(PhoneNumberTF.getText());
      String checkIn = CheckInDP.getValue().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
      String checkOut = CheckOutDP.getValue().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
      String roomType = String.valueOf(RoomBox.getSelectionModel().getSelectedItem());
      String idProof = IDProofTF.getText();

      modelManager.changeGuestInformation();
      UpdateGuestBox();
    }
    else if (e.getSource() == ExitButton)
    {
      System.exit(1);
    }
  }
}
