package ifElse;

public class Principal {

	public static void main(String[] args) {
		
		// Media
		double media = 7;
		
		// Condicional simples
		
		/*
		if(media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		*/
		
		// Confidicional composta
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}else if(media >= 5) {
			System.out.println("Em exame");
		}else {
			System.out.println("Reprovado");
		}

	}

}
