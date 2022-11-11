package _1.model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
  private String birthday;
  private double weight;
  private double height;
  private String blood;
  private ArrayList<AppointmentDoctor> appoinmentDoctors = new ArrayList<>();
  private ArrayList<AppoinmentNurse> appoinmentNurses = new ArrayList<>();

  public void addAppoinmentDoctors(Doctor doctor, Date date, String time) {
    AppointmentDoctor appoinmentDoctor = new AppointmentDoctor(this, doctor);
    appoinmentDoctor.schendule(date, time);
    appoinmentDoctors.add(appoinmentDoctor);
  }

  public void addAppoinmentNurses(ArrayList<AppoinmentNurse> appoinmentNurses) {
    this.appoinmentNurses = appoinmentNurses;
  }

  public ArrayList<AppointmentDoctor> getAppoinmentDoctors() {
    return appoinmentDoctors;
  }

  public ArrayList<AppoinmentNurse> getAppoinmentNurses() {
    return appoinmentNurses;
  }

  public Patient(String name, String email) {
    super(name, email);
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getWeight() {
    return (this.weight + " Kg.");
  }

  @Override
  public void showDataUser() {
    System.out.println("Paciente: Cruz verde");
    System.out.println("Historial: Desde 2020");
  }

  @Override
  public String toString() {
    return (
      "Age: " +
      birthday +
      "Weight: " +
      weight +
      ", User:" +
      getName() +
      " , Email:" +
      getEmail() +
      ", Address: " +
      getAddress()
    );
  }
}
