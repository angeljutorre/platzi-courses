public class ForLoop {
  static boolean isTurnOnLight = false;

  public static void main(String[] args) {
    turnOnOffLight();

    for (int j = 0; j < 10; j++) {
      printSOS();
    }
  }

  public static void printSOS() {
    System.out.println("... ___ ...");
  }

  public static boolean turnOnOffLight() {
    isTurnOnLight = (isTurnOnLight) ? false : true;
    return isTurnOnLight;
  }
}
