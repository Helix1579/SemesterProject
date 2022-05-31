package model;

import java.util.ArrayList;

/**
 * a class containing list of room objects
 * @author  Ivan
 * @version 2.0
 */
public class RoomList
{
  private ArrayList<Rooms> rooms;

  /**
   * No-arguement constructor initializing the RoomList
   */
  public RoomList()
  {
    rooms = new ArrayList<Rooms>();
  }

  /**
   * to add rooms to the Roomlist
   * @param rooms the rooms to replace with
   */
  public void addRooms(Rooms rooms)
  {
    this.rooms.add(rooms);
  }

  /**
   * to get number of rooms in the roomlist
   * @return the size of RoomList.
   */
  public int getNumberOfRooms()
  {
    return  rooms.size();
  }

  /**
   * to get the rooms in Roomlist by position of index
   * @param index the index to replace with.
   * @return the room at the position of index from the Roomlist
   */
  public Rooms getRooms(int index)
  {
    return rooms.get(index);
  }

  /**
   * gets room from the RoomList to a new Array room
   * @return the roomList in form of array.
   */
  public Rooms[] getAllRooms()
  {
    return rooms.toArray(new Rooms[getNumberOfRooms()]);
  }

  /**
   *
   * @return the number of rooms in Roomlist.
   */
  public int size()
  {
    return rooms.size();
  }
  public  void add(Rooms rooms){this.rooms.add(rooms);}

  public Rooms get(int i)
  {
    if (i<rooms.size())
    {
      return rooms.get(i);

    }
    else
    {
      return null;
    }
  }
}
