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
}


