package exemplo04;

public class Cargo {
	
//ATRIBUTO
	private String cargo;
	
//CONSTRUTOR #1- METODO QUE EXECUTA AUTOMATICAMENTE (PRIMEIRO QUE O OBJETO EXECUTA) - TODO CONTRUTOR E PUBLICO
//TODO CONSTRUTOR SEMPRE VAI SER O MESMO NOME DA CLASSE	
	public Cargo() {
		System.out.println("Construtor OK!");
	}
	
//CONSTRUTOR #2 - AGORA COM PARAMETRO
//POSSO CRIAR A VARIAVEL COM O MESMO NOME DAQUELA ACIMA, POIS ELA SO TERA VALIDADE DENTRO DO CONCHETES DO CONSTRUCTOR
//COMANDO "THIS" SEMPRE VAI REFERENCIAR O ATRIBUTO - SERVE PARA ENVIAR A INFORMACAO DE DENTRO DA VARIAVEL LOCAL PARA A VARIAVEL DO ATRIBUTO	
	public Cargo(String cargo) {
		this.cargo = cargo;
		System.out.println(mensagem());
	}
	
//METODO DE MENSAGEM
	private String mensagem () {
		return "o cargo informado � "+cargo;
	}

}