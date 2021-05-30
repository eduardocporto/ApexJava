package checkBox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon("C:\\Users\\eduar\\OneDrive\\DESENVOLVIMENTO\\cursoApex\\JAVA\\04interfaceGrafica\\image\\user.png"));
		lblImage.setBounds(158, 31, 128, 128);
		contentPane.add(lblImage);
		
		JCheckBox ckbFrontEnd = new JCheckBox("Front-End");
		ckbFrontEnd.setBounds(80, 176, 93, 21);
		contentPane.add(ckbFrontEnd);
		
		JCheckBox ckbDevJava = new JCheckBox("Dev. Java");
		ckbDevJava.setBounds(175, 176, 93, 21);
		contentPane.add(ckbDevJava);
		
		JCheckBox ckbDevCSharp = new JCheckBox("Dev. C#");
		ckbDevCSharp.setBounds(270, 176, 93, 21);
		contentPane.add(ckbDevCSharp);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Mensagem 
				String mensagem = "Você selecionou:\n";
				
				//Verifica se houve seleção
				boolean checar = false;
				
				//Validar checkbox
				if (ckbFrontEnd.isSelected()) {
					mensagem += "Front-End\n";
					checar = true;
				}
				
				if (ckbDevJava.isSelected()) {
					mensagem += "Dev. Java\n";
					checar = true;
				}
				
				if (ckbDevCSharp.isSelected()) {
					mensagem += "Dev. C#\n";
					checar = true;
				}
				
				//Exibindo mensagem
				JOptionPane.showMessageDialog(null, checar == true ? mensagem : "Selecione um cargo");
				
			}
		});
		btnEnviar.setBounds(175, 219, 85, 21);
		contentPane.add(btnEnviar);
	}
}
