package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;
import model.GuestModelManager;
import model.RoomModelManager;
import model.Rooms;
import model.RoomList;

import java.awt.event.ActionListener;
import java.time.LocalDate;

public class AvailableController extends Tab
{
  private ViewHandler viewHandler;
  private Region root;
  private Rooms rooms;
  private GuestModelManager modelManager;
  private RoomModelManager roomModelManager;

  @FXML private Button getAllRooms;
  @FXML private Button exitButton;
  @FXML private TableView<Rooms> allRoomsTable;
  private TableView.TableViewSelectionModel selectionModel;
  @FXML private TableColumn<Rooms, Integer> roomNumberCol;
  @FXML private TableColumn<Rooms, String> roomTypeCol;
  @FXML private TableColumn<Rooms, Integer> roomPriceCol;

  private ActionListener listener;

  public void init(ViewHandler viewHandler,  Region root ,RoomModelManager modelManager )
  {
    roomModelManager = modelManager;
    this.rooms = rooms;
    this.root = root;
    this.viewHandler = viewHandler;
    reload();
  }

  public void AllGuest(RoomModelManager modelManager)
  {
    roomModelManager = modelManager;


    roomNumberCol.setCellValueFactory(new PropertyValueFactory<Rooms, Integer>("RoomNumber"));
    roomNumberCol.setPrefWidth(100);

    roomTypeCol.setCellValueFactory(new PropertyValueFactory<Rooms, String>("RoomType"));
    roomTypeCol.setPrefWidth(100);

    roomPriceCol.setCellValueFactory(new PropertyValueFactory<Rooms, Integer>("RoomPrice"));
    roomPriceCol.setPrefWidth(100);

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
    allRoomsTable.getItems().clear();
    RoomList rooms = roomModelManager.getAllRooms();

    for (int i = 0; i < rooms.size(); i++)
    {
      allRoomsTable.getItems().add(rooms.get(i));
    }
  }
  public void handleAction(ActionEvent e)
  {

  }


  public void reset()
  {

  }

  public Region getRoot()
  {
    return root;
  }
}