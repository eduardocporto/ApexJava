package calculoIMC;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
	JOptionPane.showMessageDialog(null, "Cálculo de IMC");
	
	double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
	double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura").replace(",", "."));
	
	double imc = peso / (altura * altura);
	DecimalFormat doisDigitos = new DecimalFormat("0.00");
	
	if (imc < 15) {
		JOptionPane.showMessageDialog(null, "Seu IMC é de " + doisDigitos.format(imc) + " e você está muito abaixo do peso");
	
	}else if (imc < 17.5) {
		JOptionPane.showMessageDialog(null, "Seu IMC é de " + doisDigitos.format(imc) + " e você está abaixo do peso");
		
	}else if (imc < 25) {
		JOptionPane.showMessageDialog(null, "Seu IMC é de " + doisDigitos.format(imc) + " e você está com o peso normal");
	
	}else if (imc < 30) {
		JOptionPane.showMessageDialog(null, "Seu IMC é de " + doisDigitos.format(imc) + " e você está acima do peso");
		
	}else if (imc < 35) {
		JOptionPane.showMessageDialog(null, "Seu IMC é de " + doisDigitos.format(imc) + " e você está com obesidade I");
		
	}else if (imc < 40) {
		JOptionPane.showMessageDialog(null, "Seu IMC é de " + doisDigitos.format(imc) + " e você está com obesidade II");
		
	}else {
		JOptionPane.showMessageDialog(null, "Seu IMC é de " + imc + " e você está com obesidade III");
	}
		
		
		
		

	}

}
