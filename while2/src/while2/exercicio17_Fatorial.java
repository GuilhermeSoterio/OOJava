package while2;
/*Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.
 * 
 */

import java.util.Scanner;

public class exercicio17_Fatorial {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite um n�mero: ");
	int num = scan.nextInt();
	
	System.out.println(num + "! = ");
	
	int fatorial = 1;
	for (int i=num; i>0; i--) {
		fatorial *= i;
		System.out.println(i);
		System.out.println("fatorial:"+ fatorial);
		}
	
	System.out.println("Resultado: " + fatorial);
	}
}
