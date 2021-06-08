package exercicio02;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTurma;
	private JTable tabela;
	
	//CRIANDO VARIAVEL INDICE
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
		
//ARRAYLIST - ALUNO
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
//CRIANDO COMBO BOX CURSO
		JComboBox cbxCurso = new JComboBox();
		
//CRIANDO DEFAULT TABLE MODEL
		DefaultTableModel dtm = new DefaultTableModel();
				dtm.addColumn("Nome");
				dtm.addColumn("Curso");
				dtm.addColumn("Valor");
				dtm.addColumn("Turma");
		
//CRIAR BOTOES
		JButton btnRemover = new JButton("Remover");
		JButton btnCadastrar = new JButton("Cadastrar");
		JButton btnAlterar = new JButton("Alterar");
		JButton btnCancelar = new JButton("Cancelar");
		
//ACOES DO BOTAO ALTERAR
		btnAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
//EXTRAIR NOME DO CURSO E VALOR (JComboBox)
				Cursos obj = (Cursos) cbxCurso.getSelectedItem();
				
//OBTER DADOS
				String nome = txtNome.getText();
				String curso = obj.getNome();
				double valor = obj.getValor();
				String turma = txtTurma.getText();
				
//INSTANCIAR OBJETO DA CLASSE ALUNO
				Aluno a = new Aluno(nome, curso, turma, valor);
				
//CADASTRAR ARRAYLIST
				alunos.set(indice, a);
				
//LIMPAR OS CAMPOS
				txtNome.setText("");
				cbxCurso.setSelectedIndex(0);
				txtTurma.setText("");
				
//CURSOR NO CAMPO NOME
				txtNome.requestFocus();
				
//ATUALIZAR TABELA DEFAULTTABLEMODEL E JTABLE
				dtm.setRowCount(0);
				for (int i=0; i<alunos.size(); i++) {
					dtm.addRow(new Object[] {
						alunos.get(i).getNome(),
						alunos.get(i).getCurso(),
						alunos.get(i).getValor(),
						alunos.get(i).getTurma(),
							
					});
				}
				tabela.setModel(dtm);
				//HABILITAR BOTOES CANCELAR
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnRemover.setEnabled(false);
				btnCancelar.setEnabled(false);
			}
		});


				
		btnRemover.addMouseListener(new MouseAdapter() {
			
//ACAO BOTAO REMOVER
			@Override
			public void mouseReleased(MouseEvent e) {
				
//REMOVER DO ARRAYLIST
				alunos.remove(indice);
//LIMPAR OS CAMPOS
				txtNome.setText("");
				cbxCurso.setSelectedIndex(0);
				txtTurma.setText("");
				
//CURSOR NO CAMPO NOME
				txtNome.requestFocus();
				
//ATUALIZAR TABELA DEFAULTTABLEMODEL E JTABLE
				dtm.setRowCount(0);
				for (int i=0; i<alunos.size(); i++) {
					dtm.addRow(new Object[] {
						alunos.get(i).getNome(),
						alunos.get(i).getCurso(),
						alunos.get(i).getValor(),
						alunos.get(i).getTurma(),
							
					});
				}
				tabela.setModel(dtm);
				
				//HABILITAR BOTOES CANCELAR
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnRemover.setEnabled(false);
				btnCancelar.setEnabled(false);
				
			}
		});
		
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
//ACAO DO BOTAO CANCELAR 
			public void mouseReleased(MouseEvent e) {
			txtNome.setText("");
			cbxCurso.setSelectedIndex(0);
			txtTurma.setText("");
			
//HABILITAR BOTOES CANCELAR
			btnCadastrar.setEnabled(true);
			btnAlterar.setEnabled(false);
			btnRemover.setEnabled(false);
			btnCancelar.setEnabled(false);
			
			}
		});
		
		
//CARREGAR CURSOS
		Cursos c1 = new Cursos("Java", 5000);
		Cursos c2 = new Cursos("C#", 4800);
		Cursos c3 = new Cursos("Python", 3300);
		Cursos c4 = new Cursos("Front-End", 4500);
		Cursos c5 = new Cursos("PHP", 3500);
		
//ARRAY LIST
		ArrayList<Cursos> cursos = new ArrayList<Cursos>();
		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);
		cursos.add(c4);
		cursos.add(c5);
		
//MODELO COMBO BOX
		DefaultComboBoxModel<Cursos> dtCbx = new DefaultComboBoxModel<Cursos>();
		for (int i=0; i<cursos.size(); i++) {
			dtCbx.addElement(cursos.get(i));
		}
		
		
		
		
		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		cbxCurso.setBounds(65, 115, 411, 21);
//COLOCANDO A LISTAGEM DENTRO DO MEU COMBO BOX
		contentPane.add(cbxCurso);
		cbxCurso.setModel(dtCbx);
		
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 71, 466, 13);
		contentPane.add(lblNome);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(10, 119, 466, 13);
		contentPane.add(lblCurso);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setBounds(10, 169, 466, 13);
		contentPane.add(lblTurma);
		
		txtNome = new JTextField();
		txtNome.setBounds(65, 68, 411, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtTurma = new JTextField();
		txtTurma.setColumns(10);
		txtTurma.setBounds(65, 166, 411, 19);
		contentPane.add(txtTurma);
		
				

		
		JScrollPane barraRolagem = new JScrollPane();
		barraRolagem.setBounds(32, 279, 444, 209);
		contentPane.add(barraRolagem);
//ADICIONANDO NOME DAS COLUNAS
		tabela = new JTable(dtm);
//ACOES DA TABELA
		tabela.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				
//OBTER O INDICE E EXIBIR NA TABELA				
			indice = tabela.getSelectedRow();
				
//EXIBIR OS DADOS NO FORMULARIO
				txtNome.setText(alunos.get(indice).getNome());
				txtTurma.setText(alunos.get(indice).getTurma());
				
				String cursoSelecionado = alunos.get(indice).getCurso();
				
				for (int i=0; i<cursos.size(); i++) {
					if(cursoSelecionado.equals(cursos.get(i).getNome())) {
						cbxCurso.setSelectedIndex(i);
						break;
					}
				}
				
//HABILITAR OS BOTOES
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnRemover.setEnabled(true);
				btnCancelar.setEnabled(true);
				
												
				System.out.print(tabela.getSelectedRow());
			}
		});
		
		
		
		barraRolagem.setViewportView(tabela);
		

		
//ACOES BOTAO CADASTRAR
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//EXTRAIR NOME DO CURSO E VALOR (JComboBox)
				Cursos obj = (Cursos) cbxCurso.getSelectedItem();
				
//OBTER DADOS
				String nome = txtNome.getText();
				String curso = obj.getNome();
				double valor = obj.getValor();
				String turma = txtTurma.getText();
				
//INSTANCIAR OBJETO DA CLASSE ALUNO
				Aluno a = new Aluno(nome, curso, turma, valor);
				
//CADASTRAR ARRAYLIST
				alunos.add(a);
				
//LIMPAR OS CAMPOS
				txtNome.setText("");
				cbxCurso.setSelectedIndex(0);
				txtTurma.setText("");
				
//CURSOR NO CAMPO NOME
				txtNome.requestFocus();
				
//ATUALIZAR TABELA DEFAULTTABLEMODEL E JTABLE
				dtm.setRowCount(0);
				for (int i=0; i<alunos.size(); i++) {
					dtm.addRow(new Object[] {
						alunos.get(i).getNome(),
						alunos.get(i).getCurso(),
						alunos.get(i).getValor(),
						alunos.get(i).getTurma(),
							
					});
				}
				
				tabela.setModel(dtm);
				
				System.out.println(nome);
				System.out.println(curso);
				System.out.println(valor);
				System.out.println(turma);
								
				
			}
		});
		btnCadastrar.setBounds(32, 229, 102, 21);
		contentPane.add(btnCadastrar);
		

//BOTAO ALTERAR
		
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(144, 229, 102, 21);
		contentPane.add(btnAlterar);
		
		
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//HABILITAR BOTOES REMOVER
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnRemover.setEnabled(false);
				btnCancelar.setEnabled(false);
				
			}
		});
		btnRemover.setEnabled(false);
		btnRemover.setBounds(256, 229, 102, 21);
		contentPane.add(btnRemover);
		
		
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(374, 229, 102, 21);
		contentPane.add(btnCancelar);
		

	}
}
