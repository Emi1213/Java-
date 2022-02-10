import javax.swing.JOptionPane;

public class HorasEquivalentes {
  public static void main(String[] args) {
    // pedir un  numero de horas y devoveler la equivalencia en semanas dias y horas
    int hours = Integer.parseInt(JOptionPane.showInputDialog("Digita el número de horas"));

    int semana = (hours / 168);

    int dias = (hours / 24);

    JOptionPane.showMessageDialog( null, hours + " es equivalente a  " +  semana + " semanas,  "  +  dias  + "  dias" +  hours + "en horas" );
  }

}
