package model;

public class Booking
{
  private Guest guest;
  public Booking(Guest guest){
    this.guest = guest;
  }

  public void setGuest(Guest guest){
    this.guest = guest;
  }
  public Guest getGuest(){
    return guest;
  }
 /* public void  setRoom(Room room){
    this.room = room;

  }
  public Room getRoom(){
    return room;
  }*/
  public  boolean equals(Object obj){
    if(!(obj instanceof Booking)){
      return false;
    }
    Booking other = (Booking)obj;
    return guest.equals(other.guest);
  }
}

