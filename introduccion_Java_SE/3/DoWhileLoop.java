import java.util.Scanner;

public class DoWhileLoop {

  public static void main(String[] args) {
    int response = 0;
    do {
      System.out.println("Select an option");
      System.out.println("1. Movies");
      System.out.println("2. Series");
      System.out.println("0. Exit");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(response);

      switch (response) {
        case 0:
          System.out.println("See u later");
          break;
        case 1:
          System.out.println("Movieees");
          break;
        case 2:
          System.out.println("Seriesss");
          break;
        default:
          System.out.println("Please select an option from the menu");
          break;
      }
    } while (response != 0);
  }
}
