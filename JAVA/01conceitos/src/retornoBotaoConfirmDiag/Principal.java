package retornoBotaoConfirmDiag;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		// Exibir uma mensagem
		//JOptionPane.showMessageDialog(null, "Hello Word!");

		//Obter um dado
		//String texto = JOptionPane.showInputDialog("Informe um texto:");
		
		//Caixa de confirma��o
		int opcao = JOptionPane.showConfirmDialog(null, "Gostamos de Java?");
		JOptionPane.showConfirmDialog(null, "O n�mero da op��o � " + opcao);
	}

}