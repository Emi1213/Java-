import javax.swing.JOptionPane;

public class Calculadora {
  public static void main(String[] args) {

    float number1 = Float.parseFloat(JOptionPane.showInputDialog("Digita el primer número"));

    float number2 = Float.parseFloat(JOptionPane.showInputDialog("Digita el segundo número"));

    String operacion = JOptionPane.showInputDialog("Digita la operacion que deseas realizar");

    float respuesta1 = 0;

    float respuesta2 = 0;

    float respuesta3 = 0;

    float respuesta4 = 0;


    switch (operacion) {
      case "suma":
        respuesta1 = number1 + number2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + respuesta1 );
        break;
      case "resta" :
        respuesta2 = number1 - number2;
        JOptionPane.showMessageDialog(null, "El resultado es: "+ respuesta2 );
        break;
      case "multiplicacion":
        respuesta3 = number1 * number2;
        JOptionPane.showMessageDialog(null, "El resultadp es: " + respuesta3 );
        break;
      case "division" :
        if(number2 == 0){
          JOptionPane.showMessageDialog(null, "No se puede resolver");
        }else{
        respuesta4 = number1 / number2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + respuesta4);
      }
      default:
        JOptionPane.showMessageDialog(null, "Eres idiota");
        break;
    }
  }
}
