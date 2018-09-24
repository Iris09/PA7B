import java.util.Scanner;
public class RegistroGalones{
 public static void main(String[] args) {
   Scanner ingreso = new Scanner(System.in);
   int L;
   double PG,TG,GA;
   System.out. println("Enter the number of liters sold: ");
   L= ingreso.nextInt();
   TG = ( L / 3.785);
   System.out.println("Gallons produced: ");
   System.out.println("enter the cost per gallon");
   PG = ingreso.nextInt();

   GA = TG * PG ;
   System.out.println("Total gain of the day is"+GA);

  }
}
