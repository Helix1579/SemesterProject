package view;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;

import model.GuestModelManager;
import java.io.IOException;

public class HomepageController
{
    private GuestModelManager modelManager;
    private Region root;
    private ViewHandler viewHandler;

    @FXML private Button ExitButton;
    @FXML private Button CheckInButton;
    @FXML private Button CheckOutButton;
    @FXML private Button CancelBookingButton;
    @FXML private Button GuestListButton;
    @FXML private Button RoomsButton;
    @FXML private Button UpdateInfoButton;

    public void reset()
    {
    }

    public Region getRoot()
    {
        return root;
    }

    public void init(ViewHandler viewHandler, GuestModelManager modelManager, Region root)
    {
        this.modelManager = modelManager;
        this.root = root;
        this.viewHandler = viewHandler;
    }

    public void handleAction(ActionEvent e) throws IOException
    {
        if ((e.getSource()) == ExitButton)
        {
            System.exit(1);
        }
        if (e.getSource() == CheckInButton)
        {
            viewHandler.openView("CheckIn");
        }
        if (e.getSource() == CheckOutButton)
        {
            viewHandler.openView("CheckOut");
        }
        if (e.getSource() == CancelBookingButton)
        {
            viewHandler.openView("CancelBooking");
        }
        if (e.getSource() == GuestListButton)
        {
            viewHandler.openView("GuestList");
        }
        if (e.getSource() == RoomsButton)
        {
            viewHandler.openView("AvailableRooms");
        }
        if (e.getSource() == UpdateInfoButton)
        {
            viewHandler.openView("GuestInfo");
        }
    }
}
