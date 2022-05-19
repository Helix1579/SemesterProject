package model;

import java.io.Serializable;

public class Guest implements Serializable
{
  private String name;
  private String address;
  private String dateOfBirth;
  private long phoneNumber;
  private String nationality;
  private long idProof;
  private String checkInDate;
  private String checkOutDate;
  private String roomType;
  private int roomNumber;

  public Guest(String name, String address, String dateOfBirth, long phoneNumber, String nationality, long idProof,
      String checkInDate, String checkOutDate, String roomType, int roomNumber)
  {
    this.name = name;
    this.address = address;
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

  public String getAddress()
  {
    return address;
  }

  public String getDateOfBirth()
  {
    return dateOfBirth;
  }

  public long getPhoneNumber()
  {
    return phoneNumber;
  }

  public String getNationality()
  {
    return nationality;
  }

  public long getIdProof()
  {
    return idProof;
  }

  public String getCheckInDate()
  {
    return checkInDate;
  }

  public String getCheckOutDate()
  {
    return checkOutDate;
  }

  public String getRoomType()
  {
    return roomType;
  }

  public int getRoomNumber()
  {
    return roomNumber;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public void setDateOfBirth(String dateOfBirth)
  {
    this.dateOfBirth = dateOfBirth;
  }

  public void setPhoneNumber(long phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  public void setNationality(String nationality)
  {
    this.nationality = nationality;
  }

  public void setIdProof(long idProof)
  {
    this.idProof = idProof;
  }

  public void setCheckInDate(String checkInDate)
  {
    this.checkInDate = checkInDate;
  }

  public void setCheckOutDate(String checkOutDate)
  {
    this.checkOutDate = checkOutDate;
  }

  public void setRoomType(String roomType)
  {
    this.roomType = roomType;
  }

  public void setRoomNumber(int roomNumber)
  {
    this.roomNumber = roomNumber;
  }

  public String toString()
  {
    return name + " , " + address + " , " + dateOfBirth + " , " + phoneNumber + " , " + nationality +
        " , " + idProof + " , " + checkInDate + " , " + checkOutDate + " , " + roomType + " , " + roomNumber;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Guest))
    {
      return false;
    }

    Guest other = (Guest) obj;

    return name.equals(other.name) && address.equals(other.address) && dateOfBirth.equals(other.dateOfBirth) &&
        phoneNumber == other.phoneNumber && nationality.equals(other.nationality) && idProof == other.idProof &&
        checkInDate.equals(other.checkInDate) && checkOutDate.equals(other.checkOutDate) &&
        roomType.equals(other.roomType) && roomNumber == other.roomNumber;
  }
}
