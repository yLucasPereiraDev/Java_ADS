import javax.swing.JOptionPane;
public class Lt01_EstSeq05 {
    public static void main(String args[]){
        double a, b, c, delta, x1, x2;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficente C: "));
        delta = (b*b) - (4*a*c);
        x1 = (-b + Math.sqrt(delta)) / (2*a);
        x2 = (-b - Math.sqrt(delta)) / (2*a);
        JOptionPane.showMessageDialog(null, "Delta = " + delta + "\n X1 = " + x1 + "\n X2 = " + x2);
    }
}
