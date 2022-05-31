package model;

public class Rooms
{
  private String Normal;
  private String King;
  private String Twin;
  private String Single;
  private String Double;
  private String Triple;
  private String RoomType;
  private int RoomNumber;
  private  int RoomPrice;

  public Rooms( String King , String Twin , String SingleBed , String DoubleBed ,String  TripleBed , String RoomType , int RoomNumber, int RoomPrice)
  {

    this.King = King;
    this.Twin = Twin;
    this.Single = SingleBed;
    this.Double = DoubleBed;
    this.Triple = TripleBed;
    this.RoomType = RoomType;
    this.RoomNumber = RoomNumber;
    this.RoomPrice = RoomPrice;
  }

  public String getNormal()
  {
    return Normal;
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
    return Single;
  }

  public String getDoubleBed()
  {
    return Double;
  }

  public String getTripleBed()
  {
    return Triple;
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
    this.Single = singleBed;
  }

  public void setDoubleBed(String doubleBed)
  {
    this.Double = doubleBed;
  }

  public void setTripleBed(String tripleBed) {this.Triple= tripleBed;}

  public void setRoomNo(int roomNumber)
  {
    this.RoomNumber = roomNumber;
  }

  public void setRoomType(String roomType)
  {
    this.RoomType = roomType;
  }

  public void setRoomPrice(int RoomPrice){this.RoomPrice = RoomPrice;}

  public void setNormal(String normal)
  {
    Normal = normal;
  }

  public boolean equals (Object obj)
  {
    if (!(obj instanceof Rooms))
    {
      return false;
    }

    Rooms other = (Rooms) obj;

    return other.Normal == Normal && other.King == King && other.Twin == Twin && other.Single == Single && other.Double == Double && other.Triple == Triple;
  }

  public String toString()
  {
    return   Normal + " " + King + " " + Twin + " " + Single + " " + Double + " " + Triple;
  }


  {
  }
}
