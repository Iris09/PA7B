import java.util.Scanner;
public class Prendas{
  public static void main (String[] args){
    Scanner ingreso = new Scanner (System.in);
    double CM,PG;
    System.out.println("Introduce los metros de tela :");
    CM = ingreso.nextInt();

    PG= CM / 0.0254;
    System.out.println("enter the meters of fabric : ");
    CM=ingreso.nextInt();

    PG= CM / 0.0254;
    System.out.println("inch of fabric or request: " + PG);

  }
}
