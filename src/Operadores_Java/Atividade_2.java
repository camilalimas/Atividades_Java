package Operadores_Java;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite um valor para a Nota 1: ");
		float nota1 = leia.nextFloat();
		
		System.out.println("\nDigite um valor  para a Nota 2: ");
		float nota2 = leia.nextFloat();
		
		System.out.println("\nDigite um valor  para a Nota 3: ");
		float nota3 = leia.nextFloat();
		
		System.out.println("\nDigite um valor  para a Nota 4: ");
		float nota4 = leia.nextFloat();
		
		
		float mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\nA média final é de: " + String.format("%.1f", mediaFinal));
		

	}

}
