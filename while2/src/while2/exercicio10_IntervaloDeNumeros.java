package while2;

import java.util.Scanner;

/*Fa�a um programa que imprima na tela apenas os n�meros inteiros e gere os numeros inteiros que est�o no intervalo compreendido por eles
 */
public class exercicio10_IntervaloDeNumeros {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero");
		int num1 = scan.nextInt();
		num1 += 1;
		
		System.out.println("Entre com o segundo n�mero");
		int num2 = scan.nextInt();
		num2 -= 1;
		for(int i=num1; i<= num2 ; i++) {
			System.out.print(i);
		}
	}
}
