package calculadoraComOpcoes;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "Calculadora");
	double num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
	double num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero"));
	double resultado = 0;
	
	int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção:\n1) Soma\n2) Subtração\n3) Multiplição\n4) Divisão"));
	
	//1 - soma
	//2 - subtracao
	//3 - multiplicacao
	//4 - divisao	
	
	switch (opcao) {
	case 1:
		resultado = num1+num2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	break;
	
	case 2:
		resultado = num1-num2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	break;
	
	case 3:
		resultado = num1*num2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	break;
	
	case 4:
		resultado = num1/num2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
		
	default:
		JOptionPane.showMessageDialog(null, "Opção não localizada.");
		
		
	}
	

	}

}
