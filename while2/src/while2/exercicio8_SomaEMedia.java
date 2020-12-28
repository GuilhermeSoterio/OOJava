package while2;
/*Faça um programa que leia 5 números e imprima a soma e a média deles.
 * 
 */
import java.util.Scanner;

public class exercicio8_SomaEMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = 0;
		double soma = 0;
		
		System.out.println("Digite a soma dos números");
		for(int i =0; i<5; i++) {
			
			num = scan.nextDouble();
			soma += num;
			
		}
		
		double media = soma/5;
		
		System.out.println("A média é: " + media);
	}

}
