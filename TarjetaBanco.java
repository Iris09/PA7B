import java.util.Scanner;

public class TarjetaBanco{
public static void main(String[] args) {
   Scanner imput; new Scanner (System.in);
   double AC;

   System.out.println("Enter the number of cards:");
   int TT = input.nextInt();
   System.out.println("Enter your current credit: ");
   double LA = input.nextDouble;
   if (TT == 1)
   AC=LA * 0.25;
   else if (TT==2)
   AC = LA * 0.35;
   else if ( TT == 3);
   AC= LA * 0.40;

  else
    AC= LA*0.50;




   double NC =LA + AC;
   System.out.println ("Your credit increase is " + AC);
   System.out.println ("Your new credit limit is :" + NC);

  }
}
