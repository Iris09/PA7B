import java.util.Scanner;

public class LeapYear{
public static void main(String[] args) {
//
Scanner input;
input = new Scanner ( System.in);
System.out.println ("enter a year");
int year= input.nextInt();

//if (year % 4 ==(doble igual para comparar) 0 && year % 100 !=0)
// || = barda o fail
// if  es para comparar
// else = de lo contrario que hacer esto
if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
  System.out.println ( year + "is a Leap Year");


} else
System.out.println ( year + "is NOT a Leap Year");
}

}
