package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int vetorInteiros[] = { 8, 12, 15, 7, 9, 13, 89, 6, 2, 36 };
		int numeroEscolhido;

		System.out.println("vetores: \n");

		for (int indice = 0; indice < 10; indice++) {
			System.out.println(vetorInteiros[indice]);

		}

		System.out.println("\nDigite o número que você deseja encontrar: ");
		numeroEscolhido = scanner.nextInt();

		int posicao = -1;
		for (int i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] == numeroEscolhido) {
				posicao = i;
			}
		}

		if (posicao >= 0) {
			System.out.println("\nO número" + numeroEscolhido + " foi encontrado e está na posição: " + posicao);
		} else {
			System.out.println("\nO número" + numeroEscolhido + " não foi encontrado.");
		}

	}

}