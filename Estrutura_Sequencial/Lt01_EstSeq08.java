import javax.swing.JOptionPane;
public class Lt01_EstSeq08{
    public static void main(String args[]){
        double deposito;
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que irá ser depositado na poupança: "));
        deposito = ((1.3/100) * deposito) + deposito;
        JOptionPane.showMessageDialog(null, "O valor do seu deposito com os rendimentos é igual: " + deposito);
    }
}
