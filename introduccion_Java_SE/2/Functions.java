public class Functions {

  public static void main(String[] args) {
    double x = 2.1;
    double y = 3;
    circleArea(y);
    sphereArea(y);
    sphereVolumen(y);

    System.out.println(convertToDolar(100, "COP"));
  }

  // area un circulo
  public static double circleArea(double r) {
    return Math.PI * Math.pow(r, 2);
  }

  public static double sphereArea(double r) {
    return 4 * Math.PI * Math.pow(r, 2);
  }

  public static double sphereVolumen(double r) {
    return (4 / 3) * Math.PI * Math.pow(r, 3);
  }

  /**
   * Description: This function convert money currency
   * @param quantity = 1000
   * @param currency = COP
   * @return double
   * 
   */
  public static double convertToDolar(double quantity, String currency) {
    switch (currency) {
      case "MXN":
        quantity = quantity * 0.052;
        break;
      case "COP":
        quantity = quantity * 0.00031;
        break;
    }

    return quantity;
  }
}
