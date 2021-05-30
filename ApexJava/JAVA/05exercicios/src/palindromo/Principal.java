package palindromo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtEntrada;

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
		setBounds(100, 100, 654, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFrase = new JLabel("INSIRA A FRASE");
		lblFrase.setBounds(10, 37, 99, 13);
		contentPane.add(lblFrase);
		
		txtEntrada = new JTextField();
		txtEntrada.addKeyListener(new KeyAdapter() {
			@Override
			
// EVENTO AO APERTAR O ENTER
			public void keyReleased(KeyEvent e) {
				
				if(e.getKeyCode() == 10) {
					
//VARIAVEIS				
					String entrada = txtEntrada.getText();
					String entradaInvertida = "";
//REMOVER ESPACO DA ENTRADA
					entrada = entrada.replace(" ", "");
					System.out.println(entrada);
					
					for(int i=entrada.length()-1; i>=0; i--) {
						entradaInvertida += entrada.charAt(i);
					}
					
					if (entrada.equals(entradaInvertida)) {
						JOptionPane.showMessageDialog(null, "É palindroma");	
					}else {
						JOptionPane.showMessageDialog(null, "Não é palindroma");
					}
					
				}
				
			}
		});
		txtEntrada.setBounds(119, 34, 416, 19);
		contentPane.add(txtEntrada);
		txtEntrada.setColumns(10);
		
		JButton btnValidar = new JButton("VALIDAR");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//VARIAVEIS				
			String entrada = txtEntrada.getText();
			String entradaInvertida = "";
//REMOVER ESPACO DA ENTRADA
			entrada = entrada.replace(" ", "");
			System.out.println(entrada);
			
			for(int i=entrada.length()-1; i>=0; i--) {
				entradaInvertida += entrada.charAt(i);
			}
			
			if (entrada.equals(entradaInvertida)) {
				JOptionPane.showMessageDialog(null, "É palindroma");	
			}else {
				JOptionPane.showMessageDialog(null, "Não é palindroma");
			}
			
			
			
			
			
				
			}
		});
		btnValidar.setBounds(545, 33, 85, 21);
		contentPane.add(btnValidar);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setBounds(10, 114, 242, 13);
		contentPane.add(lblResposta);
	}

}
