import java.util.Scanner;
public class PositivoNegativo{
  public static void main(String []args){
int num;
Scanner n=new Scanner(System.in);

System.out.println("enter the number: ");
num=n.nextInt();
if (num<0){
  System.out.println("The number is negative: ");
}
else{
  System.out.println("The number is positive: ");
}

  }
}
