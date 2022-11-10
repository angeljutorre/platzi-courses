package _1;

public class User {
  private int id;
  private String name;
  private String email;
  private String address;
  private String phoneNumber;

  public User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhoneNumber(String phoneNumber) {
    if (phoneNumber.length() < 10) {
      System.out.println("Phone number required more than 10 digits");
    } else {
      this.phoneNumber = phoneNumber;
    }
  }

  @Override
  public String toString() {
    return "User:" + name + " , Email:" + email + ", Address: " + address;
  }
}
