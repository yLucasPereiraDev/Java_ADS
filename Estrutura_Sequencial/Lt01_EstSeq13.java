import javax.swing.JOptionPane;
public class Lt01_EstSeq13 {
    public static void main(String args[]){
        double alimento, dias;
        alimento = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento em KG: "));
        dias = (alimento * 1000) / 50;
        JOptionPane.showMessageDialog(null, "A quantidade de dias que durará o alimento é igual a: " + dias);
    }
}