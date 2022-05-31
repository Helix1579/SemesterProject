package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.GuestModelManager;
import model.RoomModelManager;

import java.io.IOException;

/**
 * Class required to switch between different pages
 * @author Yashraj Mashruwala
 * @version 2.0
 */
public class ViewHandler
{
  private Scene scene;
  private Stage window;
  private HomepageController homepageController;
  private GuestListController guestListController;
  private GuestInformationController guestInformationController;
  private CheckInController check_inController;
  private CheckOutController checkOutController;
  private CancelController cancelController;
  private AvailableController availableController;

  private GuestModelManager modelManager;
  private RoomModelManager roomModelManager;

  /**
   *  Single Arguement consstructor initialising Viewhandler
   * @param modelManager the modelmanager to replace with
   * @throws IOException Constructs an IOException with null as its error detail message.
   */
  public ViewHandler(GuestModelManager modelManager) throws IOException
  {
    this.modelManager = modelManager;
    scene = new Scene(new Region());
  }
  public ViewHandler(RoomModelManager modelManager) throws IOException
  {
    this.roomModelManager = modelManager;
    scene = new Scene(new Region());
  }

  /**
   * Allows to load the stage
   * @param window the window to replace with
   */
  public void start(Stage window)
  {
    this.window = window;
    openView("Homepage");
  }

  /**
   * to switch between pages
   * @param id the id to replace with
   */
  public void openView(String id)
  {
    Region root = null;
    switch (id)
    {
      case "CheckIn":
        root = loadCheckInPage();
        break;
      case "CheckOut":
        root = loadCheckOutPage();
        break;
      case "CancelBooking":
        root = loadCancelBooking();
        break;
      case "GuestList":
        root = loadGuestList();
        break;
      case "AvailableRooms":
        //root = loadAvailableRooms();
        break;
      case "GuestInfo":
        root = loadGuestInfoPage();
        break;
      case "Homepage":
        root = loadHomepage();
        break;
    }
    scene.setRoot(root);
    String title = "";

    if(root.getUserData() !=null)
    {
      title += root.getUserData();
    }

    window.setTitle(title);
    window.setScene(scene);
    window.setWidth(root.getPrefWidth());
    window.setHeight(root.getPrefHeight());
    window.show();
  }

  /**
   *
   * @return
   */
  public Region loadCheckInPage()
  {
    if(check_inController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CheckIn.fxml"));
        Region root = loader.load();
        check_inController = loader.getController();
        check_inController.init(this, modelManager, root);
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
      }
    }
    else
    {
      check_inController.reset();
    }
    return check_inController.getRoot();
  }

  public Region loadCheckOutPage()
  {
    if(checkOutController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CheckOut.fxml"));
        Region root = loader.load();
        checkOutController = loader.getController();
        checkOutController.init(this, modelManager, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      checkOutController.reset();
    }
    return checkOutController.getRoot();
  }

  public Region loadGuestInfoPage()
  {
    if(guestInformationController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("GuestInformation.fxml"));
        Region root = loader.load();
        guestInformationController = loader.getController();
        guestInformationController.init(this, modelManager, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      guestInformationController.reset();
    }
    return guestInformationController.getRoot();
  }

  public Region loadGuestList()
  {
    if(guestListController == null)
    {
      System.out.println("Hello !!");
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("GuestList.fxml"));
        Region root = loader.load();
        guestListController = loader.getController();
        guestListController.init(this, modelManager, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      guestListController.reset();
    }
    return guestListController.getRoot();
  }

  public Region loadHomepage()
  {
    if(homepageController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Homepage.fxml"));
        Region root = loader.load();
        homepageController = loader.getController();
        homepageController.init(this, modelManager, root);
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
      }
    }
    else
    {
      homepageController.reset();
    }
    return homepageController.getRoot();
  }
  public Region loadCancelBooking()
  {
    if (cancelController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CancelBooking.fxml"));
        Region root = loader.load();
        cancelController = loader.getController();
        cancelController.init(this, modelManager, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      cancelController.reset();
    }
    return cancelController.getRoot();
  }
  /*
  public Region loadAvailableRooms()
  {
    if (availableController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("AvailableRooms.fxml"));
        Region root = loader.load();
        availableController = loader.getController();
        availableController.init(this, roomModelManager, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      availableController.reset();
    }
    return availableController.getRoot();
  }
  */
}