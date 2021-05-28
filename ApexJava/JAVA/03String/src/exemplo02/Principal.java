package exemplo02;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		// trabalhando com JFrame - criação de uma janelinha
		JFrame frame = new JFrame();
		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JText field 
		JTextField campo = new JTextField();
		campo.setBounds(50, 50, 400, 20);
		
		// acao de teclado
		campo.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// Funciona apenas para teclas de caractere e nao de funcao
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				// If para deixar apagar, pois o char 8 é o backspace
				if(e.getKeyCode() != 8) {
					
				
					// Este é o mais utilizado
					// Obter  o termo digitado
					String valor = campo.getText();
					
					// Condicional
					if (valor.length() == 2 || valor.length() == 5) {
						campo.setText(valor+"/");
					}
					
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// Manter a tecla pressionada
				
			}
		});
		
		// Adicionar o JFrame
		frame.add(campo);

		// tornar visivel o campo do formulario, depois de carregar os elementos
		frame.setVisible(true);
	
		
		
	}

}
