package principal;

public class Eletronico extends Produto{
	
//IMPOSTO FEDERAL
	public void ifd(double valor)
	{
		System.out.println("Importo Federal - Eletronicos R$"+(valor*0.1));
	}

}
