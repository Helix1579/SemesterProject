package model;

import java.io.Serializable;
import java.util.ArrayList;

public class GuestList implements Serializable
{
  private ArrayList<Guest> guests;

  public GuestList()
  {
    guests = new ArrayList<Guest>();
  }

  public void add(Guest guest)
  {
    guests.add(guest);
  }

  public void set(Guest guest, int index)
  {
    guests.set(index, guest);
  }

  public Guest get(int index)
  {
    if(index < guests.size())
    {
      return guests.get(index);
    }
    else
    {
      return null;
    }
  }

  public Guest get(String name)
  {
    for (int i = 0; i < guests.size(); i++)
    {
      Guest temp = guests.get(i);

      if(temp.getName().equals(name))
      {
        return temp;
      }
    }
    return null;
  }

  public int getIndex(String name)
  {
    for (int i = 0; i < guests.size(); i++)
    {
      Guest temp = guests.get(i);

      if(temp.getName().equals(name))
      {
        return i;
      }
    }
    return -1;
  }

  public int size()
  {
    return guests.size();
  }

  public String toString()
  {
    String str = "";

    for (int i = 0; i < guests.size(); i++)
    {
      Guest temp = guests.get(i);
      str += temp + "\n";
    }
    return str;
  }
}
