import javax.swing.JOptionPane;
public class Lt01_EstSeq02{
    public static void main(String agrs[]){
        double salario, nsalario;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário atual: "));
        nsalario = (salario * 0.15) + salario;
        JOptionPane.showMessageDialog(null, "Novo sálario reajustado: " + nsalario);   
    }
}
