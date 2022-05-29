package model;

public class Rooms
{

  private int King;
  private int Twin;
  private int SingleBed;
  private int doubleBed;
  private int tripleBed;
  private String RoomType;
  private int RoomNo;

  public Rooms( int King , int Twin , int SingleBed , int doubleBed , int tripleBed , String RoomType , int RoomNo)
  {

    this.King = King;
    this.Twin = Twin;
    this.SingleBed = SingleBed;
    this.doubleBed = doubleBed;
    this.tripleBed = tripleBed;
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
    return doubleBed;
  }

  public int getTripleBed()
  {
    return tripleBed;
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
    this.doubleBed = doubleBed;
  }

  public void setTripleBed(int tripleBed)
  {
    this.tripleBed = tripleBed;
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

    return  other.King == King && other.Twin == Twin && other.SingleBed ==SingleBed && other.doubleBed == doubleBed && other.tripleBed == tripleBed;
  }

  public String toString()
  {
    return   King + Twin + SingleBed + doubleBed + tripleBed + " ";
  }


  {
  }

  public void add(Rooms rooms)
  {
  }
}
