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
  private Region root;
  private ViewHandler viewHandler;

  private GuestModelManager modelManager;
  @FXML public RadioButton King;
  @FXML public RadioButton Twin;
  @FXML public RadioButton SingleBed;
  @FXML public RadioButton DoubleBed;
  @FXML public RadioButton TripleBed;
  @FXML public ToggleGroup roomType;
  @FXML private Button CheckInButton;
  @FXML private TextField nameTF, phoneTF,emailTF,nationalityTF,idTF,roomNumberTF;
  @FXML private DatePicker dateOfBirthDP, CheckInDateDP, CheckOutDateDP;
  @FXML private Button backButton;

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

       modelManager.addGuest(new Guest(name,email, dateOfBirth,phone,nationality,id,CheckInDate,CheckOutDate,roomType,roomNumber));
     }
     if (e.getSource() == backButton)
     {
       viewHandler.openView("Homepage");
     }
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
    if (SingleBed.isSelected())
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
    return roomType;
  }
  public void reset()
  {

  }

  public Region getRoot()
  {
    return root;
  }
}