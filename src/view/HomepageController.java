package view;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;

import model.GuestModelManager;
import java.io.IOException;

/**
 *  Class containing all the action events happening at GuestList page
 * @author Dan Chisaru
 * @version 2.0
 */
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


    /**
     * Requires to switch between different pages
     * @param viewHandler the viewHandler to replace with
     * @param modelManager the modelmanager to replace with
     * @param root the root to replace with
     */
    public void init(ViewHandler viewHandler, GuestModelManager modelManager, Region root)
    {
        this.modelManager = modelManager;
        this.root = root;
        this.viewHandler = viewHandler;
    }


    /**
     * this method contains all the action events happening on the page
     * @param e Creates and returns a copy of this event with the specified event source and target the object on which the Event initially occurred
     */
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
