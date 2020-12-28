package logica;

public class MenorMaiorSalario {
	public static void main(String[] args) {
		double salarios[] = new double[4];
		salarios[0] = 3200;
		salarios[1] = 6000;
		salarios[2] = 5000;
		salarios[3] = 2200;
		
		int menorSalario = 0;
		int maiorSalario = 0;
		
		for(int atual = 0, atual2 = 0; atual <= 3; atual++, atual2++) {
			if(salarios[atual2] > salarios[maiorSalario]) {
				maiorSalario = atual2;
			}
			if(salarios[atual] < salarios[menorSalario]) {
				menorSalario = atual;
			}
		
		}
		System.out.println("O salario mais barato " + salarios[menorSalario]);
		System.out.println("O salario mais caro " + salarios[maiorSalario]);

	}

}
