package model;

/**
 * a class containing all room objects
 * @author Dan Chisaru
 * @version 2.0
 */
public class Rooms
{
  private String RoomNumber;
  private String RoomPrice;
  private String RoomType;

  /**
   * multiple arguement constructor initializing room objects
   * @param roomType the rooomtype to replace with
   * @param roomNumber the roomnumber to replace with
   * @param roomPrice the roomprice to replace with
   */
  public Rooms(String roomNumber, String roomType, String roomPrice)
  {
    this.RoomType = RoomType;
    this.RoomNumber = RoomNumber;
    this.RoomPrice = RoomPrice;
  }
  /**
   *
   * @return the roomno
   */
  public String getRoomNo()
  {
    return RoomNumber;
  }

  /**
   *
   * @return the room type
   */
  public String getRoomType()
  {
    return RoomType;
  }

  /**
   *
   * @return the room price
   */
  public String getRoomPrice(){return RoomPrice;}

  /**
   *
   * @param roomNumber the roomNumber to replace with.
   */
  public void setRoomNo(String  roomNumber)
  {
    this.RoomNumber = roomNumber;
  }

  /**
   *
   * @param roomType the roomType to replace with
   */
  public void setRoomType(String roomType)
  {
    this.RoomType = roomType;
  }

  /**
   *
   * @param RoomPrice the roomPrice to replace with
   */
  public void setRoomPrice(String RoomPrice){this.RoomPrice = RoomPrice;}

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

    return other.RoomNumber.equals(RoomNumber) && other.RoomPrice.equals(RoomPrice) && other.RoomType.equals(RoomType);
  }

  /**
   * gets a string representation of the room objects
   * @return a string containing information about all room objects.
   */
  public String toString()
  {
    return  RoomNumber + RoomType + RoomPrice;
  }

}
