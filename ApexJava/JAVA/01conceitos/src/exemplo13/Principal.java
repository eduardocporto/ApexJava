package exemplo13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Matriz Linha x Coluna
		String[][] matriz = new String[20][2];
		
		//Menu
		String menu = "1) Cadastrar \n2) Selecionar \n3) Remover \n4) Sair";
		
		// Variavel para Opções
		int opcao = 0;
		
		// Indice responsavel pelo cadastro
		int indiceCad = 0;
		
		// Laço
		do {
			//Obter a opcao selecionada
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		
		// Escolha
		switch(opcao) {
			case 1:
				for(int i=0; i<20; i++) {
					if(matriz[i][0] == null) {
						indiceCad = i;
						break;
					}
				}
				
				matriz[indiceCad][0] = JOptionPane.showInputDialog("Informe o " + (indiceCad+1) + "º nome");
				matriz[indiceCad][1] = JOptionPane.showInputDialog("Informe a idade de " + matriz[indiceCad][0]);
				
								
				JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");				
			break;
			
			case 2:
				
				String lista = "Listagem\n";
				boolean valida = false;
				
				for(int i=0; i<20; i++) {
					if(matriz[i][0] != null) {
					lista += (i+1) + "º) " + matriz[i][0] + " " + matriz[i][1] + "\n";
					valida = true;
					}
				}
				
				JOptionPane.showMessageDialog(null, valida == true ? lista : "Não há cadastros");
			break;
			
			case 3:
				
				String nome = JOptionPane.showInputDialog("Informe um nome para remover");
				
				boolean existe = false;
				
				for(int i=0; i<20; i++) {
					if(nome.equals(matriz[i][0])) {
						existe = true;
						matriz[i][0] = null;
						matriz[i][1] = null;
					}
				}
				
				JOptionPane.showMessageDialog(null, existe == true ? "Removido com sucesso!" : "Não encontrado")
				;
			break;
			
			case 4:
				JOptionPane.showMessageDialog(null, "Fechando o sistema");
			break;
		}
			
		
		
			}while(opcao != 4);
		
		
		}

		
		

}