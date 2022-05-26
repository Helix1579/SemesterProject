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
  @FXML private TableView<GuestList> allGuestTable;
  private TableView.TableViewSelectionModel selectionModel;
  private TableColumn<GuestList,String> nameCol;
  private TableColumn<GuestList,String> roomNumCol;
  private TableColumn<GuestList,String> CheckOutCol;
  private TableColumn<GuestList,String> phNumCol;
  private TableColumn<GuestList,String> CheckInCol;

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

  }

  public void handleAction(ActionEvent e)
  {
    if (e.getSource() == exitButton)
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
