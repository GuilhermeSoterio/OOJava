package while2;

import java.util.Scanner;

public class exercicio20_MediaIdade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int idade = 0;
		int soma = 0;
		for(int i=0;i<n ;i++) {
			System.out.println("Qual a sua idade?");
			idade = scan.nextInt();
			soma += idade;
		}
		int media = soma/idade;
		if(media >0 && media <= 25) {
			System.out.println("Turma é jovem");
		}else if(media > 26 && media < 60){
			System.out.println("Turma é adulta");
		}else
			System.out.println("Turma é idosa");
	}

}
