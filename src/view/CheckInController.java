package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.GuestModelManager;

import java.io.IOException;

public class CheckInController
{
  private GuestModelManager modelManager;
  @FXML
  public RadioButton King;
  @FXML
  public RadioButton Twin;
  @FXML
  public RadioButton SingleBed;
  @FXML
  public RadioButton DoubleBed;
  @FXML
  public RadioButton TripleBed;
  @FXML
  public ToggleGroup roomType;

  @FXML
  private TextField nameTF, phoneTF,emailTF,nationalityTF,idTF;

  @FXML private DatePicker dateOfBirthDP, CheckInDateDP, CheckOutDateDP;

  @FXML private Label welcomeText;

  public String getRoomCapacityValue()
  {
    String roomCapacity = null;
    if (single.isSelected())
    {
      roomCapacity = "Single Bed";
    }
    else if (doublebed.isSelected())
    {
      roomCapacity = "Double";
    }
    else if (triplebed.isSelected())
    {
      roomCapacity = "Three Beds";
    }
    return roomCapacity;
  }


  public String getRoomTypeValue()
  {
    String roomType = null;
    if (King.isSelected())
    {
      roomType = "King";
    }
    else if (Twin.isSelected())
    {
      roomType = "Twin";
    }

    return roomType;
  }

}