package arrays;

import java.util.Scanner;

public class exercicio1_VetoresIguais {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i];
		}
		
		System.out.println("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.println(vetorB[i] + " ");
		}
		System.out.println();
	}
}
The objective is to return all pairs of integers from a given array of integers that have a
difference of 2.CRLF
2 CRLF
3 The result array should be sorted in ascending order of values.CRLF
4 CRLF
5 Assume there are no duplicate integers in the array. The order of the integers in the input
array should not matter.CRLF
6 ExamplesCRLF
7 CRLF
8 [1, 2, 3, 4] should return [[1, 3], [2, 4]]CRLF
9 CRLF
10 [4, 1, 2, 3] should also return [[1, 3], [2, 4]]CRLF
11 CRLF
12 [1, 23, 3, 4, 7] should return [[1, 3]]CRLF
13 CRLF
14 [4, 3, 1, 5, 6] should return [[1, 3], [3, 5], [4, 6]]
