package conversorCriptoMoeda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtConversao;

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
		setTitle("CONVERSOR DE CRIPTOMOEDAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
//COLOCAR O JPANEL NO CENTRO DA TELA
		setLocationRelativeTo(null);

//CRIACAO RADIO BUTTONS		
		JRadioButton rdbtnBitcoin = new JRadioButton("Bitcoin");
		rdbtnBitcoin.setBounds(222, 60, 103, 21);
		contentPane.add(rdbtnBitcoin);
//DEFINIR VALOR AO RADIO BUTTON		
		rdbtnBitcoin.setActionCommand("bitcoin");		
		
		JRadioButton rdbtnBitcoin_1 = new JRadioButton("Bitcoin");
		rdbtnBitcoin_1.setBounds(222, 118, 103, 21);
		contentPane.add(rdbtnBitcoin_1);
		rdbtnBitcoin_1.setActionCommand("bitcoin_1");
		
		JRadioButton rdbtnLitecoin = new JRadioButton("Litecoin");
		rdbtnLitecoin.setBounds(327, 60, 103, 21);
		contentPane.add(rdbtnLitecoin);
		rdbtnLitecoin.setActionCommand("litecoin");
		
		JRadioButton rdbtnLitecoin_1 = new JRadioButton("Litecoin");
		rdbtnLitecoin_1.setBounds(327, 118, 103, 21);
		contentPane.add(rdbtnLitecoin_1);
		rdbtnLitecoin_1.setActionCommand("litecoin_1");
		
		JRadioButton rdbtnDoge = new JRadioButton("Doge");
		rdbtnDoge.setBounds(432, 60, 103, 21);
		contentPane.add(rdbtnDoge);
		rdbtnDoge.setActionCommand("doge");
		
		JRadioButton rdbtnDoge_1 = new JRadioButton("Doge");
		rdbtnDoge_1.setBounds(432, 118, 103, 21);
		contentPane.add(rdbtnDoge_1);
		rdbtnDoge_1.setActionCommand("doge_1");
				
		JRadioButton rdbtnXrp = new JRadioButton("Xrp");
		rdbtnXrp.setBounds(537, 60, 103, 21);
		contentPane.add(rdbtnXrp);
		rdbtnXrp.setActionCommand("xrp");
		
		JRadioButton rdbtnXrp_1 = new JRadioButton("Xrp");
		rdbtnXrp_1.setBounds(537, 118, 103, 21);
		contentPane.add(rdbtnXrp_1);
		rdbtnXrp_1.setActionCommand("xrp_1");
		
//GRUPO RADIO BUTTON
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnBitcoin);
		grupo.add(rdbtnLitecoin);
		grupo.add(rdbtnDoge);
		grupo.add(rdbtnXrp);
		
//GRUPO RADIO BUTTON
		ButtonGroup grupo_1 = new ButtonGroup();
		grupo_1.add(rdbtnBitcoin_1);
		grupo_1.add(rdbtnLitecoin_1);
		grupo_1.add(rdbtnDoge_1);
		grupo_1.add(rdbtnXrp_1);
		
		JLabel lblMoeda = new JLabel("CONVERTER DA MOEDA");
		lblMoeda.setBounds(10, 64, 206, 13);
		contentPane.add(lblMoeda);
		
		JLabel lblMoeda_1 = new JLabel("PARA A MOEDA");
		lblMoeda_1.setBounds(10, 122, 206, 13);
		contentPane.add(lblMoeda_1);
		
		JLabel lblTitulo = new JLabel("SELECIONE AS MOEDAS PARA CONVERSAO");
		lblTitulo.setBounds(10, 22, 630, 13);
		contentPane.add(lblTitulo);
	
//CRIACAO DO BOTAO CONVERTER		
		JButton btnConversao = new JButton("CONVERTER");
		btnConversao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//INICIANDO ACOES DO BOTAO CONVERTER
				
//VARIAVEIS				
		
		//variaveis de selecao de moedas
		String moeda = grupo.getSelection().getActionCommand();
		String moeda_1 = grupo_1.getSelection().getActionCommand();
		
		//variavel para valor de entrada do usuario
		double valorConversao = Double.parseDouble(txtConversao.getText());
		//variavel para fazer o calculo de convercao
		double calculoConversao = 0;
				
		
//FORMATANDO COM DOIS ZEROS APOS A VIRGULA O VALOR DE ENTRADA DO USUARIO		
		DecimalFormat doisDigitos = new DecimalFormat("#.00");
		String formatIMC = doisDigitos.format(valorConversao);
				
//LOGICA PARA ACAO
	
//		Bitcoin
//		Litecoin
//		Doge
//		XRP

// BITCOIN PARA LITECOIN		
				if (moeda == "bitcoin" && moeda_1 == "litecoin_1") {
					calculoConversao = valorConversao * 204.10;
					JOptionPane.showMessageDialog(null, "O valor convertido é: " + calculoConversao);
//BITCOIN PARA DOGE					
				}else if (moeda == "bitcoin" && moeda_1 == "doge_1") {

					calculoConversao = valorConversao * 114.918;
					JOptionPane.showMessageDialog(null, "O valor convertido é: " + calculoConversao);
//BITCOIN PARA XRP					
				}else if (moeda == "bitcoin" && moeda_1 == "xrp_1") {

					calculoConversao = valorConversao * 39.934;
					JOptionPane.showMessageDialog(null, "O valor convertido é: " + calculoConversao);

//LITECOIN PARA BITCOIN					
				}else if (moeda == "litecoin" && moeda_1 == "bitcoin_1") {

					calculoConversao = valorConversao * 0.00494155;
					JOptionPane.showMessageDialog(null, "O valor convertido é: " + calculoConversao);
//LITECOIN PARA DOGE					
				}else if (moeda == "litecoin" && moeda_1 == "doge_1") {

					calculoConversao = valorConversao * 569.21615074;
					JOptionPane.showMessageDialog(null, "O valor convertido é: " + calculoConversao);
//LITECOIN PARA XRP					
				}else if (moeda == "litecoin" && moeda_1 == "xrp_1") {

					calculoConversao = valorConversao * 197.68967105;
					JOptionPane.showMessageDialog(null, "O valor convertido é: " + calculoConversao);
//DOGE PARA BITCOIN					
				}else if (moeda == "doge" && moeda_1 == "bitcoin_1") {

					calculoConversao = valorConversao * 0.00000869;
					JOptionPane.showMessageDialog(null, "O valor convertido é: " + calculoConversao);
//DOGE PARA LITECOIN					
				}else if (moeda == "doge" && moeda_1 == "litecoin_1") {

					calculoConversao = valorConversao * 0.00175544;
					JOptionPane.showMessageDialog(null, "O valor convertido é: " + calculoConversao);
//DOGE PARA XRP					
				}else if (moeda == "doge" && moeda_1 == "xrp_1") {

					calculoConversao = valorConversao * 0.34747507;
					JOptionPane.showMessageDialog(null, "O valor convertido é: " + calculoConversao);
//XRP PARA BITCOIN					
				}else if (moeda == "xrp" && moeda_1 == "bitcoin_1") {

					calculoConversao = valorConversao * 0.00002506;
					JOptionPane.showMessageDialog(null, "O valor convertido é: " + calculoConversao);
//XRP PARA LITECOIN					
				}else if (moeda == "xrp" && moeda_1 == "litecoin_1") {

					calculoConversao = valorConversao * 0.00505465;
					JOptionPane.showMessageDialog(null, "O valor convertido é: " + calculoConversao);
//XRP PARA DOGE					
				}else if (moeda == "xrp" && moeda_1 == "doge_1") {

					calculoConversao = valorConversao * 2.88259273;
					JOptionPane.showMessageDialog(null, "O valor convertido é: " + calculoConversao);
				}else {
					JOptionPane.showMessageDialog(null, "Selecione outra moeda como resultado");
				}	
				
				
				
				
				
			}
		});
		btnConversao.setBounds(327, 232, 138, 21);
		contentPane.add(btnConversao);
		
		JLabel lblConversao = new JLabel("VALOR PARA CONVERSAO:");
		lblConversao.setBounds(10, 182, 165, 13);
		contentPane.add(lblConversao);
		
		txtConversao = new JTextField();
		txtConversao.setBounds(185, 179, 96, 19);
		contentPane.add(txtConversao);
		txtConversao.setColumns(10);
	}
}
