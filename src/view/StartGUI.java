package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartGUI extends Application
{
    public void start(Stage window) throws Exception
    {
        window.setTitle("OverLook Hotel");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("view/Check_In.fxml"));
        Scene scene = new Scene(loader.load());
        window.setScene(scene);
        window.show();
    }
}
