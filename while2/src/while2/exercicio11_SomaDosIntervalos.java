package while2;

import java.util.Scanner;

/*Altere o programa anterior para mostrar no final a soma dos n�meros.
 * 
 */
public class exercicio11_SomaDosIntervalos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		System.out.println("Digite o primeiro n�mero");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		int num2 = scan.nextInt();
		
		for(int i= num1; i<num2;i++) {
			soma += i;
		
		}
		System.out.println("Soma dos n�meros:" + soma);
	}
}
