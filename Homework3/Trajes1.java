import javax.swing.JOptionPane;
public class Trajes1{
  public static void main(String[] args) {

    double CT, DE, PF;

    CT =Integer.parseInt(JOptionPane.showInputDialog(null,"El costo del traje es: "));
    if (CT > 2500)
      DE = CT * 0.15;
    else
      DE = CT * 0.08;

    PF = CT - DE;
    JOptionPane.showMessageDialog(null,"El precio final es: " + PF);
    JOptionPane.showMessageDialog(null,"El descuento es: " + DE);
  }
}
