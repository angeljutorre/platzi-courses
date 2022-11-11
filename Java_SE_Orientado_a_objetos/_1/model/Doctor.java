package _1.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

  public void addAvailableAppoinment(String date, String time) {
    availableAppointment.add(new Doctor.AvailableAppointment(date, time));
  }

  public ArrayList<AvailableAppointment> getAvailableAppointment() {
    return availableAppointment;
  }

  @Override
  public void showDataUser() {
    System.out.println("Hospital: Cruz roja");
    System.out.println("Departamento:Cancelogo");
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
    private Date date;
    private String time;

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public AvailableAppointment(String date, String time) {
      try {
        this.date = format.parse(date);
      } catch (ParseException e) {
        e.printStackTrace();
      }
      this.time = time;
    }

    public Date getDate() {
      return date;
    }

    public String getDate(String DATE) {
      return format.format(date);
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
