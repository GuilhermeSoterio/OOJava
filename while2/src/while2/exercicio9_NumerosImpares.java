package while2;
/*Faça um programa que leia apenas os números ímpares.
 */ 
import java.util.Scanner; 

public class exercicio9_NumerosImpares {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i< 50; i++) {
			
			//Resto de 2 que é igual a zero seja números pares.
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
