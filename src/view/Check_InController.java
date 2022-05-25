package view;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.GuestModelManager;
import model.Rooms;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Check_InController
{

  private GuestModelManager modelManager;
  private Region root;
  private ViewHandler viewHandler;

  @FXML private TextField NameTF;
  @FXML private TextField AddressTF;
  @FXML private DatePicker DateOfBirthDP;
  @FXML private TextField PhoneNumberTF;
  @FXML private TextField NationalityTF;
  @FXML private TextField IDProofTF;
  @FXML private DatePicker CheckInDP;
  @FXML private DatePicker CheckOutDP;
  @FXML private RadioButton NormalRB;
  @FXML private RadioButton SuiteRB;
  @FXML private ComboBox<Rooms> RoomBox;
  @FXML private TextField RoomNoTF;
  @FXML private Button CheckInButton;
  @FXML private Button BackButton;
  @FXML private Button ExitButton;


  public void init(ViewHandler viewHandler, GuestModelManager modelManager, Region root)
  {
    this.modelManager = modelManager;
    this.root = root;
    this.viewHandler = viewHandler;
  }

  public void handleAction(ActionEvent e)
  {
    if (e.getSource() == CheckInButton)
    {
      String name = NameTF.getText();
      String address = AddressTF.getText();
      LocalDate date = DateOfBirthDP.getValue();
      String dateOfBirth = date.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
      String phoneNumber = PhoneNumberTF.getText();
      String nationality = NationalityTF.getText();
      String idProof = IDProofTF.getText();
      LocalDate checkIn = CheckInDP.getValue();
      String checkInDate = checkIn.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
      LocalDate checkOut = CheckOutDP.getValue();
      String checkOutDate = checkOut.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
      String roomType;
      if(NormalRB.isSelected())
      {
        roomType = "Normal";
      }
      else if(SuiteRB.isSelected())
      {
        roomType = "Suite";
      }
      String roomNo = RoomNoTF.getText();
    }
  }

  private void UpdateRoomBox()
  {
    int index = RoomBox.getSelectionModel().getSelectedIndex();

    RoomBox.getItems().clear();
  }

  public void reset()
  {

  }

  public Region getRoot()
  {
    return root;
  }
}