import java.util.Scanner;

public class PromedioJava {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa cuatro notas");

    float dato1 = scan.nextFloat();
    float dato2 = scan.nextFloat();
    float dato3 = scan.nextFloat();
    float dato4 = scan.nextFloat();

    float promedio = (( dato1 + dato2 + dato3 + dato4 )/4);
    
    System.out.println(promedio);

  } 
}
