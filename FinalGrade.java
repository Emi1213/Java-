
import javax.swing.JOptionPane;

public class FinalGrade {
  public static void main(String[] args) {
    //La calificacion final con 4 aspectos de su rendimiento academico y estos son: Participacio , primer examen parcial
    //Segundo Examen Parcial y examen Final sabiendo que las estas entran a la calificacion finbal con :
    //10 , 25 , 25, 40.
    float number1 = Float.parseFloat(JOptionPane.showInputDialog("Digita tu nota de Participación"));


    float number2 = Float.parseFloat(JOptionPane.showInputDialog("Digita tu nota del Examen del Primer Parcial"));

    float number3 = Float.parseFloat(JOptionPane.showInputDialog("Digita tu nota del Examen del Segundo Parcial"));

    float number4 = Float.parseFloat(JOptionPane.showInputDialog("Digita la nota del Examen Final"));

    number1 *= 0.1f;

    number2 *= 0.25f;

    number3 *= 0.25f;

    number4 *= 0.4f;

    float finalGrade = (number1 +number2+number3+number4);

    System.out.println(finalGrade);
  }
}
