package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;
import model.*;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *  Class containing all the action events happening at GuestList page
 * @author Yashraj Mashruwala
 * @version 2.0
 */
public class GuestListController extends Tab
{
  private ViewHandler viewHandler;
  private Region root;
  private GuestModelManager modelManager;
  private RoomModelManager roomModelManager;

  @FXML private Button getAllGuest;
  @FXML private Button exitButton;
  @FXML private TableView<Guest> allGuestTable;
  @FXML private TableColumn<Guest,String> nameCol;
  @FXML private TableColumn<Guest,String> roomNumCol;
  @FXML private TableColumn<Guest,LocalDate> CheckOutCol;
  @FXML private TableColumn<Guest,String> phNumCol;
  @FXML private TableColumn<Guest,LocalDate> CheckInCol;
  @FXML private Button backButton;

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

    nameCol.setCellValueFactory(new PropertyValueFactory<Guest, String>("name"));
    nameCol.setPrefWidth(100);

    roomNumCol.setCellValueFactory(new PropertyValueFactory<Guest, String>("roomNumber"));
    roomNumCol.setPrefWidth(100);

    CheckInCol.setCellValueFactory(new PropertyValueFactory<Guest, LocalDate>("checkInDate"));
    CheckInCol.setPrefWidth(100);

    CheckOutCol.setCellValueFactory(new PropertyValueFactory<Guest, LocalDate>("checkOutDate"));
    CheckOutCol.setPrefWidth(100);

    phNumCol.setCellValueFactory(new PropertyValueFactory<Guest, String>("phoneNumber"));
    phNumCol.setPrefWidth(100);
  }

  public void update()
  {
    allGuestTable.getItems().clear();
    GuestList guests = modelManager.getAllGuest();

    for (int i = 0; i < guests.size(); i++)
    {
      allGuestTable.getItems().add(guests.get(i));
    }
  }


  /**
   * this method contains all the action events happening on the page
   * @param e Creates and returns a copy of this event with the specified event source and target the object on which the Event initially occurred
   */
  public void handleAction(ActionEvent e)
  {
    if (e.getSource() == exitButton)
    {
      System.exit(1);
    }
    if (e.getSource() == backButton)
    {
      viewHandler.openView("Homepage");
    }
    if (e.getSource() == getAllGuest)
    {
      update();
      updateWebsite();
    }
  }

  public Region getRoot()
  {
    return root;
  }

  public void reset()
  {
  }

  public void updateWebsite()
  {
    RoomList list = roomModelManager.getAllRooms();
    for (int i = 0; i < list.size(); i++)
    {
      list.add(new Rooms(list.get(i).getRoomNumber(), list.get(i).getRoomType() , list.get(i).getRoomPrice()));
    }
    try
    {
      FileOutputStream fout = new FileOutputStream("website.txt",true);
      PrintWriter write = new PrintWriter(fout);
      write.println("<?xml version="+"1.0"+" encoding="+"UTF-8"+"?>");
      write.println("<rooms>");
      for (int i = 0; i < list.size(); i++)
      {
        write.println("<allRooms>");
        write.println("<roomNumber>" + list.get(i).getRoomNumber() + "</roomNumber");
        write.println("<roomType>" + list.get(i).getRoomType() + "</roomType");
        write.println("<roomPrice>" + list.get(i).getRoomPrice() + "</roomPrice");
        write.println("</allRooms>");
      }
      write.println("</rooms>");
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e.getMessage());
    }
  }
}
