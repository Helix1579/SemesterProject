package main;

import model.Guest;
import model.GuestList;
import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

public class InitialData
{
  public static void main(String[] args)
  {
    GuestList guests = new GuestList();
    String[] guestArray = null;

    try
    {
      guestArray = MyFileHandler.readArrayFromTextFile("guest.txt");

      for (int i = 0; i < guestArray.length; i++)
      {
        String temp = guestArray[i];
        String[] tempArray = temp.split(" , ");
        String name = tempArray[0];
        String address = tempArray[1];
        String dateOfBirth = tempArray[2];
        String phoneNumber = tempArray[3];
        String nationality = tempArray[4];
        String idProof = tempArray[5];
        LocalDate checkInDate = LocalDate.parse(tempArray[6]);
        LocalDate checkOutDate = LocalDate.parse(tempArray[7]);
        String roomType = tempArray[8];
        String roomNumber = tempArray[9];

        guests.add(new Guest(name, address, dateOfBirth, phoneNumber, nationality, idProof, checkInDate, checkOutDate, roomType, roomNumber));
      }
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File was not found, or could not be opened");
    }

    try
    {
      MyFileHandler.writeToBinaryFile("guests.bin", guests);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("Error opening file ");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file ");
    }

    System.out.println("Done");
  }
}
