package while2;

import java.util.Scanner;

/*
 * 
 */
public class exercicio18_NumeroPrimo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i=2; i<num; i++) {
			if (num % i == 0) {
				System.out.println("N�o � primo, � divis�vel por: " + i);
			}
		}
		if(primo) {
			System.out.println("� n�mero primo");
		}
	}

}
