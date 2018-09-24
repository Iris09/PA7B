import java.util.Scanner;
public class AreaTerreno{
   public static void main(String[] args) {
Scanner ingreso = new Scanner(System.in);
int base1,altura1,areate,base2,altura2,arear,total;
System.out.println("Triangle area");
System.out.println("Enter the base");
base1=ingreso.nextInt();
System.out.println("Enter the height");
altura1=ingreso.nextInt();
areate=(base1*altura1) /2 ;
System.out.println("The area of ​​the triangle is"+ areate);
System.out.println("The area of ​​the rectangle");
System.out.println("Enter the base ");
base2=ingreso.nextInt();
System.out.println("Enter the height");
altura2=ingreso.nextInt();
arear=base2 =altura2 ;
System.out.println("The area of ​​the rectangle is" +arear);

System.out.println("Land area");
total=arear + areate ;
System.out.println("the area of ​​the land is" + total);




  }
}
