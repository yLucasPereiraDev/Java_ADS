import javax.swing.JOptionPane;
public class Lt01_EstSeq04 {
    public static void main(String args[]){
        double celcius, fahrenheit;
        celcius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celcius"));
        fahrenheit = (9*celcius+160)/5;
        JOptionPane.showMessageDialog(null, "A reajustada em Fahrenheit é igual a: " + fahrenheit); 
    }
}
