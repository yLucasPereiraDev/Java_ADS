import javax.swing.JOptionPane;
public class Lt01_EstSeq16{
    public static void main(String args[]){
        double htrabalhdas, hvalor, desconto, ndesc, salarioB, salario;
        htrabalhdas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade das horas trabalhadas: "));
        hvalor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser recebido por hora trabalhada: "));
        desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
        ndesc = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de descendentes: "));
        salarioB = (htrabalhdas * hvalor);
        desconto = (salarioB * (desconto / 100));
        salario = (salarioB - desconto);
        salario = (salario + (ndesc * 100));
        JOptionPane.showMessageDialog(null, "O valor do salário líquido a ser recebido é: " + salario);
    }
}