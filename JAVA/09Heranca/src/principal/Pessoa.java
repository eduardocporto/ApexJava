package principal;

//NO JAVA NAO HA HERANCA MULTIPLA, POR ISSO SO PODE HERDAR UMA CLASSE
public class Pessoa extends Cargo {
	
//ATRIBUTOS
	private String nome;
	private int idade;
//CONSTRUTOR
	public Pessoa(String nome, String cargo, int idade, double salario)
	{	this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
		
		listarPessoa();
		listarCargo();
	}
	
//METODO PARA LISTAR DADOS
	private void listarPessoa() 
	{	System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
	}

}
