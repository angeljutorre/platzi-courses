package _1.model;

import java.util.Date;

public class AppointmentDoctor implements IsSchedulable {
  private int id;

  private Patient Patient;

  private Doctor doctor;

  private Date date;

  private String time;

  public AppointmentDoctor(Patient patient, Doctor doctor) {
    this.Patient = patient;
    this.doctor = doctor;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setDoctor(Doctor doctor) {
    this.doctor = doctor;
  }

  public void setPatient(Patient patient) {
    Patient = patient;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Date getDate() {
    return date;
  }

  public Doctor getDoctor() {
    return doctor;
  }

  public Patient getPatient() {
    return Patient;
  }

  public String getTime() {
    return time + "hrs.";
  }

  @Override
  public void schendule(Date date, String time) {
    // TODO Auto-generated method stub
    this.date = date;
    this.time = time;
  }
}
