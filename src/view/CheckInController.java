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
  @FXML private RadioButton King;
  @FXML private RadioButton Twin;
  @FXML private RadioButton Normal;
  @FXML private RadioButton Single;
  @FXML private RadioButton Double;
  @FXML private RadioButton Triple;
  @FXML private ToggleGroup roomType;
  @FXML private Button CheckInButton;
  @FXML private TextField nameTF, phoneTF,emailTF,nationalityTF,idTF,roomNumberTF;
  @FXML private DatePicker dateOfBirthDP, CheckInDateDP, CheckOutDateDP;
  @FXML private Button backButton;
  @FXML private Button exitButton;

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
     if (e.getSource() == exitButton)
     {
       System.exit(1);
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
    else if(Normal.isSelected())
    {
      roomType = "Normal";
    }
    else if (Single.isSelected())
    {
      roomType = "Single Bed";
    }
    else if (Double.isSelected())
    {
      roomType = "Double Bed";
    }
    else if (Triple.isSelected())
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