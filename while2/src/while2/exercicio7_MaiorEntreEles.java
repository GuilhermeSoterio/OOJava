package while2;
/*Fa�a um programa que leia cinco n�meros e pe�a o maior entre eles.
 * */
import java.util.Scanner;

public class exercicio7_MaiorEntreEles {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i=0; i<5; i++) {
			System.out.println("Entre com um n�mero:");
			num = scan.nextInt();
			
			if(num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior n�mero digitado foi: " + maior);
	}
	
}
