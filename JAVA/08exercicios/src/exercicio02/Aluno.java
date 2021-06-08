package exercicio02;

public class Aluno {
	
//ATRIBUTOS
	private String nome, curso, turma;
	private double valor;
	
//CRIANDO CONSTRUTOR
	public Aluno(String nome, String curso, String turma, double valor) {
		this.nome = nome;
		this.curso = curso;
		this.turma = turma;
		this.valor = valor;
	}
	
//METODO DE CALCULO DA MEDIA
	private double media;
	
//CRIANDO OS GET E SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
