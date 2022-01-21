import javax.swing.JOptionPane;

public class ProductosNotables {
  public static void main(String[] args) {

    float number1 = Float.parseFloat(JOptionPane.showInputDialog("Digita el primer número"));

    float number2 = Float.parseFloat(JOptionPane.showInputDialog("Digita el segundo número"));

    float  product = ((number1 * number1) + (2 * (number1 * number2)) + (number2 * number2));

    JOptionPane.showMessageDialog( null, "La suma de los cuadrados de los digitos ingresados es " + product );
  }
}