package while2;

public class while2 {

	public static void main(String[] args) {
		int i = 1;
		int max = 10;

		System.out.println("Contando at� " + max);
		// Enquanto a express�o for verdadeira, ela executa.
		while (i < max) {
			System.out.println("Valor de i: " + i);
			i++; // i = i + 1; ou i += 1;
		}
	}
}