package whileMod;

public class Principal {

	public static void main(String[] args) {
		// variavel indice
		int indice = 1;
		
		// laco de repeticao
		while(indice < 11) {
			if(indice % 2 == 0) {
				System.out.println(indice + " é par.");
			}else {
				System.out.println(indice + " é impar.");
			}
			
			indice++;

	}
}		

}
