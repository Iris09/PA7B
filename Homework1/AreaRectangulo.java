import java.util.Scanner;
public class AreaRectangulo{
   public static void main(String[] args) {
     Scanner ingreso = new Scanner(System.in);
     int base,altura,area;
     System.out.println("The area of ​​a rectangle");
     System.out.println("enter the base");
     base=ingreso.nextInt();
     System.out.println("enter the height");
     altura=ingreso.nextInt();
     area=base * altura;
     System.out.println("The area is" + area);

  }
}
