package model;

import utils.MyFileHandler;

import model.*;
import java.io.*;
import java.time.LocalDate;

public class GuestModelManager
{
  private String fileName;

  public GuestModelManager(String fileName)
  {
    this.fileName = fileName;
  }

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
  public  void changeGuestInformation(String name, String phoneNumber, String idProof,
      LocalDate checkInDate, LocalDate
      checkOutDate, String roomType)
  {
    GuestList allGuest = getAllGuest();

    for (int i = 0; i < allGuest.size(); i++)
    {
      Guest guest = getAllGuest().get(i);

      if (guest.getName().equals(name))
      {
        guest.setName(name);
        guest.setPhoneNumber(phoneNumber);
        guest.setIdProof(idProof);
        guest.setCheckInDate(checkInDate);
        guest.setCheckOutDate(checkOutDate);
        guest.setRoomType(roomType);
      }
    }

    saveGuest(allGuest);
  }
  public void addGuest(Guest guest){
    GuestList allGuests = getAllGuest();
        allGuests .add(guest);
  }
}


