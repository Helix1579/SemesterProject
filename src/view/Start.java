/*
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
*/

package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Start extends Application

{


  @Override public void start(Stage stage) throws IOException
  {

    Parent root = FXMLLoader.load(getClass().getResource("CheckIn.fxml"));
    FXMLLoader fxmlLoader = new FXMLLoader(
       Start.class.getResource("CheckIn.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 700, 700);
    stage.setTitle("Check in");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args)
  {
    launch();
  }
}
