import javax.swing.JOptionPane;
public class Lt01_EstSeq01 {
    public static void main(String args[]) {
        int lado, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado do quadrado: "));
        area = lado * lado;
        JOptionPane.showMessageDialog(null, "O valor da área do quadrado é igual a: "+ area);
    }    
}
