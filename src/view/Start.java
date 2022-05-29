package view;

import javafx.application.Application;
import javafx.stage.Stage;
import model.GuestModelManager;

import java.io.IOException;

public class Start extends Application

{
  public void start(Stage stage) throws IOException
  {
    GuestModelManager modelManager = new GuestModelManager("guest.bin");
    ViewHandler viewHandler = new ViewHandler(modelManager);
    viewHandler.start(stage);
  }
}
