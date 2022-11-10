public class DataTypes {

  public static void main(String[] args) {
    // enteros
    int i = 1234567890;
    long l = 1234567890423L; // Agregar L numeros muy largos

    // flotantes
    double d = 123.456; // Datos precisos
    float dF = 123.456F; // Agregar la F

    // string

    var salary = 1000; // int

    var pension = salary * 0.03; // double

    System.out.println(salary);
    System.out.println(pension);

    var totalSalary = salary - pension;
    System.out.println(totalSalary);
  }
}
