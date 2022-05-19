package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Guest;
import model.Rooms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GuestInformationController
{
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
  @FXML private ComboBox<Guest> GuestNameCB;
  @FXML private ComboBox<Rooms> RoomTypeCB;

  public void handleAction(ActionEvent e)
  {

  }
}
