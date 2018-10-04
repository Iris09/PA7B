import javax.swing.JOptionPane;
public class TriannguloRectangulo{
 public static void main(String[] args) {

   double B,H,C,AT,AC, area;

   B=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la base del triangulo-rectangulo:"));

   H=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la hipotenusa del triangulo-rectangulo:"));
   C = Math.sqrt (B*B - H*H);
    AC = (3.1416*(H*H)/2);

   AT = (C*H/2)*2;

  area = AC+AT;

   JOptionPane.showMessageDialog(null,"El area de la figura es: "+ area);
 }
}
