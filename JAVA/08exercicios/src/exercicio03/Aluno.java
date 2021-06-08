package exercicio03;

public class Aluno {
//ATRIBUTOS
	private String nome, situacao;
	private double nota1, nota2;
	private double media;
	
//CONSTRUTOR
	public Aluno (String nome, double nota1, double nota2) {
		this.nome=nome;
		this.nota1=nota1;
		this.nota2=nota2;
		this.media=media();
		this.situacao=situacao();
	}
	
//METODO DE CALCULO
	private double media () {
		return (nota1+nota2)/2;
	}
	
//METODO SITUACAO
	private String situacao() {
		return (media >6 ? "Aprovado" : "Reprovado");
	}
	
	
//GETTERS AND SETTERS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	

	
	
	

	
	

}
