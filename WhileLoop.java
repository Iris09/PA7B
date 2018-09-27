
import javax.swing.JOptionPane;
public class WhileLoop{
  public static void main(String[] args) {
    int number =(int)(Math.random ()*100);

    int guess = -1;
    //mientras(ondicion)
    while(guess ! = number){
      guess =
      Interger.parseInt(JOptionPane.showInputDialog("Guess magin numer between 0 and 100"));
if (guess == number) {
  JOptionPane.showMessageDialog(null,"Yes the number is"+ number);


}else if (guess> number) {
JOptionPane.showMessageDialog(null,"your guess is to high");
{else}
JOptionPane.showMessageDialog(null,"your guess ins to low");

}{

}

}
    }





  }
}
