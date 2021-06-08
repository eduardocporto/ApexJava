package exercicio04;

public class Produto {
	
//ATRIBUTOS
	private String nomeProduto, marca;
	private double valor;
	private int quantidade;
	
//CONTRUTOR
	public Produto (String nomeProduto, String marca, double valor) {
		this.nomeProduto = nomeProduto;
		this.marca = marca;
		this.valor = valor;		
		}
	



	
//GENERATE GET AND SET

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
//METODO ToString PARA NOMEAR O ATRIBUTO PRINCIPAL DE UM OBJETO E LISTAR UMA INFORMACAO
	public String toString() {
		return this.nomeProduto;
	}


}
