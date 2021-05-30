package numerosSucessoresAntecessores;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	//Informe um número, retorne os cinco antecessores e os cinco sucessores
	
	JOptionPane.showMessageDialog(null, "Informe um número para saber os seus sucessores e antecessores");
		
	int num = Integer.parseInt(JOptionPane.showInputDialog("Informe uma valor"));
			
	int[] menores = new int[5];
	int[] maiores = new int[5];

	int i = 0;
	
	int indexMaiores = num;
	int indexMenores = num;

//	while (i < 4) {
//		maiores[i] = num++;
//		i++;
//		
//	}
	
	do {
		indexMaiores++;
		maiores[i] = indexMaiores;
		i++;
		
		
		
	} while (i < 5);
	
	i = 0;
	
	do {
		indexMenores--;
		menores[i] = indexMenores;
		i++;
		
	} while (i < 5);
	
		
	String listaMaiores = maiores[0] + ", " + maiores[1] + ", " + maiores[2] + ", " + 
	maiores[3] + ", " + maiores[4];
	
	String listaMenores = menores[0] + ", " + menores[1] + ", " + menores[2] + ", " + 
	menores[3] + ", " + menores[4];
	
	JOptionPane.showMessageDialog(null, "Sucessores de " + num + " => " + listaMaiores + "\nAntecessores de " + num + " => " + listaMenores);
	
	
	}

}
