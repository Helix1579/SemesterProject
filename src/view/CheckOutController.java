package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.Guest;
import model.GuestList;
import model.GuestModelManager;

import java.time.LocalDate;
import java.time.Period;

public class CheckOutController
{
  private GuestModelManager modelManager;
  private Region root;
  private ViewHandler viewHandler;

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
  @FXML private TextField RoomTypeTF;
  @FXML private DatePicker CheckinDP;
  @FXML private DatePicker CheckoutDP;

  public void init(ViewHandler viewHandler, GuestModelManager modelManager, Region root)
  {
    this.modelManager = modelManager;
    this.root = root;
    this.viewHandler = viewHandler;
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

  public void eventHandler(ActionEvent e)
  {
    if(e.getSource() == SearchB)
    {
      UpdateGuestBox();
      Guest temp = NameCB.getSelectionModel().getSelectedItem();

      if(temp != null)
      {
        NameTF.setText(temp.getName());
        PhoneTF.setText((temp.getPhoneNumber()));
        RoomTypeTF.setText(temp.getRoomType());
        CheckinDP.setValue(temp.getCheckInDate());
      }
    }
    else if (e.getSource() == CalcB)
    {
      LocalDate checkIn = CheckinDP.getValue();
      LocalDate checkOut = CheckoutDP.getValue();
      int stay = Period.between(checkIn , checkOut).getDays();
    //  int total = stay * ;
      //PriceTF.setText(String.valueOf(total));
    }

    else if(e.getSource() == CheckoutB)
    {

    }

    else if(e.getSource() == ExitB)
    {
      System.exit(1);
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
