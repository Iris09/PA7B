import javax.swing.JOptionPane;
public class Banco1{
  public static void main(String[] args) {

    int TT;
    double LA;
    double NC;
    double AC;

    TT = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tipo de tarjeta: "));

    LA = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese limite actual : "));
    if (TT == 1){
      AC = LA * 0.25;
    }else if (TT == 2){
      AC = LA * 0.35;
    }else if (TT ==3){
      AC = LA * 0.40;
    }else{
    AC = LA * 0.50;
    }
    NC = AC + LA;
    JOptionPane.showMessageDialog(null,"El nuevo limite de credito es:" + NC);
  }
}
