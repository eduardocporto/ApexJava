package bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
//ATRIBUTO ESTATICO PARA CONEXAO COM O BANCO
	public static Connection conexao = null;
	
//ATRIBUTOS PARA EFETUAR CONEXAO
	private static final String usuario = "root";
	private static final String senha = "Aa.12345";
	private static final String base = "java";
	private static final String timeZone = "?useTimezone=true&serverTimezone=UTC";
	
//METODO PARA INICIAR CONEXAO
	public static void iniciarConexao() {	
	try {
		conexao = DriverManager.getConnection("jdbc:mysql://localhost/"+base+timeZone, usuario, senha);
		//System.out.println("Conexao ok");
		
	} catch(Exception erro) {
		System.out.println("Falha ao conectar "+erro.getMessage());
	}
}
	
//FINALIZAR CONEXAO
	public static void finalizarConexao() {
		try {
			conexao.close();
			
		} catch(Exception erro) {
			System.out.println("Falha ao finalizar conexao");
		}
	}

}
