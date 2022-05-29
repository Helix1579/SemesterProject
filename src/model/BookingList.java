package model;
import java.util.ArrayList;
public class BookingList
{
  private ArrayList<Booking> bookings;

  public BookingList()
  {
    bookings = new ArrayList<>();
  }

  public ArrayList<Booking> getBookings()
  {
    return bookings;
  }

  public int size()
  {
    return bookings.size();
  }

  public void addBooking(Booking booking)
  {
    bookings.add(booking);
  }

}