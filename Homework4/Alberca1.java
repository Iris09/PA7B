import javax.swing.JOptionPane;
public class Alberca1{
 public static void main(String[] args) {

   double  A, L, N, CM, PAG, V;

   A=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la altura de la alberca:"));

   L=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el largo de la alberca:"));
   System.out.println("Introduce el ancho de la alberca:");
   N=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el ancho de la alberca:"));

   CM=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el costo del metro cúbico:"));
   V = (A * L * N);
   PAG = V * CM;
  JOptionPane.showMessageDialog(null,"El pago a realizar por consumo es igual a  :"+ PAG);
}
}
