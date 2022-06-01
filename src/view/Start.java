package view;

import javafx.application.Application;
import javafx.stage.Stage;
import model.GuestModelManager;
import model.RoomModelManager;

import java.io.IOException;

public class Start extends Application

{
  public void start(Stage stage) throws IOException
  {
    GuestModelManager modelManager = new GuestModelManager("Guests.bin");
    RoomModelManager roomModelManager = new RoomModelManager("Rooms.bin");
    ViewHandler viewHandler = new ViewHandler(modelManager, roomModelManager);
    viewHandler.start(stage);
  }
}
