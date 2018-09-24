import java.util.Scanner;
public class Banquetes{
  public static void main(String[] args){
    Scanner ingreso = new Scanner(System.in);
    int NP,TOTAL;

    System.out.println("Ingresa el numero de personas : ");
    NP=ingreso.nextInt();
    TOTAL=ingreso.nextInt();

    if (NP>300) {
    }
else if (TOTAL==NP*75) {
TOTAL=ingreso.nextInt();
}
else if (NP>200) {
}
else if (TOTAL==NP*85) {
}
else if (TOTAL==NP*95) {
}
System.out.println("El presupuesto es :" +TOTAL );





  }
}
