package model;

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


  public String getKing()
  {
    return King;
  }

  public String getTwin()
  {
    return Twin;
  }

  public String getSingleBed()
  {
    return SingleBed;
  }

  public String getDoubleBed()
  {
    return DoubleBed;
  }

  public String getTripleBed()
  {
    return TripleBed;
  }

  public int getRoomNo()
  {
    return RoomNumber;
  }

  public String getRoomType()
  {
    return RoomType;
  }

  public  int getRoomPrice(){return RoomPrice;}



  public void setKing(String king) {this.King = king;}

  public void setTwin(String twin)
  {
    this.Twin = twin;
  }

  public void setSingleBed(String singleBed)
  {
    this.SingleBed = singleBed;
  }

  public void setDoubleBed(String doubleBed)
  {
    this.DoubleBed = doubleBed;
  }

  public void setTripleBed(String tripleBed) {this.TripleBed = tripleBed;}

  public void setRoomNo(int roomNumber)
  {
    this.RoomNumber = roomNumber;
  }

  public void setRoomType(String roomType)
  {
    this.RoomType = roomType;
  }

  public void setRoomPrice(int RoomPrice){this.RoomPrice = RoomPrice;}

  public boolean equals (Object obj)
  {
    if (!(obj instanceof Rooms))
    {
      return false;
    }

    Rooms other = (Rooms) obj;

    return  other.King == King && other.Twin == Twin && other.SingleBed ==SingleBed && other.DoubleBed == DoubleBed && other.TripleBed == TripleBed;
  }

  public String toString()
  {
    return   King + Twin + SingleBed + DoubleBed + TripleBed + " ";
  }


  {
  }
}
