package while2;

import java.util.Scanner;

/*Fa�a um programa que pe�a uma nota, entre zero e dez. Mostra uma mensagem 
caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido.*/
public class exercicio1_ValidaNota {
	public static void main(String[] args) {
		
		boolean notaValida = false;
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("Entre com uma nota");
		
		double nota = scan.nextDouble();
		
		if ( nota >=0 && nota <= 10) {
			notaValida = true;
			System.out.println("Voc� digitou: " + nota);
		} else {
			System.out.println("Nota inv�lida, digite novamente.");
			}
		}while (!notaValida);
			

	}

}
