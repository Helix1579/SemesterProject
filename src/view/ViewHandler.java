package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.GuestModelManager;

import java.io.IOException;

public class ViewHandler
{
  private Scene scene;
  private Stage window;
  private HomepageController homepageController;
  private GuestListController guestListController;
  private GuestInformationController guestInformationController;
  private CheckInController check_inController;
  private CheckOutController checkOutController;

  private GuestModelManager modelManager;

  public ViewHandler(GuestModelManager modelManager) throws IOException
  {
    this.modelManager = modelManager;
    scene = new Scene(new Region());
  }

  public void start(Stage window)
  {
    this.window = window;
    openView("MainView");
  }

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
  }

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
    //if(check_inController == null)
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
    //else
    {
      homepageController.reset();
    }
    return homepageController.getRoot();
  }
}