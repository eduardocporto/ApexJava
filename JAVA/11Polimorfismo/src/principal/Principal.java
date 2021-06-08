package principal;

public class Principal {
	public static void main(String[] args) {
		
//INSTANCIAR OBJETO - ao adicionar a classe Eletronico, ele sobrescreve as informacoes vindas da classe Produto (pois possui a definicao especifica)
	Produto p = new Eletronico();
		{	p.im(100);
			p.ie(100);
			p.ifd(100);
		}
		
	}

}
