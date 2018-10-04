import javax.swing.JOptionPane;
public class HorasTrabajadas1{
 public static void main(String[] args) {

   double  HT,PH,SS;

    HT=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce las horas trabajadas:"));

    PH=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el pago por hora:"));
    SS = HT * PH;
    JOptionPane.showMessageDialog(null,"EL SUELDO SEMANALA ES IGUAL A:"+ SS);
  }
}
