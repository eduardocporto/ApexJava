package exemplo03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
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
		
		JRadioButton rdbtnJava = new JRadioButton("Java");
		rdbtnJava.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnJava.setBounds(75, 53, 103, 21);
		rdbtnJava.setActionCommand("JAVA");
		contentPane.add(rdbtnJava);
		
		JRadioButton rdbtnCSharp = new JRadioButton("C#");
		rdbtnCSharp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnCSharp.setBounds(180, 53, 103, 21);
		rdbtnCSharp.setActionCommand("C#");
		contentPane.add(rdbtnCSharp);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnJava);
		grupo.add(rdbtnCSharp);
		
		JButton btnVerificar = new JButton("New button");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, grupo.getSelection().getActionCommand());
				
			}
		});
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVerificar.setBounds(123, 97, 85, 21);
		contentPane.add(btnVerificar);

		}
}
