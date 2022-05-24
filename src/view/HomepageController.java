package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;

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


    public void EventHandler ( ActionEvent e)
    {
        if(e.getSource() == ExitButton)
        {
            System.exit(1);
        }
    }

}
