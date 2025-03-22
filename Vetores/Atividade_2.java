package Vetores;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] vetor = new int[10];
		int soma = 0;
		double media;

		System.out.print("Digite 10 números inteiros: ");
		for (int i = 0; i < 10; i++) {
			vetor[i] = scanner.nextInt();
		}

		System.out.print("Elementos nos índices ímpares: ");
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.println();

		System.out.print("Elementos pares: ");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}

		System.out.println();

		for (int i = 0; i < 10; i++) {
			soma = soma + vetor[i];
		}
		System.out.println("Soma: " + soma);

		media = (double) soma / vetor.length;
		System.out.printf("Média: %.2f\n", media);

	}
}
