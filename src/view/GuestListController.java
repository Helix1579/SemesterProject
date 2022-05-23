package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.GuestList;
import model.GuestModelManager;

public class GuestListController
{
  private GuestModelManager modelManager;

  @FXML private Button getAllGuest;
  @FXML private Button exitButton;
  @FXML private TextArea allGuestArea;

  public void init(GuestModelManager modelManager)
  {
    this.modelManager = modelManager;
    reload();
  }

  public void reload()
  {
    if ((modelManager != null))
    {
      update();
    }
  }
  public void update()
  {
    GuestList guests= modelManager.getAllGuest();
    allGuestArea.setText(guests.toString());
    allGuestArea.setEditable(false);
  }
  public void handleAction(ActionEvent e)
  {
    if(e.getSource() == getAllGuest)
    {
      update();
    }
    else if (e.getSource() == exitButton)
    {
      System.exit(1);
    }
  }
}
