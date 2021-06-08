package exemplo03;

public class Produto {
	
//ATRIBUTOS
	private String nome;
	private double valor;
	
//CRIANDO GET E SET DA VARIAVEL NOME
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//CRIANDO GET E SET DA VARIAVEL VALOR	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
//METODO DE MENSAGEM
	public void mensagem() {
		System.out.println("O produto "+nome+" custa R$"+valor);
	}

}
