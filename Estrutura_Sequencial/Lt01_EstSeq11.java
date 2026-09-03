import javax.swing.JOptionPane;
public class Lt01_EstSeq11 {
    public static void main (String args[]){
        double raio;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
        raio = (raio*raio);
        JOptionPane.showMessageDialog(null, "O valor da circunferência: " + raio);
    }
}
