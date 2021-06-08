package exemplo01;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

//VETOR ARRAY - SO TRABALHA COM CLASSES (PRIMEIRA LETRA MAIUSCULA)
		ArrayList<String> cursos = new ArrayList<String>();

//CADASTRO SEM UTILIZAR O LOCAL DO VETOR, ELE PEGA O QUE FOR NULL
		cursos.add("Lógica e Algoritmos");
		cursos.add("Banco de dados");
		cursos.add("Java Fundamentos");
		cursos.add("Java Web");
		
//REMOVER INFORMACAO ANTES DE LISTAR (USA POSICAO DO VETOR)
		cursos.remove(1);
		
//ALTERAR CURSO UTILIZANDO UM PONTO DO VETOR
		cursos.set(2, "Java - Spring");
		
//QUANTIDADE DE CURSOS 
		System.out.println("Quantidade de cursos cadastrados: "+cursos.size());
		
//LISTAR AS INFORMCOES
		for (String elemento : cursos) {
			System.out.println(elemento);
		}
		
	}

}
