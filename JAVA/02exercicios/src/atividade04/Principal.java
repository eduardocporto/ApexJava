package atividade04;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "Conversão de moedas");
		
		int moeda1 = Integer.parseInt(JOptionPane.showInputDialog("De qual moeda deseja converter:\n1) Real\n2) Dólar\n3) Libra\n4) Euro"));
		double valToConvert = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser convertido").replace(",", "."));
		int moeda2 = Integer.parseInt(JOptionPane.showInputDialog("Para qual moeda deseja converter:\n1) Real\n2) Dólar\n3) Libra\n4) Euro"));
		
		double conversion = 0; 
		DecimalFormat doisDigitos = new DecimalFormat("0.00");
		
		//1 Real
		//2 Dólar
		//3 Libra
		//4 Euro
		
		if (moeda1 == 1 && moeda2 == 2) {
			//real para dolar
			conversion = valToConvert*0.1867;
			JOptionPane.showMessageDialog(null, valToConvert + " Reais, vale " + doisDigitos.format(conversion) + " Dólares");
			
		}else if (moeda1 == 1 && moeda2 == 3) {
			//real para libra
			conversion = valToConvert*0.132;
			JOptionPane.showMessageDialog(null, valToConvert + " Reais, vale " + doisDigitos.format(conversion) + " Libras");
			
		}else if (moeda1 == 1 && moeda2 == 4) {
			//real para euro
			conversion = valToConvert*0.1533;
			JOptionPane.showMessageDialog(null, valToConvert + " Reais, vale " + doisDigitos.format(conversion) + " Euros");
			
		}else if (moeda1 == 2 && moeda2 == 1) {
			//dolar para real
			conversion = valToConvert*5.3562;
			JOptionPane.showMessageDialog(null, valToConvert + " Dólares, vale " + doisDigitos.format(conversion) + " Reais");
			
		}else if (moeda1 == 2 && moeda2 == 3) {
			//dolar para libra
			conversion = valToConvert*0.7068;
			JOptionPane.showMessageDialog(null, valToConvert + " Dólares, vale " + doisDigitos.format(conversion) + " Libras");
			
		}else if (moeda1 == 2 && moeda2 == 4) {
			//dolar para euro
			conversion = valToConvert*0.8211;
			JOptionPane.showMessageDialog(null, valToConvert + " Dólares, vale " + doisDigitos.format(conversion) + " Euros");
			
		}else if (moeda1 == 3 && moeda2 == 1) {
			//libra para real
			conversion = valToConvert*7.5781;
			JOptionPane.showMessageDialog(null, valToConvert + " Libras, vale " + doisDigitos.format(conversion) + " Reais");
			
		}else if (moeda1 == 3 && moeda2 == 2) {
			//libra para dolar
			conversion = valToConvert*1.4148;
			JOptionPane.showMessageDialog(null, valToConvert + " Libras, vale " + doisDigitos.format(conversion) + " Dolares");
			
		}else if (moeda1 == 3 && moeda2 == 4) {
			//libra para euro
			conversion = valToConvert*1.1617;
			JOptionPane.showMessageDialog(null, valToConvert + " Libras, vale " + doisDigitos.format(conversion) + " Euros");
			
		}else if (moeda1 == 4 && moeda2 == 1) {
			//euro para real
			conversion = valToConvert*6.5232;
			JOptionPane.showMessageDialog(null, valToConvert + " Euros, vale " + doisDigitos.format(conversion) + " Reais");
			
		}else if (moeda1 == 4 && moeda2 == 2) {
			//euro para dolar
			conversion = valToConvert*1.2179;
			JOptionPane.showMessageDialog(null, valToConvert + " Euros, vale " + doisDigitos.format(conversion) + " Dolares");
			
		}else if (moeda1 == 4 && moeda2 == 3) {
			//euro para libra
			conversion = valToConvert*0.8608;
			JOptionPane.showMessageDialog(null, valToConvert + " Euros, vale " + doisDigitos.format(conversion) + " Libras");
			
		}else {
			JOptionPane.showMessageDialog(null, "Opção não localizada");

		}
		
		
		
		
		
		
		
		
		
		

	}

}
