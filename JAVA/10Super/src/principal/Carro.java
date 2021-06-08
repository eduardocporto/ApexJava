package principal;

public class Carro extends Veiculo{

//ATRIBUTOS
	private int portas;
	private boolean tetoSolar;
//CONSTRUTOR
	public Carro(String fabricante, String modelo, double valor, int portas, boolean tetoSolar)
	{	super(fabricante, modelo, valor);
		this.portas =  portas;
		this.tetoSolar =  tetoSolar;		
	}

}
