package model;

import java.util.ArrayList;

public class RoomList
{
  private ArrayList<Rooms> rooms;

  public RoomList()
  {

    rooms = new ArrayList<Rooms>();
  }
  public void addRooms(Rooms rooms){
    rooms.add(rooms);
  }
  public int getNumberOfRooms(){
    return  rooms.size();
  }
public Rooms getRooms(int index){
    return rooms.get(index);
}
public Rooms[] getAllRooms(){
    return rooms.toArray(new Rooms[getNumberOfRooms()]);


}
}
