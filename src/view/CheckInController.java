package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.Booking;
import model.Guest;
import model.GuestModelManager;

import java.io.IOException;
import java.time.LocalDate;

public class CheckInController
{
  private GuestModelManager modelManager;
  @FXML
  public RadioButton singlebed;
  @FXML
  public RadioButton doublebed;
  @FXML
  public RadioButton triplebed;
  @FXML
  public RadioButton king;
  @FXML
  public RadioButton twin;
  @FXML
  public ToggleGroup roomType;
  @FXML
  private TextField nameText, phoneText,  nationalityText, idText, emailText;
  @FXML
  private DatePicker dateOfBirthValue, CheckInDateValue, CheckOutDateValue;

  @FXML private Label welcomeText;

  @FXML protected void onHelloButtonClick()

  {
    welcomeText.setText("Welcome to JavaFX Application!");
  }


  public String getRoomTypeValue()
  {
    String roomType = null;
    if (king.isSelected())
    {
      roomType = "King";
    }
    else if (twin.isSelected())
    {
      roomType = "Twin";
    }
    else if (singlebed.isSelected())
    {
      roomType = "Single bed";
    }
    else if (doublebed.isSelected())
    {
      roomType = "Double bed";
    }
    else if (triplebed.isSelected())
    {
      roomType = "Triple bed";
    }

    return roomType;
  }
@FXML private void checkInButtonPressed(){
    String name= nameText.getText();
    String id = idText.getText();
    String nationality = nationalityText.getText();
    String phone = phoneText.getText();
    String email = emailText.getText();
  LocalDate dateOfBirth = dateOfBirthValue.getValue();
LocalDate CheckInDate = CheckInDateValue.getValue();
LocalDate CheckOutDate = CheckOutDateValue.getValue();
  Guest guest = new Guest(name,dateOfBirth, phone, nationality,id,CheckInDate, CheckOutDate, getRoomTypeValue());
  modelManager.addGuest(guest);

}

}