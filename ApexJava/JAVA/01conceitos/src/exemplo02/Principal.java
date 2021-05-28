package exemplo02;

public class Principal {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// TIPO DE VARIAVEIS TEXTUAIS
		char letra = 'a';
		
		// Não existe um tipo texto, apenas um tipo char... como funciona
		char[] letras = {'a', 'p', 'e', 'x'};
		
		// Como fazer mais fácil (classe String)
		String texto = "Apex";
		
		// TRABALHANDO COM NUMEROS:
		// Inteiros
		byte valor1 = 127; // Menor número que tem vai somente até 127
		short valor2 = 32767; // Segundo, vai apenas até 32767
		int valor3 = 1000000000; // Vai até muitos bilhões
		long valor4 = 100;
		
		// Quebrados
		float valor5 = 5.4f; // quando quer deixar pre-definido o valor, colocar um "f" no final
		double valor6 = 7.6; 
		
		// TRABALHANDO COM O LÓGICO
		boolean estuda = true; // pode ser true, mas pode ser false também
		
		
	}
}
