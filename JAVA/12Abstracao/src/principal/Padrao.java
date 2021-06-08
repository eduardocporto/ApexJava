package principal;

public abstract class Padrao {

//SOMAR
	public abstract void somar(int n1, int n2);
//SUBTRAIR
	public abstract void subtrair(int n1, int n2);
//MULTIPLICAR SEM ABSTRACAO
	public void mutiplicar(int n1, int n2) 
	{
		System.out.println("A multiplicacao é "+(n1*n2));
	}

}
