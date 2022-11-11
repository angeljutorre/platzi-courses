package _1.model;

public class Nurse extends User {
  private String speciality;

  public Nurse(String name, String email) {
    super(name, email);
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }

  public String getSpeciality() {
    return speciality;
  }

  @Override
  public void showDataUser() {
    System.out.println("Hospital: Cruz roja");
    System.out.println("Departamento: Cancelogo");
    System.out.println("Departamento: Pediatria");
  }
}
