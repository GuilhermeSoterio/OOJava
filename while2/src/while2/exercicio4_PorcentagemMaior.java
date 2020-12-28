package while2;
/*Faça um programa que calcule e escreva o número de anos necessários para que a população dos país A
 * Ultrapasse o país B, mantidas as taxas de crescimento  
 * */
import java.util.Scanner;

public class exercicio4_PorcentagemMaior {
	public static void main(String[] args) {

		int populaA = 80000;
		int populaB = 200000;
		int cont = 0;
		
		while (populaA < populaB) {
			populaA += (populaA/100) * 3;
			populaB += (populaB/100) * 1.5;
			cont++;
		}
		System.out.println("População A: " + populaA);
		System.out.println("População B: " + populaB);
		System.out.println("Quantidade de anos: " + cont);
		
	}

}
