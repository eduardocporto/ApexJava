package principal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import bd.Conexao;

public class Principal {

	public static void main(String[] args) {
		
//INICIANDO A CONEXAO
		Conexao.iniciarConexao();

//SQL 1
		String sql1 = "INSERT INTO usuarios VALUES (?, ?)";
//SQL 2
		String sql2 = "SELECT * FROM usuarios";

//TENTATIVA DE EXECUCAO
		try {
//PreparedStatment - EXECUTA UMA INSTRUCAO SQL COM PARAMETROS
			PreparedStatement pstmt = Conexao.conexao.prepareStatement(sql1);
			pstmt.setString(1, "Lucas");
			pstmt.setInt(2, 22);
			pstmt.execute();
			
//CreateStatement - EXECUTA UMA INSTRUCAO SQL SEM PARAMETROS
			Statement stmt = Conexao.conexao.createStatement();

//ResultSet - ARMAZENA RESULTADOS VINDOS DE UMA CONSULTA SQL
			ResultSet rs = stmt.executeQuery(sql2);
			
//LISTAR
			while(rs.next()) {
				System.out.println(rs.getString(1)+" - "+rs.getInt(2));
			}
			
			
		}catch(Exception erro) {
			
		}
		
		
//FINALIZAR CONEXADO
		Conexao.finalizarConexao();
	}

}
