package model;

import java.io.Serializable;

/**
 * a class containing all room objects
 * @author Dan Chisaru
 * @version 2.0
 */
public class Rooms implements Serializable
{
  private String roomNumber;
  private double roomPrice;
  private String roomType;

  /**
   * multiple arguement constructor initializing room objects
   * @param roomType the rooomtype to replace with
   * @param roomNumber the roomnumber to replace with
   * @param roomPrice the roomprice to replace with
   */
  public Rooms(String roomNumber, String roomType, double roomPrice)
  {
    this.roomType = roomType;
    this.roomNumber = roomNumber;
    this.roomPrice = roomPrice;
  }
  /**
   *
   * @return the roomno
   */
  public String getRoomNumber()
  {
    return roomNumber;
  }

  /**
   *
   * @return the room type
   */
  public String getRoomType()
  {
    return roomType;
  }

  /**
   *
   * @return the room price
   */
  public double getRoomPrice(){return roomPrice;}

  /**
   *
   * @param roomNumber the roomNumber to replace with.
   */
  public void setRoomNumber(String  roomNumber)
  {
    this.roomNumber = roomNumber;
  }

  /**
   *
   * @param roomType the roomType to replace with
   */
  public void setRoomType(String roomType)
  {
    this.roomType = roomType;
  }

  /**
   *
   * @param RoomPrice the roomPrice to replace with
   */
  public void setRoomPrice(double RoomPrice){this.roomPrice = RoomPrice;}

  /**
   *
   * @param obj the object to compare wtih guest objects
   * @return true if the bolean object represents the same value as room object
   */
  public boolean equals (Object obj)
  {
    if (!(obj instanceof Rooms))
    {
      return false;
    }

    Rooms other = (Rooms) obj;

    return other.roomNumber.equals(roomNumber) && other.roomPrice == roomPrice && other.roomType.equals(roomType);
  }

  /**
   * gets a string representation of the room objects
   * @return a string containing information about all room objects.
   */
  public String toString()
  {
    return  roomNumber + roomType + roomPrice;
  }

}
