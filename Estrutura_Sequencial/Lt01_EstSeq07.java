import javax.swing.JOptionPane;
public class Lt01_EstSeq07{
    public static void main(String args[]){
        double comprimento, largura, altura, volume;
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do comprimento: "));
        largura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da largura: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
        volume = (comprimento*largura*altura);
        JOptionPane.showMessageDialog(null, "O volume do paralelepídedo é igual: " + volume);
    }
}
