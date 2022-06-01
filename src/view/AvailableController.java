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
  private RoomModelManager modelManager;

  @FXML private Button getAllRooms;
  @FXML private Button exitButton;
  @FXML private TableView<Rooms> allRoomsTable;
  @FXML private TableColumn<Rooms, String > roomNumberCol;
  @FXML private TableColumn<Rooms, String> roomTypeCol;
  @FXML private TableColumn<Rooms, Double> roomPriceCol;
  @FXML private Button backButton;

  public void init(ViewHandler viewHandler,  Region root ,RoomModelManager modelManager )
  {
    this.modelManager = modelManager;
    this.root = root;
    this.viewHandler = viewHandler;

    roomNumberCol.setCellValueFactory(new PropertyValueFactory<Rooms, String>("roomNumber"));
    roomNumberCol.setPrefWidth(205);

    roomTypeCol.setCellValueFactory(new PropertyValueFactory<Rooms, String>("roomType"));
    roomTypeCol.setPrefWidth(205);

    roomPriceCol.setCellValueFactory(new PropertyValueFactory<Rooms, Double>("roomPrice"));
    roomPriceCol.setPrefWidth(205);
  }

  public void update()
  {
    allRoomsTable.getItems().clear();
    RoomList rooms = modelManager.getAllRooms();

    for (int i = 0; i < rooms.size(); i++)
    {
      allRoomsTable.getItems().add(rooms.get(i));
    }

  }

  public void handleAction(ActionEvent e)
  {
    if (e.getSource() == getAllRooms)
    {
      update();
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


  public void reset()
  {

  }

  public Region getRoot()
  {
    return root;
  }
}