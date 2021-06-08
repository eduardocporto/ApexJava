package exercicio02;

public class Cursos {
	
//ATRIBUTOS
	private String nome;
	private double valor;
	
//CONSTRUTOR
	public Cursos(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	
//GENERATE GET AND SET Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
//GENERATE GET AND SET Valor
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
//METODO ToString PARA NOMEAR O ATRIBUTO PRINCIPAL DE UM OBJETO E LISTAR UMA INFORMACAO
	public String toString() {
		return this.nome;
	}
	
	

}
