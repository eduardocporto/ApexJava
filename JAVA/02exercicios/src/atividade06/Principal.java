package atividade06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	//Peça valores até que seja informado o número zero, em seguida retorne a soma dos valores informados
		
	JOptionPane.showMessageDialog(null, "Informe números para serem somados, cancele inserindo o número ZERO.");
	
	double num = 0;
	double soma = 0;
	
	do {
		num = Double.parseDouble(JOptionPane.showInputDialog("Informe o número").replace(",", "."));
		soma = num+soma;
		
	} while (num != 0);
	
	JOptionPane.showMessageDialog(null, "A soma dos números é: " + String.valueOf(soma).replace(".", ","));
	
	
	}

}
