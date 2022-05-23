package model;

public class Rooms
{
  private int Single;
  private int King;
  private int Twin;
  private int SingleBed;
  private int doubleBed;
  private int tripleBed;

  public Rooms(int Single , int King , int Twin , int SingleBed , int doubleBed , int tripleBed)
  {
    this.Single=Single;
    this.King = King;
    this.Twin = Twin;
    this.SingleBed = SingleBed;
    this.doubleBed = doubleBed;
    this.tripleBed = tripleBed;
  }

  public int getSingle()
  {
    return Single;
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

  public void setSingle(int single)
  {
    Single = single;
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

  public boolean equasl (Object obj)
  {
    if (!(obj instanceof Rooms))
    {
      return false;
    }

    Rooms other = (Rooms) obj;

    return other.Single == Single && other.King == King && other.Twin == Twin && other.SingleBed ==SingleBed && other.doubleBed == doubleBed && other.tripleBed == tripleBed;
  }

  public String toString()
  {
    return Single + King + Twin + SingleBed + doubleBed + tripleBed + " ";
  }
}
