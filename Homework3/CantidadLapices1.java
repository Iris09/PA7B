import javax.swing.JOptionPane;
public class CantidadLapices1{
  public static void main(String[] args) {

    int X;
    double PAG;

    X =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de lapices: "));
    if (X >= 1000)
      PAG = X * 0.85;
    else
      PAG = X * 0.90;

    JOptionPane.showMessageDialog(null,"El total de pago es: " + PAG);
  }
}
