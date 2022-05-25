package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.GuestList;
import model.GuestModelManager;

public class GuestListController
{
  private ViewHandler viewHandler;
  private Region root;
  private GuestModelManager modelManager;

  @FXML private Button getAllGuest;
  @FXML private Button exitButton;
  @FXML private TextArea allGuestArea;

  public void init(ViewHandler viewHandler, GuestModelManager modelManager, Region root)
  {
    this.modelManager = modelManager;
    this.root = root;
    this.viewHandler = viewHandler;
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

  public Region getRoot()
  {
    return root;
  }

  public void reset()
  {
  }
}
