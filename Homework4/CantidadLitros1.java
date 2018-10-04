import javax.swing.JOptionPane;
public class CantidadLitros1{
 public static void main(String[] args) {

   int L;
   double  PG,TG,GA;

    L=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la cantidad de litros:"));

    PG=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el precio del galon:"));
    TG=(L / 3.785);
     GA = PG * TG;
    JOptionPane.showMessageDialog(null,"Cantidad de galones que produce es igual a:"+ TG);
    JOptionPane.showMessageDialog(null,"Ganancia por la entrega de leche es igual a :"+ GA);
 }
}
