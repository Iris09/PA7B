import java.util.Scanner;
public class PagoAgua{
  public static void main (String[] args){
    Scanner ingreso =new Scanner(System.in);
    double A,L,N,CM,V,PAG;
    System.out.println("calculate the volume");
    System.out.println("Enter the length of the pool: ");
    L = ingreso.nextInt();
    System.out.println("Enter the width of the pool: ");
    A=ingreso.nextInt();
    N=ingreso.nextInt();
    V= L * N * A;
    System.out.println("the volume is: " +V);

    System.out.println("enter the cost per cubic meter");
    CM = ingreso.nextInt();
    PAG = V * CM;
    System.out.println("the cost is :" + PAG);
  }
  }
