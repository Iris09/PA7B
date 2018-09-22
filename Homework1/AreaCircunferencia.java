import java.util.Scanner;
public class AreaCircunferencia{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    double radio, area;
    double pi=3.1416;
    System.out.println("Enter the radio: ");
    radio = ingreso.nextInt();
    area = (radio*radio) * pi;
    System.out.println("The area is : " + area);
  }

  }
