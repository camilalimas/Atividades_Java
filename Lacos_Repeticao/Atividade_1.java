package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int primeiroNumero = lerScanner.nextInt();

		System.out.println("Digite um número maior que o primeiro: ");
		int segundoNumero = lerScanner.nextInt();

		if (primeiroNumero < segundoNumero) {

			for (int i = primeiroNumero; i <= segundoNumero; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i);
				}
			}

		} else {
			System.out.println("Intervalo inválido. O segundo número deve ser maior que o primeiro!");
			System.exit(0);
		}

		lerScanner.close();
	}

}
