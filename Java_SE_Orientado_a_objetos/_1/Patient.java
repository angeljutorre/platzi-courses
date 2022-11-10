package _1;

public class Patient extends User {
  private String birthday;
  private double weight;
  private double height;
  private String blood;

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
