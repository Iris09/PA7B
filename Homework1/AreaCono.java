import java.util.Scanner;
public class AreaCono{
public static void main(String[] args) {
  Scanner ingreso = new Scanner (System.in);
  double radio,area1,areasemi,cateto1,cateto2,a,b, hipotenusa,area2,areafigura;
  double pi = 3.1416;
  System.out.println("Semi-circular area");
  System.out.println("enter the radio: ");
  radio= ingreso.nextInt();
  area1 = (radio*radio) * pi;
  areasemi =area1 /2;
  System.out.println("the area is : " +areasemi);

  System.out.println("enter missing leg : ");
  cateto2= ingreso.nextInt();
  cateto1=ingreso.nextInt();
  a = Math.sqrt(cateto1);
  b= Math.sqrt(cateto2);
  hipotenusa = a + 2;
System.out.println("The hiponusa is: " +hipotenusa );

  System.out.println("triangle area");
  area2 = ((cateto1*2)) /2;
  System.out.println("the area of ​​the triangle is : "+ area2);
  System.out.println("calculate the area of ​​the figure");
  areafigura = areasemi + area2;
  System.out.println("The area of ​​the figure is : " + areafigura);


  }
}
