package model;

import utils.MyFileHandler;

import model.*;
import java.io.*;
import java.time.LocalDate;

/**
 * A class containing methods of guest objects.
 * @auhtor Yashraj Mashruwala
 * @version 2.0
 */

public class GuestModelManager
{
  private String fileName;

  /**
   * single arguement constructor initialising the filename
   * @param fileName the filename to replace with.
   */
  public GuestModelManager(String fileName)
  {
    this.fileName = fileName;
  }

  /**
   * gets you the list called guestlist
   * @return the guestlist containing all guest informstion.
   */
  public GuestList getAllGuest()
  {
    GuestList allGuest = new GuestList();

    try
    {
      allGuest = (GuestList)MyFileHandler.readFromBinaryFile(fileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
      catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
      catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }
    return allGuest;
  }

  /**
   * Gets guestlist by the name of guest.
   * @param name the name to replace with .
   * @return the guests from guestlist by name.
   */
  public GuestList getGuestFromName(String name)
  {
    GuestList guestFromName = new GuestList();
    GuestList getAllGuest = getAllGuest();

    for (int i = 0; i < getAllGuest.size(); i++)
    {
      if (getAllGuest.get(i).getName().equals(name))
      {
        guestFromName.add(getAllGuest.get(i));
      }
    }
    return guestFromName;
  }

  /**
   * saves the information of guest in a binary file
   * @param guests the guests to replace with.
   */
  public void saveGuest (GuestList guests)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(fileName, guests);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }

  /**
   * to change existing guest information in the guestlist
   * @param name the name to replace with.
   * @param phoneNumber the phone number to replace with.
   * @param idProof the idproof to replace with
   * @param checkInDate the checkin date to replace with.
   * @param checkOutDate the checkout date to replace with.
   * @param roomType the roomtype to replace with
   */
  public void changeGuestInformation(String name, String email ,String phoneNumber, String idProof,
      LocalDate checkInDate, LocalDate checkOutDate, String roomType)
  {
    GuestList allGuest = getAllGuest();

    for (int i = 0; i < allGuest.size(); i++)
    {
      Guest guest = allGuest.get(i);

      if (guest.getName().equals(name))
      {
        guest.setEmail(email);
        guest.setPhoneNumber(phoneNumber);
        guest.setIdProof(idProof);
        guest.setCheckInDate(checkInDate);
        guest.setCheckOutDate(checkOutDate);
        guest.setRoomType(roomType);
      }
    }
    saveGuest(allGuest);
  }

  /**
   * to add guest to guestlist
   * @param guest the guest to replace with.
   */
  public void addGuest(Guest guest)
  {
    GuestList allGuests = getAllGuest();
    allGuests.add(guest);
    saveGuest(allGuests);
  }
}


