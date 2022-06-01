package model;

import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * A class containing the methods of room objects
 * @author Ivan
 * @version 2.0
 */
public class RoomModelManager

{
  private String fileName;

  /**
   * A single arguement constructor initializing the filename
   * @param fileName the filename to replace with
   */
  public RoomModelManager(String fileName)
  {
    this.fileName = fileName;
  }

  /**
   * gets all the rooms in the Roomlist
   * @return the Roomlist.
   */
  public RoomList getAllRooms()
  {
    RoomList allRooms = new RoomList();

    try
    {
      allRooms = (RoomList) MyFileHandler.readFromBinaryFile("Rooms.bin");
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
    return allRooms;
  }
}
