package exercicio03;

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



import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTable tabela;
	int indice;

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


//ARRAYLIST ALUNOS
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
//DTM DEFAULT TABLE MODEL
		DefaultTableModel dtm = new DefaultTableModel();
		dtm.addColumn("Nome");
		dtm.addColumn("Nota 1");
		dtm.addColumn("Nota 2");
		dtm.addColumn("Media");
		dtm.addColumn("Situacao");
		

//CRIACAO JPANEL
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//BOTOES
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 218, 85, 21);
		contentPane.add(btnCadastrar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(105, 218, 85, 21);
		contentPane.add(btnAlterar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setEnabled(false);
		btnRemover.setBounds(200, 218, 85, 21);
		contentPane.add(btnRemover);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(295, 218, 85, 21);
		contentPane.add(btnCancelar);
		
//LABELS
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 60, 45, 13);
		contentPane.add(lblNome);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(10, 114, 45, 13);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(10, 163, 45, 13);
		contentPane.add(lblNota2);
		
//TEXTOS DE ENTRADA
		txtNome = new JTextField();
		txtNome.setBounds(65, 57, 315, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		txtNota1.setBounds(65, 111, 98, 19);
		contentPane.add(txtNota1);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(65, 160, 98, 19);
		contentPane.add(txtNota2);
				
//BARRA DE ROLAGEM
		JScrollPane barraRolagem = new JScrollPane();
		barraRolagem.setBounds(10, 275, 368, 182);
		contentPane.add(barraRolagem);
//TABELA DE INFORMACOES
		
//adicionando nomes nas colunas
		tabela = new JTable(dtm);

		
//ACOES DA TABELA
		tabela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
//obter indice e exibir no lblNome
			indice=tabela.getSelectedRow();
			
//exibir dados no formulario
			txtNome.setText(alunos.get(indice).getNome());
			txtNota1.setText(String.valueOf(alunos.get(indice).getNota1()));
			txtNota2.setText(String.valueOf(alunos.get(indice).getNota2()));
			
//habilitar botoes
			btnCadastrar.setEnabled(false);
			btnAlterar.setEnabled(true);
			btnRemover.setEnabled(true);
			btnCancelar.setEnabled(true);
				
				
			}
		});
		
		barraRolagem.setViewportView(tabela);
		
//ACOES DO BOTAO CADASTRAR//
				btnCadastrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
		//VARIAVEIS - ENTRADA DE INFORMACOES - OBJETO ALUNO
					String nome = txtNome.getText();
					double nota1 = Integer.parseInt(txtNota1.getText());
					double nota2 = Integer.parseInt(txtNota2.getText());
					Aluno a = new Aluno(nome, nota1, nota2);
								
		//INSERIR DADOS NO ARRAYLIST
					alunos.add(a);
					
		//LIMPAR OS CAMPOS APOS CADASTRO / VOLTAR CURSOS PARA O CAMPO DO NOME
					txtNome.setText("");
					txtNota1.setText("");
					txtNota2.setText("");
					txtNome.requestFocus();
					
		//ATUALIZAR DADOS DA TABELA DTM
					dtm.setRowCount(0);
					for (int i=0; i<alunos.size(); i++) {
						dtm.addRow(new Object[] {
							alunos.get(i).getNome(),
							alunos.get(i).getNota1(),
							alunos.get(i).getNota2(),
							alunos.get(i).getMedia(),
							alunos.get(i).getSituacao(),
						}); 
					}
		//DEFINIR OS DADOS DA MINHA DTM
					tabela.setModel(dtm);
						
					}
				});
//FIM ACOES DO BOTAO CADASTRAR//
		
//ACOES BOTAO ALTERAR//
		btnAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
//OBTER DADOS
				String nome = txtNome.getText();
				double nota1 = Double.parseDouble(txtNota1.getText());
				double nota2 = Double.parseDouble(txtNota2.getText());
				
//INSTANCIAR A CLASSE ALUNO
				Aluno a = new Aluno(nome, nota1, nota2);
				
//CADASTRAR ARRAYLIST
				alunos.set(indice, a);
				
//LIMPAR OS CAMPOS
				txtNome.setText("");
				txtNota1.setText("");
				txtNota2.setText("");
				
//CURSOR NO CAMPO NOME
				txtNome.requestFocus();
				
//ATUALIZAR DEFAULT TABLE MODEL
				dtm.setRowCount(0);
				for (int i=0; i<alunos.size(); i++) {
					dtm.addRow(new Object[] {
						alunos.get(i).getNome(),
						alunos.get(i).getNota1(),
						alunos.get(i).getNota2(),
						alunos.get(i).getMedia(),
						alunos.get(i).getSituacao(),
					}); 
				}
//DEFINIR OS DADOS DA MINHA DTM			
				tabela.setModel(dtm);
				
//HABILITAR BOTOES
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnRemover.setEnabled(false);
				btnCancelar.setEnabled(false);

								
			}
		});
		
//FIM ACOES BOTAO ALTERAR
				

		

//ACOES BOTAO REMOVER
		btnRemover.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
//REMOVER OS DADOS DO ARRAYLIST
				alunos.remove(indice);
				
//LIMPAR OS CAMPOS
				txtNome.setText("");
				txtNota1.setText("");
				txtNota2.setText("");
				
//CURSOR NO CAMPO NOME
				txtNome.requestFocus();
				
//ATUALIZAR DEFAULT TABLE MODEL
				dtm.setRowCount(0);
				for (int i=0; i<alunos.size(); i++) {
					dtm.addRow(new Object[] {
						alunos.get(i).getNome(),
						alunos.get(i).getNota1(),
						alunos.get(i).getNota2(),
						alunos.get(i).getMedia(),
						alunos.get(i).getSituacao()
						
					});
				}
				
			}				
			
		});
//FIM ACOES BOTAO REMOVER
		
		
//ACOES BOTAO CANCELAR
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
//LIMPAR OS CAMPOS
				txtNome.setText("");
				txtNota1.setText("");
				txtNota2.setText("");
				
//HABILITAR BOTOES
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnRemover.setEnabled(false);
				btnCancelar.setEnabled(false);
				
			}
		});		
		
//FIM ACOES BOTAO CANCELAR
		
		
		
		
		
		
		
	}
}
