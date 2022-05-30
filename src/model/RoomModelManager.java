package model;

import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RoomModelManager

{

  private String fileName;

  public RoomModelManager(String fileName)
  {
    this.fileName = fileName;
  }

  public RoomList getAllRooms()
  {
    RoomList allRooms = new RoomList();

    try
    {
      allRooms = (RoomList) MyFileHandler.readFromBinaryFile("rooms.bin");
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
