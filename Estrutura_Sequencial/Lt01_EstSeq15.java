import javax.swing.JOptionPane;
public class Lt01_EstSeq15{
    public static void main(String args[]){
        double c1, c2, somaC, h;
        c1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro cateto: "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo cateto: "));
        somaC = ((c1*c1)+(c2*c2));
        h = Math.sqrt(somaC);
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é igual: " + h);
    }
}