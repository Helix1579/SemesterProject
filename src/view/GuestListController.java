package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;
import model.Guest;
import model.GuestList;
import model.GuestModelManager;

import java.time.LocalDate;

public class GuestListController extends Tab
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
  private TableColumn<GuestList,LocalDate> CheckOutCol;
  private TableColumn<GuestList,String> phNumCol;
  private TableColumn<GuestList,LocalDate> CheckInCol;
  private MyActionListener listener;

  public void init(ViewHandler viewHandler, GuestModelManager modelManager, Region root)
  {
    this.modelManager = modelManager;
    this.root = root;
    this.viewHandler = viewHandler;
    reload();
  }

  public void AllGuest(GuestModelManager modelManager)
  {
    this.modelManager = modelManager;
    listener = new MyActionListener();

    allGuestTable = new TableView<GuestList>();
    selectionModel = allGuestTable.getSelectionModel();

    nameCol = new TableColumn<GuestList, String>("Name");
    nameCol.setCellValueFactory(new PropertyValueFactory<GuestList, String>("name"));
    nameCol.setPrefWidth(100);

    roomNumCol = new TableColumn<GuestList, String>("Room No.");
    roomNumCol.setCellValueFactory(new PropertyValueFactory<GuestList, String>("roomNumber"));
    roomNumCol.setPrefWidth(100);

    CheckInCol = new TableColumn<GuestList, LocalDate>("Check-In Date");
    CheckInCol.setCellValueFactory(new PropertyValueFactory<GuestList, LocalDate>("checkInDate"));
    CheckInCol.setPrefWidth(100);

    CheckOutCol = new TableColumn<GuestList, LocalDate>("Check-Out Date");
    CheckOutCol.setCellValueFactory(new PropertyValueFactory<GuestList, LocalDate>("checkOutDate"));
    CheckOutCol.setPrefWidth(100);

    phNumCol = new TableColumn<GuestList, String>("Phone No.");
    phNumCol.setCellValueFactory(new PropertyValueFactory<GuestList, String>("phoneNumber"));
    phNumCol.setPrefWidth(100);
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
    allGuestTable.getItems().clear();
    GuestList guests = modelManager.getAllGuest();

    for (int i = 0; i < guests.size(); i++)
    {
      //allGuestTable.getItems().add(guests.get(i));
    }
  }

  public void handleAction(ActionEvent e)
  {
    if (e.getSource() == exitButton)
    {
      System.exit(1);
    }
  }

  private class MyActionListener implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      if (e.getSource() == getAllGuest)
      {
        update();
      }
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
