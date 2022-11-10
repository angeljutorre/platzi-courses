public class MathematicOperations {

  public static void main(String[] args) {
    double x = 2.1;
    double y = 3;

    // devuelve un entero hacia arriba
    System.out.println(Math.ceil(x));
    // devuelve un entero hacia abajo
    System.out.println(Math.floor(x));
    // devuelve un numero elevada a otro
    System.out.println(Math.pow(x, y));
    // devuelve el numero mayor
    System.out.println(Math.max(x, y));
    // devuelve la raiz cuadrada
    System.out.println(Math.sqrt(y));
    // area un circulo
    System.out.println(Math.PI * Math.pow(y, 2));
    // volumen de una esfera
    System.out.println((4 / 3) * Math.PI * Math.pow(y, 3));
  }
}
