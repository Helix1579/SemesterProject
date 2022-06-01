package model;

import javafx.scene.control.DatePicker;

import java.io.Serializable;
import java.time.LocalDate;

/****
 * A class containing all guest objects
 * @author Dan Chisaru
 * @version 2.0
 */

public class Guest implements Serializable
{
  private String name;
  private String email;
  private LocalDate dateOfBirth;
  private String phoneNumber;
  private String nationality;
  private String idProof;
  private LocalDate checkInDate;
  private LocalDate checkOutDate;
  private String roomType;
  private String roomNumber;

  /**
   *arguement  constructor initializing Guest objects.
   */

  public Guest(String name, String email, LocalDate dateOfBirth, String phoneNumber, String nationality, String idProof,
      LocalDate checkInDate, LocalDate checkOutDate,String roomType, String roomNumber)
  {
    this.name = name;
    this.email = email;
    this.dateOfBirth = dateOfBirth;
    this.phoneNumber = phoneNumber;
    this.nationality = nationality;
    this.idProof = idProof;
    this.checkInDate = checkInDate;
    this.checkOutDate = checkOutDate;
    this.roomType = roomType;
    this.roomNumber = roomNumber;
  }

  /**
   * @return the guest name.
   */

  public String getName()
  {
    return name;
  }

  /**
   *
   * @return the guest email.
   */
  public String getEmail()
  {
    return email;
  }

  /**
   *
   * @param email the email to replace with.
   */
  public void setEmail(String email)
  {
    this.email = email;
  }

  /**
    @return the guests date of birth.
   */
  public LocalDate getDateOfBirth()
  {
    return dateOfBirth;
  }

  /**
   *
   * @return the guests phone number.
   */

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  /**
   *
   * @return the guests nationality.
   */
  public String getNationality()
  {
    return nationality;
  }

  /**
   *
   * @return the guest identity proof.
   */
  public String getIdProof()
  {
    return idProof;
  }

  /**
   *
   * @return the guest checkin date.
   */
  public LocalDate getCheckInDate()
  {
    return checkInDate;
  }

  /**
   *
   * @return the guest checkout date.
   */
  public LocalDate getCheckOutDate()
  {
    return checkOutDate;
  }

  /**
   *
   * @return the room type.
   */
  public String getRoomType()
  {
    return roomType;
  }

  /**
   *
   * @return the room number.
   */
  public String getRoomNumber()
  {
    return roomNumber;
  }

  /**
   *
   * @param name the name to replace with.
   */

  public void setName(String name)
  {
    this.name = name;
  }

  /**
   *
   * @param dateOfBirth the date of birth to replace with.
   */
  public void setDateOfBirth(LocalDate dateOfBirth)
  {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   *
   * @param phoneNumber the phone number to replace with .
   */
  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  /**
   *
   * @param nationality the nationality to replace with.
   */
  public void setNationality(String nationality)
  {
    this.nationality = nationality;
  }

  /**
   *
   * @param idProof the idproof to replace with.
   */
  public void setIdProof(String idProof)
  {
    this.idProof = idProof;
  }

  /**
   *
   * @param checkInDate the checkin date to replace with.
   */
  public void setCheckInDate(LocalDate checkInDate)
  {
    this.checkInDate = checkInDate;
  }

  /**
   *
   * @param checkOutDate the checkout date replace with.
   */
  public void setCheckOutDate(LocalDate checkOutDate)
  {
    this.checkOutDate = checkOutDate;
  }

  /**
   *
   * @param roomType the room type to replace with
   */
  public void setRoomType(String roomType)
  {
    this.roomType = roomType;
  }

  /**
   *
   * @param roomNumber the room number to replace with,
   */
  public void setRoomNumber(String roomNumber)
  {
    this.roomNumber = roomNumber;
  }

  /**
   * Gets a String representation of the guest objects.
   * @return a string containing information about guest.
   */
  public String toString()
  {
    return name ;
  }

  /**
   *
   * @param obj the object to comapre with guest objects .
   * @return true if the boolean object represents the same value as guest objects.
   */
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Guest))
    {
      return false;
    }

    Guest other = (Guest) obj;

    return name.equals(other.name)  && dateOfBirth.equals(other.dateOfBirth) &&
        phoneNumber == other.phoneNumber && nationality.equals(other.nationality) && idProof == other.idProof &&
        checkInDate.equals(other.checkInDate) && checkOutDate.equals(other.checkOutDate) &&
        roomType.equals(other.roomType) && roomNumber == other.roomNumber;
  }
}
