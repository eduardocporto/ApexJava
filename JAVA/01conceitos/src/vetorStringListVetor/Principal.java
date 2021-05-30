package vetorStringListVetor;

public class Principal {

	public static void main(String[] args) {
		// Vetor variavel
		String [] nomes = {"Alice", "Bruno", "Camila"};
		
		// Exibindo as informações do array
		System.out.println(nomes[0]);
		
		// contar nomes
		System.out.println(nomes.length);

		// laço com for
		for(int indice = 0; indice < nomes.length; indice++) {
			System.out.println(nomes[indice]);
		}

	
	
}

}
