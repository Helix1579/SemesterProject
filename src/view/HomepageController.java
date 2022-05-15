package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.event.ActionEvent;

import java.io.IOException;

public class HomepageController
{
    private Region root;

    @FXML private Button ExitButton;
    @FXML private Button CheckInButton;
    @FXML private Button CheckOutButton;
    @FXML private Button CancelBookingButton;
    @FXML private Button GuestListButton;
    @FXML private Button RoomsButton;
    @FXML private Button UpdateInfoButton;
    @FXML private AnchorPane rootPane;

    public void init(Region root)
    {
        this.root = root;
    }
    public void handleActions(ActionEvent e) throws IOException
    {
        if(e.getSource() == CheckInButton)
        {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("abc/GuestInformation.fxml"));
            rootPane.getChildren().setAll(pane);
        }
    }
}
