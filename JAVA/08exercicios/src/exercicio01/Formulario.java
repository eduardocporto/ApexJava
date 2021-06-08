package exercicio01;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Formulario extends JFrame {
	
//CRIANDO O MEU ARRAYLIST
	ArrayList<Pessoa> vetor = new ArrayList<Pessoa>();

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtCidade;
	private JTable tblPessoas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(21, 30, 45, 13);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(21, 85, 45, 13);
		contentPane.add(lblIdade);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(21, 136, 45, 13);
		contentPane.add(lblCidade);
		
		txtNome = new JTextField();
		txtNome.setBounds(76, 27, 328, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(76, 82, 328, 19);
		contentPane.add(txtIdade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(76, 133, 328, 19);
		contentPane.add(txtCidade);

//CRIANDO DEFAULT TABLE MODEL - ESPECIFICAR AS COLUNAS E LINHAS DENTRO DO SCRLTABELA		
		DefaultTableModel dtm = new DefaultTableModel();
		tblPessoas = new JTable(dtm);
		
//ACOES DO MEU BOTAO		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//OBTER DADOS
				String nome = txtNome.getText();
				int idade = Integer.parseInt(txtIdade.getText());
				String cidade = txtCidade.getText();
				
//CRIAR OBJETOS
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setIdade(idade);
				p.setCidade(cidade);
				
//ADICIONAR O ARRAY
				vetor.add(p);
				
//LIMPAR DEFAULT TABLE MODEL
				dtm.setRowCount(0);
				
//CADASTRAR DADOS NO DEFAULT TABLE MODEL
				for (int i=0; i<vetor.size(); i++) {
					dtm.addRow(new Object[] {
							vetor.get(i).getNome(),
							vetor.get(i).getIdade(),
							vetor.get(i).getCidade()
					});
				}
				
//ATUALIZAR DEFAULT TABLE MODEL
				tblPessoas.setModel(dtm);
				
//EXIBIR CONTAGEM DE CADASTROS
				System.out.println(vetor.size());
								
//LIMPAR OS CAMPOS
				txtNome.setText("");
				txtIdade.setText("");
				txtCidade.setText("");
								
			}
		});
		btnCadastrar.setBounds(176, 199, 103, 21);
		contentPane.add(btnCadastrar);
	
//CONTINUACAO DO DEFAULT TABLE MODEL
		
		dtm.addColumn("Nome");
		dtm.addColumn("Idade");
		dtm.addColumn("Cidade");
				
		JScrollPane scrlTabelas = new JScrollPane();
		scrlTabelas.setBounds(76, 238, 328, 203);
		contentPane.add(scrlTabelas);
		
		
//ADICIONANDO AS COLUNAS NO SCRLTABLE		
		tblPessoas= new JTable(dtm);
		scrlTabelas.setViewportView(tblPessoas);
	}
}
