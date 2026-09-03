import javax.swing.JOptionPane;
public class Lt01_EstSeq06 {
    public static void main(String args[]){
        double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Y: "));
        
        double temp = x;
        x = y;
        y = temp;
        JOptionPane.showMessageDialog(null, "O valor atual do X é: " + x + "\nO valor atual do Y é: " + y);
    }    
}