import javax.swing.JOptionPane;
public class Lt01_EstSeq10{
    public static void main (String args[]){
        double n1, n2, dif;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo número: "));
        dif = (n1-n2);
        JOptionPane.showMessageDialog(null, "O valor da diferença entre os números é igual: " + dif);
    }
}
