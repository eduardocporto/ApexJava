package exercicio04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import exercicio02.Cursos;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtQuantidade;
	private JTable tabela;
//VARIAVEL INDICE E QUANTIDADE PARA CONTAR COLUNAS DA MINHA TABELA
	int indice;
	int quantidade;
	
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
		

//ARRAYLIST PRODUTOS
		ArrayList <Produto> carrinho = new ArrayList<Produto>();
		
//CRIANDO COMBOBOX PRODUTOS
		JComboBox cbxProduto = new JComboBox();
		
//DEFAULT TABEL MODEL
		DefaultTableModel dtm = new DefaultTableModel();
		//adicionando as colunas ao dtm
		dtm.addColumn("Produto");
		dtm.addColumn("Marca");
		dtm.addColumn("Valor");
		dtm.addColumn("Quantidade");
		
//CRIANDO BOTOES
		JButton btnLimpar = new JButton("Limpar");
		JButton btnAdicionar = new JButton("Adicionar");
		
//ACOES DO BOTAO LIMPAR
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
//EXTRAIR NOME DO PRODUTO E VALOR
			Produto obj = (Produto) cbxProduto.getSelectedItem();
			
//OBTER DADOS
			String produto = obj.getNomeProduto();
			//int quantidade = txtQuantidade.getText();
			
			
				
			}
		});
		
//FIM ACAO DO BOTAO LIMPAR

		
//CARREGAR PRODUTOS
		Produto p1 = new Produto("Redmi Note 10", "Xiaomi", 1309);
		Produto p2 = new Produto("Galaxy S20", "Samsung", 2299);
		Produto p3 = new Produto("Moto G 5G Plus", "Motorola", 1952);
		Produto p4 = new Produto("Iphone XR 64GB", "Apple", 3254);
		
//CRIANDO ARRAYLIST QUE SERA USADO NO COMBOBOX
		ArrayList<Produto> produtos = new ArrayList<Produto>();
//ADICIONANDO PRODUTOS NO COMBOBOX
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);

//CRIANDO DEFAULT COMBO BOX MODEL
		DefaultComboBoxModel<Produto> dftCbx = new DefaultComboBoxModel<Produto>();
		for (int i=0; i<produtos.size(); i++) {
			dftCbx.addElement(produtos.get(i));
		}	
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//ADICIONAIS DOS JBUTTONS
		btnAdicionar.setBounds(37, 211, 108, 21);
		contentPane.add(btnAdicionar);
		
		btnLimpar.setEnabled(false);
		btnLimpar.setBounds(155, 211, 85, 21);
		contentPane.add(btnLimpar);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(37, 37, 75, 13);
		contentPane.add(lblProduto);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(37, 116, 75, 13);
		contentPane.add(lblMarca);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(37, 154, 75, 13);
		contentPane.add(lblValor);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(37, 79, 75, 13);
		contentPane.add(lblQuantidade);
		
		
		cbxProduto.setBounds(122, 33, 500, 21);
//ADICIONANDO OS PRODUTOS DO ARRAY LIST AO COMBOBOX
		contentPane.add(cbxProduto);
		cbxProduto.setModel(dftCbx);
		
		JLabel lblNomeMarca = new JLabel("");
		lblNomeMarca.setBounds(122, 116, 75, 13);
		contentPane.add(lblNomeMarca);
		
		JLabel lblValorProduto = new JLabel("");
		lblValorProduto.setBounds(122, 154, 75, 13);
		contentPane.add(lblValorProduto);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(122, 76, 135, 19);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JScrollPane carrinhoCompras = new JScrollPane();
		carrinhoCompras.setBounds(37, 257, 585, 264);
		contentPane.add(carrinhoCompras);
		
//TABELA DO CARRINHO DE COMPRAS
		//por padrão ela é criada sem o dtm, apenas adicionei o (dtm) para mostrar as colunas
		tabela = new JTable(dtm);
//ACOES TABELA

		carrinhoCompras.setViewportView(tabela);
		
		

		
		
//ACOES BOTAO ADICIONAR

				
		//extrair nome do produto, marca e valor
//		Produto obj = (Produto) cbxProduto.getSelectedItem();
				
		//obter dados editaveis
//		String produto = obj.getNomeProduto();
//		String marca = obj.getMarca();
//		double valor = obj.getValor();
//		quantidade = Integer.parseInt(txtQuantidade.getText());
		
		//instanciar o objeto da classe Produto
//		Produto p = new Produto(produto, marca, valor);
		
		//cadastrar ArrayList
///		produtos.add(p);
		
		//limpar campo quantidade
//		txtQuantidade.setText("");
		
		//atualizar tabela DefaultTableModel
//		dtm.setRowCount(0);
//		for(int i=0; i<produtos.size(); i++) {
//			dtm.addRow(new Object[] {
//					produtos.get(i).getNomeProduto(),
//					produtos.get(i).getMarca(),
//					produtos.get(i).getValor(),
//					produtos.get(i).getQuantidade(),			
//			});
//		}
				
				
				
			}
//		});
//FIM ACOES BOTAO ADICIONAR
		

	}
