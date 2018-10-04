import javax.swing.JOptionPane;
public class ViajeEstudios1{
  public static void main(String[] args) {

    int NA;
    double PA, TOT;

    NA =Integer.parseInt(JOptionPane.showInputDialog(null,"El numero de alumnos que haran el viaje: "));
    if (NA >= 100) {
      PA = 65.0;
    }else if (NA >= 50) {
        PA = 70.0;
      }else if (NA >= 30) {
        PA = 95.0;
      }else{
        PA = 4000 / NA;
      }
    TOT = PA * NA;
    JOptionPane.showMessageDialog(null,"El pago individual es: " + PA);
    JOptionPane.showMessageDialog(null,"El pago total es: " + TOT);
  }
}
