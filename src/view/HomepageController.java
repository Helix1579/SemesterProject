package view;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;

import model.GuestModelManager;

import java.io.IOException;

public class HomepageController
{
    private GuestModelManager modelManager;

    @FXML private Button ExitButton;
    @FXML private Button CheckInButton;
    @FXML private Button CheckOutButton;
    @FXML private Button CancelBookingButton;
    @FXML private Button GuestListButton;
    @FXML private Button RoomsButton;
    @FXML private Button UpdateInfoButton;

}
