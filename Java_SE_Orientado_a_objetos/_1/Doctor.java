package _1;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
  private String speciality;

  public Doctor(String name, String email) {
    super(name, email);
  }

  public String getSpeciality() {
    return speciality;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }

  ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();

  public void addAvailableAppoinment(Date date, String time) {
    availableAppointment.add(new Doctor.AvailableAppointment(date, time));
  }

  public ArrayList<AvailableAppointment> getAvailableAppointment() {
    return availableAppointment;
  }

  @Override
  public String toString() {
    return (
      "Speciality: " +
      speciality +
      ", User:" +
      getName() +
      " , Email:" +
      getEmail() +
      ", Address: " +
      getAddress()
    );
  }

  public static class AvailableAppointment {
    private int idAvailableAppoinment;
    private Date date;
    private String time;

    public AvailableAppointment(Date date, String time) {
      this.date = date;
      this.time = time;
    }

    public Date getDate() {
      return date;
    }

    public void setDate(Date date) {
      this.date = date;
    }

    public String getTime() {
      return time;
    }

    public void setTime(String time) {
      this.time = time;
    }
  }
}
