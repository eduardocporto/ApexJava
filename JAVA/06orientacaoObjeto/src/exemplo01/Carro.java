package exemplo01;

public class Carro {

//ATRIBUTOS (COLOCANDO PUBLIC NA FRENTE DA STRING ELE VAI FICAR PUBLICO PARA TODOS)
	String fabricante, modelo;
	double valor;
	int ano;
	boolean tetoSolar;

//METODOS
	void mensagem() {
		System.out.println("Fabricante: "+fabricante);
		System.out.println("\nModelo: "+modelo);
		System.out.println("\nValor: "+valor);
		System.out.println("\nAno: "+ano);
	}
	
}
