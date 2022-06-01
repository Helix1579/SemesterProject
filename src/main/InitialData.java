package main;

import model.Guest;
import model.GuestList;
import model.RoomList;
import model.Rooms;
import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

/**
 * To write from teext file to binary file and also some initial data to start the program
 * @author Vatsal Jariwala
 * @version 2.0
 */
public class InitialData
{
  public static void main(String[] args)
  {
    GuestList guests = new GuestList();
    RoomList rooms = new RoomList();
    String[] guestArray = null;
    String[] roomsArray = null;

    try
    {
      guestArray = MyFileHandler.readArrayFromTextFile("Guest.txt");

      for (int i = 0; i < guestArray.length; i++)
      {
        String temp = guestArray[i];
        String[] tempArray = temp.split(" , ");
        String name = tempArray[0];
        String email = tempArray[1];
        LocalDate dateOfBirth = LocalDate.parse(tempArray[2]);
        String phoneNumber = tempArray[3];
        String nationality = tempArray[4];
        String idProof = tempArray[5];
        LocalDate checkInDate = LocalDate.parse(tempArray[6]);
        LocalDate checkOutDate = LocalDate.parse(tempArray[7]);
        String roomType = tempArray[8];
        String roomNumber = tempArray[9];

        guests.add(new Guest(name, email, dateOfBirth, phoneNumber, nationality,
            idProof, checkInDate, checkOutDate, roomType, roomNumber));
      }
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File was not found, or could not be opened");
    }

    try
    {
      roomsArray = MyFileHandler.readArrayFromTextFile("Rooms.txt");

      for (int i = 0; i < roomsArray.length; i++)
      {
        String temp = roomsArray[i];
        String[] tempArray = temp.split(" , ");
        String roomNumber = tempArray[0];
        String roomType = tempArray[1];
        String roomPriceTemp = tempArray[2];
        double roomPrice = Double.parseDouble(roomPriceTemp);

        rooms.add(new Rooms(roomNumber, roomType, roomPrice));
      }
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File was not found, or could not be opened");
    }
    try
    {
      MyFileHandler.writeToBinaryFile("Guests.bin", guests);
      MyFileHandler.writeToBinaryFile("Rooms.bin", rooms);
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
