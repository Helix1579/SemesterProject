package model;

/**
 * a class containing all room objects
 * @author Dan Chisaru
 * @version 2.0
 */
public class Rooms
{

  private String King;
  private String Twin;
  private String SingleBed;
  private String DoubleBed;
  private String TripleBed;
  private String RoomType;
  private int RoomNumber;
  private  int RoomPrice;

  /**
   * multiple arguement constructor initializing room objects
   * @param King the king to replace with
   * @param Twin the twin to replace with
   * @param SingleBed the single bed to replace with
   * @param DoubleBed the single double bed to replace with
   * @param TripleBed the triple bed to replace with
   * @param RoomType the rooomtype to replace with
   * @param RoomNumber the roomnumber to replace with
   * @param RoomPrice the roomprice to replace with
   */
  public Rooms( String King , String Twin , String SingleBed , String DoubleBed ,String  TripleBed , String RoomType , int RoomNumber, int RoomPrice)
  {

    this.King = King;
    this.Twin = Twin;
    this.SingleBed = SingleBed;
    this.DoubleBed = DoubleBed;
    this.TripleBed = TripleBed;
    this.RoomType = RoomType;
    this.RoomNumber = RoomNumber;
    this.RoomPrice = RoomPrice;
  }

  /**
   *
   * @return the King
   */
  public String getKing()
  {
    return King;
  }

  /**
   *
   * @return the twin
   */
  public String getTwin()
  {
    return Twin;
  }

  /**
   *
   * @return the single bed
   */
  public String getSingleBed()
  {
    return SingleBed;
  }

  /**
   *
   * @return the double bed
   */
  public String getDoubleBed()
  {
    return DoubleBed;
  }

  /**
   *
   * @return the triple bed
   */
  public String getTripleBed()
  {
    return TripleBed;
  }

  /**
   *
   * @return the roomno
   */
  public int getRoomNo()
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
  public  int getRoomPrice(){return RoomPrice;}

  /**\
   *
   * @param king the king to replace with
   */
  public void setKing(String king) {this.King = king;}

  /**
   *
   * @param twin thee twin to replace with
   */
  public void setTwin(String twin)
  {
    this.Twin = twin;
  }

  /**
   *
   * @param singleBed the singlebed to replace with
   */
  public void setSingleBed(String singleBed)
  {
    this.SingleBed = singleBed;
  }

  /**
   *
   * @param doubleBed the doublebed to replace with.
   */
  public void setDoubleBed(String doubleBed)
  {
    this.DoubleBed = doubleBed;
  }

  /**
   *
   * @param tripleBed the triplebed to replace with
   */
  public void setTripleBed(String tripleBed) {this.TripleBed = tripleBed;}

  /**
   *
   * @param roomNumber the roomNumber to replace with.
   */
  public void setRoomNo(int roomNumber)
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
  public void setRoomPrice(int RoomPrice){this.RoomPrice = RoomPrice;}

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

    return  other.King == King && other.Twin == Twin && other.SingleBed ==SingleBed && other.DoubleBed == DoubleBed && other.TripleBed == TripleBed;
  }

  /**
   * gets a string representation of the room objects
   * @return a string containing information about all room objects.
   */
  public String toString()
  {
    return   King + Twin + SingleBed + DoubleBed + TripleBed + " ";
  }

}
