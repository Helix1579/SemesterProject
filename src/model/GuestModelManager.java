package model;

import utils.MyFileHandler;

import java.io.*;

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
  //public GuestList getGuestFromName(String name)
  {

  }
}
