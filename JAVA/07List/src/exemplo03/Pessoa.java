package exemplo03;

public class Pessoa {
	
//ATRIBUTOS
	private String nome;
	private int idade;
	
//CONSTRUTOR
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
//GETTERS E SETTERS NOME	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

//GETTERS E SETTERS NOME
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
