package model;

public class Rooms
{

  private int King;
  private int Twin;
  private int SingleBed;
  private int DoubleBed;
  private int TripleBed;
  private String RoomType;
  private int RoomNo;

  public Rooms( int King , int Twin , int SingleBed , int DoubleBed , int TripleBed , String RoomType , int RoomNo)
  {

    this.King = King;
    this.Twin = Twin;
    this.SingleBed = SingleBed;
    this.DoubleBed = DoubleBed;
    this.TripleBed = TripleBed;
    this.RoomType = RoomType;
    this.RoomNo = RoomNo;
  }


  public int getKing()
  {
    return King;
  }

  public int getTwin()
  {
    return Twin;
  }

  public int getSingleBed()
  {
    return SingleBed;
  }

  public int getDoubleBed()
  {
    return DoubleBed;
  }

  public int getTripleBed()
  {
    return TripleBed;
  }

  public int getRoomNo()
  {
    return RoomNo;
  }

  public String getRoomType()
  {
    return RoomType;
  }



  public void setKing(int king)
  {
    King = king;
  }

  public void setTwin(int twin)
  {
    Twin = twin;
  }

  public void setSingleBed(int singleBed)
  {
    SingleBed = singleBed;
  }

  public void setDoubleBed(int doubleBed)
  {
    this.DoubleBed = doubleBed;
  }

  public void setTripleBed(int tripleBed)
  {
    this.TripleBed = tripleBed;
  }

  public void setRoomNo(int roomNo)
  {
    RoomNo = roomNo;
  }

  public void setRoomType(String roomType)
  {
    RoomType = roomType;
  }

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

  public void add(Rooms rooms)
  {
  }
}
