package vogaisConsoantes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("INFORME UM NOME");
		lblNome.setBounds(10, 70, 195, 13);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(215, 67, 96, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblConsoantes = new JLabel("Consoantes: ");
		lblConsoantes.setBounds(10, 134, 195, 13);
		contentPane.add(lblConsoantes);
		
		JLabel lblConsoantes_1 = new JLabel(" ");
		lblConsoantes_1.setBounds(215, 134, 195, 13);
		contentPane.add(lblConsoantes_1);
		
		JLabel lblVogais = new JLabel("Vogais: ");
		lblVogais.setBounds(10, 191, 45, 13);
		contentPane.add(lblVogais);
		
		JLabel lblVogais_1 = new JLabel(" ");
		lblVogais_1.setBounds(215, 191, 195, 13);
		contentPane.add(lblVogais_1);
		
		JButton btnContar = new JButton("CONTAR");
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//VARIAVEIS				
			String nome = txtNome.getText();
			int contadorConsoante = 0;
			int contadorVogal = 0;

//LACO PARA CONTAR AS LETRAS			
			for (int i=0; i<nome.length(); i++) {
				char letra = nome.charAt(i);
				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
					contadorConsoante++;
					
				}else {
					contadorVogal++;
				}
			}	

//MOSTRAR O RESULTADO		
//INSERINDO VALORES INT EM UM LABEL E CONVERTENDO PARA STRING
			lblConsoantes_1.setText(String.valueOf(contadorConsoante));
			lblVogais_1.setText(String.valueOf(contadorVogal));
			
				
				
				
			}
		});
		btnContar.setBounds(321, 66, 85, 21);
		contentPane.add(btnContar);
	}

}
