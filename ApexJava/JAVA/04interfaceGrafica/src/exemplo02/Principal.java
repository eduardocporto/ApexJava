package exemplo02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
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
		
		JComboBox cbxCidades = new JComboBox();
		cbxCidades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switch(cbxCidades.getSelectedIndex()) {
					case 0:
						JOptionPane.showMessageDialog(null, "Informe uma cidade");
					break;
					
					case 1:
						JOptionPane.showMessageDialog(null, "Pólo de tecnologia da Informação");
					break;
					
					case 2:
						JOptionPane.showMessageDialog(null, "Capital do estado de Santa Catarina");
					break;
					
					case 3:
						JOptionPane.showMessageDialog(null, "Maior cidade Catarinense");
					break;		
									
				}
				
			}
		});
		cbxCidades.setModel(new DefaultComboBoxModel(new String[] {"Cidade", "Blumenau", "Florian\u00F3polis", "Joinville"}));
		cbxCidades.setBounds(70, 10, 314, 21);
		contentPane.add(cbxCidades);
	}
}
