import java.util.Scanner;

public class HolaMundo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Hola, cúal es tu nombre?");

    String name = scan.nextLine();

    System.out.println("Hola " + name );

    System.out.println("¿Cuantos años tienes?");

    int edad = scan.nextInt();

    if (edad < 18){
      System.out.println("Hola " + name +",eres menor de edad");
    } else if (edad >= 18){
      System.out.println("Hola " + name +",eres mayor de edad");
    }

  }
}