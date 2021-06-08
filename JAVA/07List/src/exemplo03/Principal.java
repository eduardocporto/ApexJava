package exemplo03;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

//ARRAY LIST - TRABALHAR COM DUAS INFORMACOES E NAO APENAS UMA
		ArrayList<Pessoa> dados = new ArrayList<Pessoa>();
		
//CRIANDO OBJETOS
		Pessoa p1 = new Pessoa("Alice", 19);
		Pessoa p2 = new Pessoa("Lucas", 32);
		Pessoa p3 = new Pessoa("Rebeca", 21);
		Pessoa p4 = new Pessoa("Julio", 14);
		Pessoa p5 = new Pessoa("Viviane", 37);
		
//CADASTRAR
		dados.add(p1);
		dados.add(p2);
		dados.add(p3);
		dados.add(p4);
		dados.add(p5);

//LISTAR INFORMACOES
		for (int i=0; i<dados.size(); i++) {
			System.out.println(dados.get(i).getNome());
			System.out.println(dados.get(i).getIdade());
			System.out.println();
		}
		
	}

}
