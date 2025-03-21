package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);

		int idade;
		int menoresDe21 = 0;
		int maioresDe50 = 0;

		System.out.println("Digite uma idade: ");
		idade = lerScanner.nextInt();

		while (idade >= 0) {
			if (idade < 21) {
				menoresDe21++;
			} else if (idade >= 50) {
				maioresDe50++;
			}

			System.out.println("Digite uma idade: ");
			idade = lerScanner.nextInt();
		}

		System.out.println("Total de pessoas com menos de 21 anos: " + menoresDe21);
		System.out.println("Total de pessoas com mais de 50 anos: " + maioresDe50);

		lerScanner.close();

	}

}
