package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.Guest;
import model.GuestList;
import model.GuestModelManager;

public class CancelController
{
  private GuestModelManager modelManager;

  @FXML Button BackB;
  @FXML Button CancelB;
  @FXML Button ExitB;
  @FXML Button SearchB;
  @FXML TextField NameTF;
  @FXML TextField PhoneTF;
  @FXML TextField RoomTF;
  @FXML DatePicker CheckInDP;
  @FXML DatePicker CheckOutDP;
  @FXML ComboBox<Guest> GuestCB;

  private void updateGuestBox()
  {
    int index = GuestCB.getSelectionModel().getSelectedIndex();
    GuestCB.getItems().clear();

    GuestList guests = modelManager.getAllGuest();

    for (int i = 0; i < guests.size(); i++)
    {
      GuestCB.getItems().add(guests.get(i));
    }
    if (index == -1 && GuestCB.getItems().size() > 0)
    {
      GuestCB.getSelectionModel().select(0);
    }
    else
    {
      GuestCB.getSelectionModel().select(index);
    }
  }
  public void searchHandle(ActionEvent e)
  {

  }
}
