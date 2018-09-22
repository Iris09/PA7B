import java.util.Scanner;
public class NumeroMayor{
  public static void main(String[] args) {
int num1,num2;
Scanner n=new Scanner (System.in);
System.out.println("write the first value: ");
num1=n.nextInt();
System.out.println("write the second value :");
num2=n.nextInt();

if (num1<num2) {
  System.out.println(num1+"Is greater than"+num2);
  }
  else{
    System.out.println(num2+"Is minor than"+num1);
  }




  }
}
