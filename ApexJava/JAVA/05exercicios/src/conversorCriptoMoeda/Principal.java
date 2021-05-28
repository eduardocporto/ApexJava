package conversorCriptoMoeda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

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
		setTitle("CONVERSAO DE CRIPTOMOEDAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// COMANDO PARA COLOCAR O JPANEL NO CENTRO DA TELA
		setLocationRelativeTo(null);
		
		JLabel lblTitulo = new JLabel("Selecione a convers\u00E3o a ser feita");
		lblTitulo.setBounds(10, 21, 416, 13);
		contentPane.add(lblTitulo);
		
		JLabel lblMoeda1 = new JLabel("Converter de: ");
		lblMoeda1.setBounds(10, 55, 72, 13);
		contentPane.add(lblMoeda1);
		
		JLabel lblMoeda2 = new JLabel("Para a moeda:");
		lblMoeda2.setBounds(10, 97, 72, 13);
		contentPane.add(lblMoeda2);
		
		JRadioButton rdbtnBitcoin1 = new JRadioButton("Bitcoin");
		rdbtnBitcoin1.setBounds(88, 51, 83, 21);
		contentPane.add(rdbtnBitcoin1);
		
		JRadioButton rdbtnLitecoin1 = new JRadioButton("Litecoin");
		rdbtnLitecoin1.setBounds(173, 51, 85, 21);
		contentPane.add(rdbtnLitecoin1);
		
		JRadioButton rdbtnDoge1 = new JRadioButton("Doge");
		rdbtnDoge1.setBounds(260, 51, 64, 21);
		contentPane.add(rdbtnDoge1);
		
		JRadioButton rdbtnXRP1 = new JRadioButton("XRP");
		rdbtnXRP1.setBounds(323, 51, 103, 21);
		contentPane.add(rdbtnXRP1);
		
//UNINDO RADIO BUTTONS 1
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtnBitcoin1);
		grupo1.add(rdbtnLitecoin1);
		grupo1.add(rdbtnDoge1);
		grupo1.add(rdbtnXRP1);
		
		JRadioButton rdbtnBitcoin2 = new JRadioButton("Bitcoin");
		rdbtnBitcoin2.setBounds(88, 89, 83, 21);
		contentPane.add(rdbtnBitcoin2);
		
		JRadioButton rdbtnLitecoin2 = new JRadioButton("Litecoin");
		rdbtnLitecoin2.setBounds(173, 89, 85, 21);
		contentPane.add(rdbtnLitecoin2);
		
		JRadioButton rdbtnDoge2 = new JRadioButton("Doge");
		rdbtnDoge2.setBounds(260, 89, 64, 21);
		contentPane.add(rdbtnDoge2);
		
		JRadioButton rdbtnXRP2 = new JRadioButton("XRP");
		rdbtnXRP2.setBounds(323, 89, 103, 21);
		contentPane.add(rdbtnXRP2);
		
//UNINDO RADIO BUTTONS 1
		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(rdbtnBitcoin2);
		grupo2.add(rdbtnLitecoin2);
		grupo2.add(rdbtnDoge2);
		grupo2.add(rdbtnXRP2);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int moeda1 = grupo1.getSelection().getActionCommand();
				
				double valToConvert = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser convertido").replace(",", "."));
				int moeda2 = Integer.parseInt(JOptionPane.showInputDialog("Para qual moeda deseja converter:\n1) Real\n2) Dólar\n3) Libra\n4) Euro"));
				
				double conversion = 0; 
				DecimalFormat doisDigitos = new DecimalFormat("#.00");
				
//Bitcoin
//Litecoin
//Doge
//XRP
				
				if (moeda1 == 1 && moeda2 == 2) {
					//real para dolar
					conversion = valToConvert*0.1867;
					JOptionPane.showMessageDialog(null, valToConvert + " Reais, vale " + doisDigitos.format(conversion) + " Dólares");
					
				}else if (moeda1 == 1 && moeda2 == 3) {
					//real para libra
					conversion = valToConvert*0.132;
					JOptionPane.showMessageDialog(null, valToConvert + " Reais, vale " + doisDigitos.format(conversion) + " Libras");
					
				}else if (moeda1 == 1 && moeda2 == 4) {
					//real para euro
					conversion = valToConvert*0.1533;
					JOptionPane.showMessageDialog(null, valToConvert + " Reais, vale " + doisDigitos.format(conversion) + " Euros");
					
				}else if (moeda1 == 2 && moeda2 == 1) {
					//dolar para real
					conversion = valToConvert*5.3562;
					JOptionPane.showMessageDialog(null, valToConvert + " Dólares, vale " + doisDigitos.format(conversion) + " Reais");
					
				}else if (moeda1 == 2 && moeda2 == 3) {
					//dolar para libra
					conversion = valToConvert*0.7068;
					JOptionPane.showMessageDialog(null, valToConvert + " Dólares, vale " + doisDigitos.format(conversion) + " Libras");
					
				}else if (moeda1 == 2 && moeda2 == 4) {
					//dolar para euro
					conversion = valToConvert*0.8211;
					JOptionPane.showMessageDialog(null, valToConvert + " Dólares, vale " + doisDigitos.format(conversion) + " Euros");
					
				}else if (moeda1 == 3 && moeda2 == 1) {
					//libra para real
					conversion = valToConvert*7.5781;
					JOptionPane.showMessageDialog(null, valToConvert + " Libras, vale " + doisDigitos.format(conversion) + " Reais");
					
				}else if (moeda1 == 3 && moeda2 == 2) {
					//libra para dolar
					conversion = valToConvert*1.4148;
					JOptionPane.showMessageDialog(null, valToConvert + " Libras, vale " + doisDigitos.format(conversion) + " Dolares");
					
				}else if (moeda1 == 3 && moeda2 == 4) {
					//libra para euro
					conversion = valToConvert*1.1617;
					JOptionPane.showMessageDialog(null, valToConvert + " Libras, vale " + doisDigitos.format(conversion) + " Euros");
					
				}else if (moeda1 == 4 && moeda2 == 1) {
					//euro para real
					conversion = valToConvert*6.5232;
					JOptionPane.showMessageDialog(null, valToConvert + " Euros, vale " + doisDigitos.format(conversion) + " Reais");
					
				}else if (moeda1 == 4 && moeda2 == 2) {
					//euro para dolar
					conversion = valToConvert*1.2179;
					JOptionPane.showMessageDialog(null, valToConvert + " Euros, vale " + doisDigitos.format(conversion) + " Dolares");
					
				}else if (moeda1 == 4 && moeda2 == 3) {
					//euro para libra
					conversion = valToConvert*0.8608;
					JOptionPane.showMessageDialog(null, valToConvert + " Euros, vale " + doisDigitos.format(conversion) + " Libras");
					
				}else {
					JOptionPane.showMessageDialog(null, "Opção não localizada");

				}
				
				
				
				
				
				
			}
		});
		btnConverter.setBounds(158, 144, 103, 21);
		contentPane.add(btnConverter);
	}
}
