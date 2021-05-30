package scannerInput;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Criar um objeto
		Scanner armazenar = new Scanner(System.in);

		// Perguntar o nome
		System.out.println("Qual é o seu nome?");
		
		// Obter o nome
		String nome = armazenar.nextLine();
		
		// Concatenar o nome
		System.out.println("O nome informado foi " + nome);
		
		// Remover objeto armazenar
		armazenar.close();
	
	}

}


