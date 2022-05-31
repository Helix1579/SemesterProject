package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.Guest;
import model.GuestList;
import model.GuestModelManager;
import model.RoomList;

import java.time.LocalDate;
import java.time.Period;

/**
 *  Class containing all the action events happening at checkOut page
 * @author Vatsal Jariwala
 * @version 2.0
 */
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
  @FXML private TextField EmailTF;
  @FXML private TextField PriceTF;
  @FXML private TextField PhoneTF;
  @FXML private ComboBox<Guest> NameCB;
  @FXML private TextField RoomTypeTF;
  @FXML private DatePicker CheckInDP;
  @FXML private DatePicker CheckOutDP;
  @FXML private CheckBox DiscountCB;
  @FXML private CheckBox SmokingCB;
  private int price;


  /**
   * Requires to switch between different pages
   * @param viewHandler the viewHandler to replace with
   * @param modelManager the modelmanager to replace with
   * @param root the root to replace with
   */
  public void init(ViewHandler viewHandler, GuestModelManager modelManager, Region root)
  {
    this.modelManager = modelManager;
    this.root = root;
    this.viewHandler = viewHandler;
  }

  /**
   * Gets all the Guest objects by name from the GuestList.
   */
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

  /**
   * this method contains all the action events happening on the page
   * @param e Creates and returns a copy of this event with the specified event source and target the object on which the Event initially occurred
   */
  public void eventHandler(ActionEvent e)
  {
    if(e.getSource() == SearchB)
    {
      UpdateGuestBox();
      Guest temp = NameCB.getSelectionModel().getSelectedItem();

      if(temp != null)
      {
        NameTF.setText(temp.getName());
        EmailTF.setText(temp.getEmail());
        PhoneTF.setText((temp.getPhoneNumber()));
        RoomTypeTF.setText(temp.getRoomType());
        CheckInDP.setValue(temp.getCheckInDate());
      }
    }
    else if (e.getSource() == CalcB)
    {
      int discount = 0;
      int smoking = 0;
      LocalDate checkIn = CheckInDP.getValue();
      LocalDate checkOut = CheckOutDP.getValue();
      int stay = Period.between(checkIn , checkOut).getDays();
      if (DiscountCB.isSelected())
      {
        discount += price*0.1;
      }
      if (SmokingCB.isSelected())
      {
        smoking += 25;
      }
      Guest temp = NameCB.getSelectionModel().getSelectedItem();

      if ((temp != null))
      {
        price = setPrice(temp.getRoomType());
      }
      PriceTF.setText((price * stay) + smoking - discount + "");
    }

    else if(e.getSource() == CheckoutB)
    {
      GuestList allGuest = modelManager.getAllGuest();
      allGuest.removeGuest(NameCB.getSelectionModel().getSelectedItem());
      modelManager.saveGuest(allGuest);
      UpdateGuestBox();
    }

    else if(e.getSource() == ExitB)
    {
      System.exit(1);
    }
    else if (e.getSource() == BackB)
    {
      viewHandler.openView("Homepage");
    }

  }
  public int setPrice(String type)
  {
    if (type.equals("SingleSuite"))
    {
      price += 259;
    }
    if (type.equals("DoubleSuite"))
    {
      price += 339;
    }
    if (type.equals("TripleSuite"))
    {
      price += 399;
    }
    if (type.equals("Normal"))
    {
      price += 129;
    }
    if (type.equals("King"))
    {
      price += 169;
    }
    if (type.equals("Twin"))
    {
      price += 169;
    }
    return price;
  }

  public void reset()
  {

  }

  public Region getRoot()
  {
    return root;
  }
}
