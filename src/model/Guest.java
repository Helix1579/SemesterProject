package model;

import javafx.scene.control.DatePicker;

import java.io.Serializable;
import java.time.LocalDate;

public class Guest implements Serializable
{
  private String name;
  private LocalDate dateOfBirth;
  private String phoneNumber;
  private String nationality;
  private String idProof;
  private LocalDate checkInDate;
  private LocalDate checkOutDate;
  private String roomType;
  private String roomNumber;

  public Guest(String name,  LocalDate dateOfBirth, String phoneNumber, String nationality, String idProof,
      LocalDate checkInDate, LocalDate checkOutDate, String roomType) //add room num
  {
    this.name = name;

    this.dateOfBirth = dateOfBirth;
    this.phoneNumber = phoneNumber;
    this.nationality = nationality;
    this.idProof = idProof;
    this.checkInDate = checkInDate;
    this.checkOutDate = checkOutDate;
    this.roomType = roomType;
    this.roomNumber = roomNumber;
  }

  public String getName()
  {
    return name;
  }



  public LocalDate getDateOfBirth()
  {
    return dateOfBirth;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public String getNationality()
  {
    return nationality;
  }

  public String getIdProof()
  {
    return idProof;
  }

  public LocalDate getCheckInDate()
  {
    return checkInDate;
  }

  public LocalDate getCheckOutDate()
  {
    return checkOutDate;
  }

  public String getRoomType()
  {
    return roomType;
  }

  public String getRoomNumber()
  {
    return roomNumber;
  }

  public void setName(String name)
  {
    this.name = name;
  }



  public void setDateOfBirth(LocalDate dateOfBirth)
  {
    this.dateOfBirth = dateOfBirth;
  }

  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  public void setNationality(String nationality)
  {
    this.nationality = nationality;
  }

  public void setIdProof(String idProof)
  {
    this.idProof = idProof;
  }

  public void setCheckInDate(LocalDate checkInDate)
  {
    this.checkInDate = checkInDate;
  }

  public void setCheckOutDate(LocalDate checkOutDate)
  {
    this.checkOutDate = checkOutDate;
  }

  public void setRoomType(String roomType)
  {
    this.roomType = roomType;
  }

  public void setRoomNumber(String roomNumber)
  {
    this.roomNumber = roomNumber;
  }

  public String toString()
  {
    return name + " , " +  " , " + dateOfBirth + " , " + phoneNumber + " , " + nationality +
        " , " + idProof + " , " + checkInDate + " , " + checkOutDate + " , " + roomType + " , " + roomNumber;
  }

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
