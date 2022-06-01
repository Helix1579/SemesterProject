package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.Guest;
import model.GuestList;
import model.GuestModelManager;

import javax.swing.*;
import java.time.LocalDate;

/**
 * Class containing all the action events happening at Update Guest Information page
 * @author Yashraj Mashruwala
 * @version 2.0
 */
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
  @FXML private TextField RoomNumberTF;

  /**
   * Requires to switch between different pages
   * @param viewHandler the viewHandler to replace with
   * @param modelManager the modelmanager to replace with
   * @param root the root to replace with
   */
  public void init(ViewHandler viewHandler, GuestModelManager modelManager, Region root)
  {
    this.modelManager = modelManager;
    this.root = root;
    this.viewHandler = viewHandler;
    UpdateGuestBox();
  }


  /**
   * Gets all the Guest objects by name from the GuestList.
   */
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

  /**
   * this method contains all the action events happening on the page
   * @param e Creates and returns a copy of this event with the specified event source and target the object on which the Event initially occurred
   */
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
          EmailTF.setText(temp.getEmail());
          PhoneNumberTF.setText(temp.getPhoneNumber());
          CheckInDP.setValue(temp.getCheckInDate());
          CheckOutDP.setValue(temp.getCheckOutDate());
          RoomNumberTF.setText(temp.getRoomNumber());
          IDProofTF.setText(temp.getIdProof());
        }
      }
    }

    else if (e.getSource() == UpdateButton)
    {
      String name = NameTF.getText();
      String email = EmailTF.getText();
      String phoneNumber = PhoneNumberTF.getText();
      LocalDate checkIn = CheckInDP.getValue();
      LocalDate checkOut = CheckOutDP.getValue();
      String roomNumber = RoomNumberTF.getText();
      String idProof = IDProofTF.getText();

      modelManager.changeGuestInformation(name,email,phoneNumber,idProof,checkIn,checkOut,roomNumber);
      //JOptionPane.showMessageDialog(null, "Updated !");
      UpdateGuestBox();
    }
    else if (e.getSource() == ExitButton)
    {
      System.exit(1);
    }
    if (e.getSource() == BackButton)
    {
      viewHandler.openView("Homepage");
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
