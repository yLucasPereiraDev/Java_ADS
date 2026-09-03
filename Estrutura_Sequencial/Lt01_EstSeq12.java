import javax.swing.JOptionPane;
public class Lt01_EstSeq12 {
    public static void main(String args[]){
     int anoN, anoA, idade, idadeF;
     anoN = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
     anoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
     idade = (anoA-anoN);
     idadeF = (idade+17);
     JOptionPane.showMessageDialog(null, "Sua idade atual é igual: " + idade);
     JOptionPane.showMessageDialog(null, "Sua idade daqui 17 anos vai ser igual a: " + idadeF);
    }
}