package vetorInputNew;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// var para vetor
		String[] nomes = new String[3];
		
		// obter os 3 nomes
		for(int indice = 0; indice < 3; indice++) {
			nomes[indice] = JOptionPane.showInputDialog("Informe o " + (indice+1) + "º nome");
		}
		
		// ForEach reduzido (para cada) -> ele puxa o "calculo" do numero de vetores 3 neste caso
		for(String linha : nomes) {
			System.out.println(linha);
		}

	}

}
