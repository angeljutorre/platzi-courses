public class Casting {

  public static void main(String[] args) {
    //ubicar 30 perritos
    // cuantos perros ubique al mes

    double monthlyDogs = 30.0 / 12.0;
    System.out.println(monthlyDogs);
    //estimacion
    int estimatedMonthlyDogs = (int) monthlyDogs;
    System.out.println(estimatedMonthlyDogs);
    // exactitud
    int a = 30;
    int b = 12;
    System.out.println((double) a / b);
    // casteo entre tipos de datos
    double c = a / b;
    System.out.println(c);

    char n = '1';
    int nI = n;
    System.out.println(n);
    System.out.println(nI);

    short nS = (short) n;// no cabe y se hace explicito
    System.out.println(nS);
  }
}
