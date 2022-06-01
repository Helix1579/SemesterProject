package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *  A class containing a list of guest objects.
 * @author Yashraj Mashruwala
 * @version 2.0
 */

public class GuestList implements Serializable
{
  private ArrayList<Guest> guests;

  /**
   * No-arguement constructor initializing the Guestlist.
   */
  public GuestList()
  {
    guests = new ArrayList<Guest>();
  }

  /**
   * Adds a guest to the list
   * @param guest the guest to add to the list
   */
  public void add(Guest guest)
  {
    guests.add(guest);
  }

  /**
   * replaces the guest object at index with the guest
   * @param guest the guest to replace with.
   * @param index the position in the list that will be replaced.
   */
  public void set(Guest guest, int index)
  {
    guests.set(index, guest);
  }

  /**
   * Gets a guest object from position index from the list.
   * @param index the position in the list of the guest object
   * @return the student at index if one exists , else null
   */
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

  /**
   * gets a guest object by name from the list
   * @param name the name to replace with
   * @return the guest if one exists , else null.
   */
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

  /**
   * gets index of guest objects by name from thr list
   * @param name the name to replace with.
   * @return the index of guest if one exists , else null.
   */
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

  /**
   * gets size of the guestlist.
   * @return the size of guestlist.
   */
  public int size()
  {
    return guests.size();
  }

  /**
   * gets a string representation of the guestList.
   * @return a string containing information about all Student objects in the list
   */
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
  public void removeGuest(Guest guest)
  {
    guests.remove(guest);
  }
}
