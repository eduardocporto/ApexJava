package atividade8;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
	//Criar um jogo da forca com a palavra ESTUDAR
	
	JOptionPane.showMessageDialog(null, "Vamos jogar o jogo da forca");
		
	
	Sting corpinho = "";
	
	int i = 0;
	
	do {
		char letra = JOptionPane.showInputDialog("Informe uma letra").charAt(0);
		if (letra == 'e' || letra == 's' || letra == 't' || letra == 'u' || letra == 'd' || letra == 'a' || letra == 'r') {
			
			
		} else {

		}
		
		
	} while (i < 6);
	
		
		

	}

}
