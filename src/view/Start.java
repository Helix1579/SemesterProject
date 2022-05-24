package view;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application
{
  @Override public void start(Stage stage) throws Exception
  {
    stage.setTitle("The Overlook Hotel");
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("Homepage.fxml"));
    Scene scene = new Scene(loader.load());
    stage.setScene(scene);
    stage.show();
  }
}
