package exemplo01;

public class Principal {
	
	public static void main(String[] args) {
		
//INSTANCIAR UM OBJETO DA CLASSE CARRO
	Carro objeto = new Carro ();
//DANDO CARACTERISTICAS PARA O MEU OBJETO	
	objeto.fabricante = "Hyundai";
	objeto.modelo = "HB 20";
	objeto.ano = 2019;
	objeto.valor = 89000;
	objeto.mensagem();
		
		
	}

}
