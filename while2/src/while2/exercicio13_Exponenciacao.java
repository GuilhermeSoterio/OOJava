package while2;
/*Fa�a um programa que pe�a dois n�meros, base e expoente, calcula e mostre o primeiro n�mero elevado
 * ao segundo n�mero. N�o utilize a fun��o de pot�ncia da linguagem.
 */
import java.util.Scanner;

public class exercicio13_Exponenciacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a base");
		int base = scan.nextInt();
		
		System.out.println("Entre com a pot�ncia");
		int potencia = scan.nextInt();
		
		int resultado = base;
		
		for (int i = 1; i<potencia; i++) {
			resultado *= base;
		}
		System.out.println("Resultado: " + resultado);
	}
}
