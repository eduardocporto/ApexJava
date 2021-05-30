package calculoIMC;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;

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
		setTitle("CALCULO IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(90, 87, 45, 13);
		contentPane.add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(90, 113, 45, 13);
		contentPane.add(lblAltura);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(180, 84, 96, 19);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(180, 110, 96, 19);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblIMC = new JLabel("IMC:");
		lblIMC.setBounds(90, 187, 45, 13);
		contentPane.add(lblIMC);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(90, 210, 80, 13);
		contentPane.add(lblResultado);
		
		JLabel lblTitulo = new JLabel("Informe os valores abaixo");
		lblTitulo.setBounds(90, 26, 237, 29);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblTitulo);
		
		JPanel pnlResultado = new JPanel();
		pnlResultado.setBackground(Color.WHITE);
		pnlResultado.setBounds(180, 176, 223, 61);
		contentPane.add(pnlResultado);
		pnlResultado.setLayout(null);
		
		JLabel lblInfoIMC = new JLabel("");
		lblInfoIMC.setBounds(10, 10, 45, 13);
		pnlResultado.add(lblInfoIMC);
		
		JLabel lblInfoResultado = new JLabel("");
		lblInfoResultado.setBounds(10, 33, 203, 13);
		pnlResultado.add(lblInfoResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!txtPeso.getText().equals("") && !txtAltura.getText().equals("")) {
					
					double peso = Double.parseDouble(txtPeso.getText());
					double altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
					
					double imc = peso / (altura * altura);
					
					DecimalFormat doisDigitos = new DecimalFormat("#.00");
					String formatIMC = doisDigitos.format(imc);
					
					if (imc < 15) {
						lblInfoIMC.setText(formatIMC);
						lblInfoResultado.setText("Você está muito abaixo do peso");
					
					}else if (imc < 17.5) {
						lblInfoIMC.setText(formatIMC);
						lblInfoResultado.setText("Você está muito abaixo do peso");
						
					}else if (imc < 25) {
						lblInfoIMC.setText(formatIMC);
						lblInfoResultado.setText("Você está com o peso normal");
					
					}else if (imc < 30) {
						lblInfoIMC.setText(formatIMC);
						lblInfoResultado.setText("Você está acima do peso");
						
					}else if (imc > 30) {
						lblInfoIMC.setText(formatIMC);
						lblInfoResultado.setText("Você está com obesidade");						
						
					}
					
					
					
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos acima.");
				}
				
				
				
				
				
				
			}
		});
		btnCalcular.setBounds(180, 139, 85, 21);
		contentPane.add(btnCalcular);
	}
}
