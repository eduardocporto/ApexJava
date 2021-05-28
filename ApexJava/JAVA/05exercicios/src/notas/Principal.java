package notas;

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
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtSemestre1;
	private JTextField txtSemestre2;
	private JTextField txtSemestre3;

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
		setTitle("NOTAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// COMANDO PARA COLOCAR O JPANEL NO CENTRO DA TELA
		setLocationRelativeTo(null);
		
		JLabel lblSemestre1 = new JLabel("1\u00BA Semestre:");
		lblSemestre1.setBounds(42, 91, 83, 13);
		contentPane.add(lblSemestre1);
		
		txtSemestre1 = new JTextField();
		txtSemestre1.setBounds(135, 91, 96, 19);
		contentPane.add(txtSemestre1);
		txtSemestre1.setColumns(10);
		
		JLabel lblSemestre2 = new JLabel("2\u00BA Semestre:");
		lblSemestre2.setBounds(42, 120, 83, 13);
		contentPane.add(lblSemestre2);
		
		txtSemestre2 = new JTextField();
		txtSemestre2.setBounds(135, 120, 96, 19);
		contentPane.add(txtSemestre2);
		txtSemestre2.setColumns(10);
		
		JLabel lblSemestre3 = new JLabel("3\u00BA Semestre:");
		lblSemestre3.setBounds(42, 149, 83, 13);
		contentPane.add(lblSemestre3);
		
		txtSemestre3 = new JTextField();
		txtSemestre3.setBounds(135, 149, 96, 19);
		contentPane.add(txtSemestre3);
		txtSemestre3.setColumns(10);
		
		JLabel lblTituloNota = new JLabel("INFORME AS NOTAS DO ALUNO");
		lblTituloNota.setBounds(42, 34, 189, 13);
		contentPane.add(lblTituloNota);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// soma dos valores
				double calculo = 0;			
				
				//Mostrar resultado
				
				
				// SEMPRE QUE A COMPARA플O FOR COM STRINGS, E NECESSARIO USAR O EQUALS E O "!" FOI USADO PARA NEGAR A INFORMA플O "nao igual"
				if (!txtSemestre1.getText().equals("") && !txtSemestre2.getText().equals("") && !txtSemestre3.getText().equals("")) {
					calculo = (Double.parseDouble(txtSemestre1.getText()) + Double.parseDouble(txtSemestre2.getText()) + Double.parseDouble(txtSemestre3.getText())) /3;
					
					// COMANDO PARA A CRIA플O DE UM FORMATO DE NUMERA플O PUXANDO O FORMATO DO MEU SISTEMA WINDOWS
					DecimalFormat df = new DecimalFormat("#.00");
					String novoCalculo = df.format(calculo);
					
				if(calculo >= 6) {
					JOptionPane.showMessageDialog(null, "Aluno aprovado, com nota final: " + novoCalculo);
				} else {
					JOptionPane.showMessageDialog(null, "Aluno reprovado, com nota final: " + novoCalculo);
				}
				
				}else {
					JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos acima.");
				}
				
					
				
			}
		});
		btnOk.setBounds(89, 232, 96, 21);
		contentPane.add(btnOk);
	}
}
