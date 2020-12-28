package while2;
/*Fa�a um programa que calcule o n�mero m�dio de alunos por turma. Para isto, pe�a a quantidade de turmas e a quantidade de alunos para cada turma. As turmas n�o podem ter mais de 40 alunos
 * 
 */
import java.util.Scanner;

public class exercicio21_MediaTurma {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTurmas = scan.nextInt();

		int numAlunos;
		int soma = 0;
		boolean invalido = false;

		for (int i = 1; i <= numTurmas; i++) {

			do {
				System.out.println("Entre com o n�mero de alunos da turma" + i);
				numAlunos = scan.nextInt();

				if (numAlunos <= 40) {
					invalido = false;
				}
			} while (invalido);
			
			soma += numAlunos;
		}
		
		double media = soma / numTurmas;
		
		System.out.println("M�dia: " + media);
	}
}
