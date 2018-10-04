import javax.swing.JOptionPane;
public class Precio1{
  public static void main(String[] args) {

    String TI;
    int TA, K;
    double P, GA;

    TI = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tipo de tamaño de la uva: "));
    if (TI =="A") {
      if (TA = 1) {
        P = P + 0.20;
      }else{
        P = P + 0.30;
      }
    }else if (TA = 1) {
      P = P - 0.30;
    }else{
      P = P - 0.50;
    }
    GA = P * K;
    JOptionPane.showMessageDialog(null,"La ganancia es: " + GA);
  }
}
