import javax.swing.JOptionPane;
public class WhileLoop{
  public static void main(String[] args) {
    int number = (int) (Math.random()*100);
    //random = aletoreo
    //int guess =
    //Integer.parseInt(JOptionPane.showInputDialog( "gess a magin number between 0 and 100"));
    int guess = -1;
    //mientras (condicion)
    while (guess != number){
      guess =
      Integer.parseInt(JOptionPane.showInputDialog( "guess a magin number between 0 and 100"));
      if (guess == number) {
        JOptionPane.showMessageDialog( null, "yes, the number is " + number);

      }  else if ( guess > number) {
       JOptionPane.showMessageDialog(null,"your guess is too high");

      }else{
        JOptionPane.showMessageDialog(null,"your guess is too low");
      }

    }
  }
}
