

public class while1 {
	
	public static void main(String[] args) {
		int i = 1;
		int max = 10;
	
		System.out.println("Contando at� " + max);
		
		while (i < max) {
			System.out.println("Valor de i: " + i);
			i++; // i = i + 1; ou i += 1;
		}
	}
}