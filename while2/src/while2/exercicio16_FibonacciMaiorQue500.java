package while2;

import java.util.Scanner;

/*
 *A série de Fibonacci é formada pela sequência 0,1,1,2,3,5,8,13,21,34,55... Faça um programa que gere a série até 
 * que o valor seja maior que 500
 */
public class exercicio16_FibonacciMaiorQue500 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		int cont = 0;
		
		while (proximo <= 500) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			cont++;
			System.out.println("Proximo numero " + proximo);
		}
		
		System.out.println("Contagem " + cont);
		
	}
}
