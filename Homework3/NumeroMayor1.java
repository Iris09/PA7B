import javax.swing.JOptionPane;
public class NumeroMayor1{
  public static void main(String[] args) {

    int A, B, M;

    A =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer . valor:"));

    B = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo valor:"));
    if (A > B)
      M = A;
    else{
      M = B;
    }
    JOptionPane.showMessageDialog(null,"El valor mayor es: " + M);
  }
}
