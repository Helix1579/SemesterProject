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
  @FXML public RadioButton single;
  @FXML public RadioButton doublebed;
  @FXML public RadioButton triplebed;
  @FXML public RadioButton normal;
  @FXML public RadioButton suit;
  @FXML public ToggleGroup roomType;
  @FXML public ToggleGroup roomCapacity;
  @FXML private TextField nameTextField, phoneTextField;
  @FXML private Button CheckInB;
  @FXML DatePicker CheckInDP;
  @FXML DatePicker CheckOutDP;

  @FXML private Label welcomeText;

  @FXML protected void onHelloButtonClick()
  {
    welcomeText.setText("Welcome to JavaFX Application!");
  }

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
    if (normal.isSelected())
    {
      roomType = "Normal";
    }
    else if (suit.isSelected())
    {
      roomType = "Suit";
    }

    return roomType;
  }

}