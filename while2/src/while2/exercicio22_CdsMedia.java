package while2;
/*Fa�a um programa que calcule o valor total investido por um colecionador em sua cole��o
 * de CDs e o valor m�dio gasto em cada um deles. O usu�rio dever� informar a quantidade
 de CDs e o valor para em cada um*/
import java.util.Scanner;

public class exercicio22_CdsMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de CDS");
		int cds = scan.nextInt();
		int soma = 0;
		for(int i =0; i<cds; i++) {
			System.out.println("Valo do CD:");
			int valor = scan.nextInt();
			soma += valor;
		}
		
		System.out.println("Soma de valores: " + soma);
		int media = soma/cds;
		System.out.println("M�dia do valor dos CDs: " + media);
	}
}
