import java.util.Scanner;
public class SueldoSemanal{
 public static void main(String[] args) {
  Scanner ingreso = new Scanner (System.in);
  double HT,PH,SS;
  System.out.println("enter the number of hours: ")  ;
  HT = ingreso.nextInt();
  System.out.println("enter the cost per hour");
  PH = ingreso.nextInt();
  SS = HT * PH;
  System.out.println("the weekly salary is: " +SS);

  }
}
