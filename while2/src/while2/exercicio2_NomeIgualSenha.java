package while2;
import java.util.Scanner;
/*Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceita a senha igual ao 
nome do usu�rio, mostrando uma mensagem de erro e voltando a pedir as informa��es */
public class exercicio2_NomeIgualSenha {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean valido = false;
		String nome;
		String senha;
		
		do {
			System.out.println("Entre com um nome");
			nome = scan.next();
			System.out.println("Entre com uma senha");
			senha = scan.next();
			if(nome.equals(senha)) {
				valido = true;
				System.out.println("Nome e senha v�lidos");
			}else {
				System.out.println("N�o aceitamos senha igual a do usu�rio");
			}
			
		}while(!valido);
		System.out.println("Fim do programa");
	}

}
