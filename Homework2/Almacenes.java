import java.util.Scanner;
public class Almacenes{
  public static void main(String []args){
      Scanner ingreso = new Scanner(System.in);

double CT,DE,PF;

System.out.println("enter the number: ");
CT=ingreso.nextInt();

if (CT>2500) {
   DE=CT*0.15;
 }

else{
  DE=CT*0.08; }
System.out.println("enter the number: ");

  }
}
