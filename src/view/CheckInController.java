package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.Guest;
import model.GuestModelManager;

import java.time.LocalDate;

public class CheckInController
{
  private GuestModelManager modelManager;
  private Region root;
  private ViewHandler viewHandler;

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
  @FXML private Button CheckInButton;
  @FXML
  private TextField nameTF, phoneTF,emailTF,nationalityTF,idTF,roomNumberTF;

  @FXML private DatePicker dateOfBirthDP, CheckInDateDP, CheckOutDateDP;

  @FXML private Label welcomeText;

  public void init(ViewHandler viewHandler, GuestModelManager modelManager, Region root)
  {
    this.modelManager = modelManager;
    this.root = root;
    this.viewHandler = viewHandler;
  }
  public void reset()
  {

  }

  public Region getRoot()
  {
    return root;
  }

  public void handleAction(ActionEvent e)
  {
    if (e.getSource() == CheckInButton)
    {
      String name = nameTF.getText();
      String phone = phoneTF.getText();
      String email = emailTF.getText();
      String nationality = nationalityTF.getText();
      String id = idTF.getText();
      String roomNumber = roomNumberTF.getText();
      LocalDate dateOfBirth = dateOfBirthDP.getValue();
      LocalDate CheckInDate = CheckInDateDP.getValue();
      LocalDate CheckOutDate = CheckOutDateDP.getValue();
      String roomType = getRoomTypeValue();

      modelManager.addGuest(
          new Guest(name, email, dateOfBirth, phone, nationality, id,
              CheckInDate, CheckOutDate, roomType, roomNumber));

      System.out.println(":Checked-In");
    }
  }

  public String getRoomTypeValue()
  {
    String roomType;
    if (King.isSelected())
    {
      roomType = "King";
    }
    else if (Twin.isSelected())
    {
      roomType = "Twin";
    }
    else if (SingleBed.isSelected())
    {
      roomType = "Single Bed";
    }
    else if (DoubleBed.isSelected())
    {
      roomType = "Double Bed";
    }
    else if (TripleBed.isSelected())
    {
      roomType = "Three Bed";
    }
    else
    {
      roomType = "";
    }
    return roomType;
  }
}