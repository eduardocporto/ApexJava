package descontoAVista;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String produto = JOptionPane.showInputDialog("Informe o produto vendido");
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do produto").replace(",", "."));
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o a forma de pagamento:\n1) A vista\n2) A prazo"));
		double desconto =  0;
		
		if (opcao == 1 && valor >= 500) {
			desconto = valor*0.1;
			valor = valor-desconto;
			JOptionPane.showMessageDialog(null, "O valor a ser pago no produto " + produto + " é R$" + valor);
		} else {
			JOptionPane.showMessageDialog(null, "O valor a ser pago no produto " + produto + " é R$" + valor);

		}
		
		
		

	}

}
