package while2;
/*Fa�a um programa que leia apenas os n�meros �mpares.
 */ 
import java.util.Scanner; 

public class exercicio9_NumerosImpares {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i< 50; i++) {
			
			//Resto de 2 que � igual a zero seja n�meros pares.
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
