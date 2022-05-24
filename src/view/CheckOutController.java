package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Guest;
import model.GuestList;
import model.GuestModelManager;

import java.time.LocalDate;
import java.time.Period;

public class CheckOutController
{
  private GuestModelManager modelManager;
  @FXML private Button ExitB;
  @FXML private TextField NameTF;
  @FXML private Button SearchB;
  @FXML private Button CalcB;
  @FXML private Button BackB;
  @FXML private Button CheckoutB;
  @FXML private TextField AddressTF;
  @FXML private TextField PriceTF;
  @FXML private TextField PhoneTF;
  @FXML private ComboBox<Guest> NameCB;
  @FXML private DatePicker DateOfbirthDP;
  @FXML private DatePicker CheckinDP;
  @FXML private DatePicker CheckoutDP;

  public void init(GuestModelManager modelManager)
  {
    this.modelManager = modelManager;
  }

  public void UpdateGuestBox()
  {
    int index = NameCB.getSelectionModel().getSelectedIndex();
    NameCB.getItems().clear();
    GuestList guests = modelManager.getAllGuest();
    for(int i =0; i<guests.size();i++)
    {
      NameCB.getItems().add(guests.get(i));
    }
    if(index == -1 && NameCB.getItems().size() > 0)
    {
      NameCB.getSelectionModel().select(0);
    }
    else
    {
      NameCB.getSelectionModel().select(index);
    }
  }

  public void eventhandler(ActionEvent e)
  {
    if(e.getSource() == SearchB)
    {
      UpdateGuestBox();
      Guest temp = NameCB.getSelectionModel().getSelectedItem();

      if(temp != null)
      {
        NameTF.setText(temp.getName());
        AddressTF.setText(temp.getAddress());
        PhoneTF.setText((temp.getPhoneNumber()));
        DateOfbirthDP.setValue(temp.getDateOfBirth());
        CheckinDP.setValue(temp.getCheckInDate());
      }
    }
    else if (e.getSource() == CalcB)
    {
      LocalDate checkIn = CheckinDP.getValue();
      LocalDate checkOut = CheckoutDP.getValue();
      int stay = Period.between(checkIn , checkOut).getDays();
    }
  }

}
