import javax.swing.JOptionPane;
public class  AreaCircunferencia1{
 public static void main(String[] args) {
   double pi= 3.1416d;
   double area;
int radio = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the radio"));
area = (radio*radio) * pi;
JOptionPane.showMessageDialog(null, "el are del circulo es " + area);
}
}
