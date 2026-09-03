import javax.swing.JOptionPane;
public class Lt01_EstSeq17 {
    public static void main(String args[]){
        double litros, tempo_percurso, velocidade_media, distancia;

        velocidade_media = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média em km/h:"));
        tempo_percurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo gasto em horas:"));

        distancia = velocidade_media * tempo_percurso;
        litros = distancia / 12;

        JOptionPane.showMessageDialog(null, "Litros consumidos na viagem: " + litros );
    }
}