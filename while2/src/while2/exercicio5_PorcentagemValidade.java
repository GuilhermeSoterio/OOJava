package while2;
/*Altere o programa anterior permitindo o usuário as populações e as taxas de crescimento iniciais.
 * Valide a entrada e permita repetir a operação.
 * 
 */
import java.util.Scanner;

public class exercicio5_PorcentagemValidade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int populaA;
		int populaB;
		
		int cont = 0;
		
		int taxaA;
		double taxaB;
		
		boolean valida = false;
		boolean valida2 = false;
		boolean valida3 = false;
		boolean valida4 = false;
		
		do {
			System.out.println("População da cidade A");
			populaA = scan.nextInt();
			if(!(populaA <= 0)){
				valida= true;
			}else {
				System.out.println("Popualação tem que ser maior que zero");
			}
			
			System.out.println("População da cidade B");
			populaB = scan.nextInt();
			if(!(populaB <= 0)){
				valida2= true;
			}else {
				System.out.println("Popualação tem que ser maior que zero");
			}
			
			System.out.println("Taxa da cidade A");
			taxaA = scan.nextInt();
			if(!(taxaA <= 0)){
				valida3= true;
			}else {
				System.out.println("Taxa tem que ser maior que zero");
			}
			
			System.out.println("Taxa da cidade B");
			taxaB = scan.nextDouble();
			if(!(taxaB <= 0)){
				valida4= true;
			}else {
				System.out.println("Taxa tem que ser maior que zero");
			}
			
		}while(!valida && !valida2 && !valida3 && !valida4);
		
		while (populaA < populaB) {
			populaA += (populaA/100) * taxaA;
			populaB += (populaB/100) * taxaB;
			cont++;
		}
		System.out.println("TAxa da B: " + taxaB);
		System.out.println("TAxa da A: " + taxaA);
		System.out.println("População A: " + populaA);
		System.out.println("População B: " + populaB);
		System.out.println("Quantidade de anos: " + cont);
		
	}

}