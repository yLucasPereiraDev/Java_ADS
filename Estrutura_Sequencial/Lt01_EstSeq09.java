import javax.swing.JOptionPane;
public class Lt01_EstSeq09{
    public static void main (String args[]){
        int soma, n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número: "));
        soma = ((n1*n1)+(n2*n2));
        JOptionPane.showMessageDialog(null,"O valor da soma dos quadrados é igual: " + soma);
    }
}
