import javax.swing.JOptionPane;
public class AreaFigura1.java{
 public static void main(String[] args) {

   double AT,AR, area,B,A,C;

   B =Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la base de la forma A:"));

   A = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la base de la forma A:"));

   C =Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la altura del rectangulo:"));
   AT = (B * (A - C) )/2;
   JOptionPane.showMessageDialog(null,"el area del triangulo es:"+ AT);
   AR = B * C;
   JOptionPane.showMessageDialog(null,"el area del rectangulo es:"+ AR);
   area = AT + AR;
   JOptionPane.showMessageDialog(null,"el area total de la figura es:"+ area);


 }

 }
