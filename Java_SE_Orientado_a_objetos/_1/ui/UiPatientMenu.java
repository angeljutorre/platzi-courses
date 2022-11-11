package _1.ui;

import _1.model.Doctor;
import _1.model.Doctor.AvailableAppointment;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UiPatientMenu {

  public static void showPatientMenu() {
    int response = 0;
    do {
      System.out.println("Patient");
      System.out.println("Welcome: " + UIMenu.patientLogged.getName());
      System.out.println("1. Book and appoinment");
      System.out.println("2. My appoinments");
      System.out.println("0. Logout");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(sc.nextLine());

      switch (response) {
        case 1:
          showBookAppoinmentMenu();
          break;
        case 2:
          showPatientMyAppoinments();
          break;
        case 0:
          UIMenu.showMenu();
          break;
      }
    } while (response != 0);
  }

  private static void showBookAppoinmentMenu() {
    int response = 0;
    do {
      System.out.println(":: Book an appoinment");
      System.out.println(":: Select date: ");
      //
      Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
      int k = 0;
      for (
        int i = 0;
        i < UiDoctorMenu.doctorAvailableAppointments.size();
        i++
      ) {
        ArrayList<Doctor.AvailableAppointment> availableAppoinments = UiDoctorMenu
          .doctorAvailableAppointments.get(i)
          .getAvailableAppointment();

        Map<Integer, Doctor> doctorAppoinments = new TreeMap<>();

        for (int j = 0; j < availableAppoinments.size(); j++) {
          k++;
          System.out.println(k + ". " + availableAppoinments.get(j).getDate());

          doctorAppoinments.put(
            Integer.valueOf(j),
            UiDoctorMenu.doctorAvailableAppointments.get(i)
          );
        }

        Scanner sc = new Scanner(System.in);
        int responseDateSelected = Integer.valueOf(sc.nextLine());

        Map<Integer, Doctor> doctorAvailableSelected = doctors.get(
          responseDateSelected
        );
        Integer indexDate = 0;
        Doctor doctorSelected = new Doctor("", "");

        for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
          indexDate = doc.getKey();
          doctorSelected = doc.getValue();
        }

        System.out.println(
          "Date: " +
          doctorSelected.getName() +
          ". Time: " +
          doctorSelected.getAvailableAppointment().get(indexDate).getTime()
        );

        System.out.println("Confirm your appointment: ");
        System.out.println("1. Yes ");
        System.out.println("2. Change data ");

        response = Integer.valueOf(sc.nextLine());
        if (response == 1) {
          UIMenu.patientLogged.addAppoinmentDoctors(
            doctorSelected,
            doctorSelected.getAvailableAppointment().get(indexDate).getDate(),
            doctorSelected.getAvailableAppointment().get(indexDate).getTime()
          );

          showPatientMenu();
        }
      }
    } while (response != 0);
  }

  private static void showPatientMyAppoinments() {
    int response = 0;
    do {
      System.out.println("::My Appoinments");
      if (UIMenu.patientLogged.getAppoinmentDoctors().size() == 0) {
        System.out.println("You dont have appoinments");
        break;
      }

      for (
        int i = 0;
        i < UIMenu.patientLogged.getAppoinmentDoctors().size();
        i++
      ) {
        int j = i + 1;
        System.out.println(
          j +
          "Date : " +
          UIMenu.patientLogged.getAppoinmentDoctors().get(i).getDate() +
          " Time: " +
          UIMenu.patientLogged.getAppoinmentDoctors().get(i).getTime() +
          " Doctor: " +
          UIMenu
            .patientLogged.getAppoinmentDoctors()
            .get(i)
            .getDoctor()
            .getName()
        );

        System.out.println("0. Return");
      }
    } while (response != 0);
  }
}
