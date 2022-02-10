import java.util.Scanner;


public class Numeros {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nnegative = 0;
    int npositive = 0;
    int n0 = 0;
    double positive = 0;
    double negative = 0;

    for(int i = 0; i <= 9; i++){
      System.out.println("Ingresa diez numeros");
      int num = scan.nextInt();

      if(num<0){
        nnegative++;
        negative += num;
      }else if (num>0){
        npositive++;
        positive +=num;

      }else if (num == 0){
        n0++;
      }
    }

    double median = negative/nnegative;
    double mediap = positive/npositive;

    System.out.println("La media de los numeros positivos es " + mediap);
    System.out.println("La media de los numeros negativos es " + median);
    System.out.println(n0);

  }
}