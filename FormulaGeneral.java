import java.util.Scanner;

public class FormulaGeneral {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa el valor de a");

    double ax = scan.nextDouble();

    System.out.println("Ingresa el valor de b");

    double bx = scan.nextDouble();

    System.out.println("Ingresa el valor de c");

    double c = scan.nextDouble();

    double factorizacion = (Math.pow(bx,2)) - 4*((ax)*(c));

    // Math.sqrt()

    if(factorizacion < 0){

      System.out.println("No se puede resolver");

    }else{
      double resultado = ((-(bx)) + (factorizacion))/(2 * (ax));

    }

  }

}
