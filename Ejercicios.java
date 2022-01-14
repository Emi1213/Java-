import java.util.Scanner;

public class Ejercicios {
  public static void main(String[] args) {
    //Guillermo tiene n dolares luis tiene la mitad de lo que poseee guillermo,
    //Juan tiene la mitad de lo que poseen Luis y Guillermo juntos, imprima la
    //cantidad de dinero que tienen entre los tres
     Scanner scan = new Scanner(System.in);

     System.out.println("Da un valor a n");

     float Guillermo = scan.nextFloat();

     float Luis = (Guillermo / 2);

     float Juan = ((Guillermo + Luis )/2);

     float Cantidad = (Guillermo + Luis +Juan);

     System.out.println(Cantidad);
  }
}
