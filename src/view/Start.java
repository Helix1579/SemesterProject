package view;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.GuestModelManager;

public class Start extends Application
{
   public void start(Stage stage) throws Exception
  {
    GuestModelManager modelManager = new GuestModelManager("Guest.bin");
    ViewHandler viewHandler = new ViewHandler(modelManager);
    viewHandler.start(stage);
  }
}
