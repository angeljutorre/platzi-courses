package _1.model;

import java.util.Date;

public class AppoinmentNurse implements IsSchedulable {
  private int id;

  private Patient Patient;

  private Nurse nurse;

  private Date date;

  private String time;

  @Override
  public void schendule(Date date, String time) {
    // TODO Auto-generated method stub

  }
}
