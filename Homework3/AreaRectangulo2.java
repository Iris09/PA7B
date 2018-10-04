import javax.swing.JOptionPane;
public class AreaRectangulo2{
   public static void main(String[] args) {
     int height,area;
int base = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the base"));

int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la altura "));
 area=base * altura;

     JOptionPane.showMessageDialog(null, "el area del rectangulo es " + area);

  }
}
