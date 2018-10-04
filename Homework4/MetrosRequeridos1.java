import javax.swing.JOptionPane;
public class MetrosRequeridos1{
 public static void main(String[] args) {

   double CM, PG;

   CM=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce los metros requeridos:");
   PG = CM/2.54;
   JOptionPane.showMessageDialog(null,"las pulgadas equivalentes son igual a:"+ PG);
 }
}
