package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Números inteiros: Integer.parse()
		// Números reais: Double.parseDouble()
		try {
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
			int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
			
			double media = (n1 + n2) / 2;
			
			JOptionPane.showConfirmDialog(null, media >= 7 ? "Aprovado com média "+ media : "Reprovado com media "+ media);
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Falha ao executar: " + e.getMessage());
		}
	}

}
