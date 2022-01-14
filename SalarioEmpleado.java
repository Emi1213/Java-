import java.util.Scanner;

public class SalarioEmpleado {
  public static void main(String[] args) {
    // Hacer un programa que calcule e imprima el salario de un empleado a partir de sus horas semanales trabajadas
    //y de su salario por hora.
    Scanner input = new Scanner (System.in);

    System.out.print("Ingresa tu nombre: ");

    String nameEmployee = input.nextLine();

    System.out.print("Ingresa el numero de horas que trabajas a la semana " +  nameEmployee + ": ");

    float numberHours = input.nextFloat();

    System.out.print(nameEmployee + " ¿Cual es tu salario por hora: ");

    float salaryHour = input.nextFloat();

    float salaryWeek = numberHours * salaryHour;

    System.out.print(salaryWeek);

}
}