package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {
	
//ATRIBUTOS
	public String nome;
	public double nota1, nota2;
	
//METODO MEDIA
	private double calculoMedia() {
		return (nota1+nota2)/2;
	}
	
//METODO SITUACAO
	private String situacao(double media) {
		return media>=7 ? "Aprovado" : "Reprovado";
	}
	
//METODO PARA RETORNAR A MEDIA E A SITUACAO
	public void mensagem() {
		double media = calculoMedia();
		String situacao = situacao(media);
		
		JOptionPane.showMessageDialog(null,"O aluno "+nome+" está "+situacao+", com média "+media);		
		
	}
	

}
