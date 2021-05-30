package atividade05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Anos bissextos até o ano");
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano"));
		int i = 0;
		int contBissexto = 0;
				
		while (i <= ano) {
			if (i % 4 == 0) {
				contBissexto++;
						
		}
		i++;
		
				
		} JOptionPane.showMessageDialog(null, "Até o ano " + ano + " existem " + contBissexto + " anos Bissextos");
		
		

	}

}
