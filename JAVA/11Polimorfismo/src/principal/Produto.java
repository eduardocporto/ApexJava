package principal;

public class Produto {
	
//IMPOSTO MUNICIPAL
	//metodo publicos
	public void im(double valor)
	{System.out.println("Importo municipal - Padrao R$"+(valor*0.02));
	}
//IMPOSTO ESTADUAL
	//metodo publicos
	public void ie(double valor)
	{System.out.println("Importo estadual - Padrao R$"+(valor*0.04));
	}
//IMPORTO FEDERAL
	//metodo publicos
	public void ifd(double valor)
	{System.out.println("Importo federal - Padrao R$"+(valor*0.05));
	}

}
