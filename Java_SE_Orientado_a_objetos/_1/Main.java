package _1;

import static _1.ui.UIMenu.*;

import java.util.Date;

public class Main {

  public static void main(String[] args) {
    // showMenu();

    Doctor myDoctor = new Doctor("Angel Archbold", "angel@gmail.com");
    System.out.println(myDoctor.getName() + " . " + myDoctor.getSpeciality());
    myDoctor.setSpeciality("Cirujano");
    myDoctor.addAvailableAppoinment(new Date(), "3pm");
    myDoctor.addAvailableAppoinment(new Date(), "5pm");
    myDoctor.addAvailableAppoinment(new Date(), "7pm");

    for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointment()) {
      System.out.println(aA.getDate() + " . + . " + aA.getTime());
    }

    Patient patient = new Patient("Milena", "milena@mail.com");

    patient.setPhoneNumber("290120340");
    patient.setWeight(96);
    System.out.println(
      patient.getName() +
      " . " +
      patient.getEmail() +
      " . " +
      patient.getWeight()
    );

    System.out.println(patient);
    System.out.println(myDoctor);
  }
}
