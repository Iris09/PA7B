import javax.swing.JOptionPane;
public class TiempoLlamada1{
  public static void main(String[] args) {

    int TI;
    String DI, TU;
    double PAG, IMP, TOT;

    TI = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tiempo: "));

    DI =  Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia: "));

    TU = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el turno: "));
    if (TI < 5) {
      PAG = TI * 1;
    }else if (TI < 8) {
      PAG = (TI - 5) * 0.8 + 5;
    }else if (TI <= 10) {
      PAG = (TI - 8) * 0.7 + 7.4;
    }else{
      PAG = (TI - 10) * 0.5 + 8.8;
    }
    if (DI == "DOM") {
      IMP = PAG * 0.05;
    }else if (TU == "M") {
      IMP = PAG * 0.15;
    }else{
      IMP = PAG * 0.10;
    }
    TOT = PAG + IMP;
    JOptionPane.showMessageDialog(null,"El pago es: " + PAG);
    JOptionPane.showMessageDialog(null,"El impuesto es: " + IMP);
    JOptionPane.showMessageDialog(null,"El pago total es: " + TOT);
  }
}
