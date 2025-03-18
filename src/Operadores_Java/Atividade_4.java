package Operadores_Java;

import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o valor 1: ");
		float n1 = leia.nextFloat();
		
		System.out.println("\nDigite o valor 2: ");
		float n2 = leia.nextFloat();
		
		System.out.println("\nDigite o valor 3: ");
		float n3 = leia.nextFloat();
		
		System.out.println("\nDigite o valor 4: ");
		float n4 = leia.nextFloat();
		
		
		float diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("\nO resultado é: " + diferenca);
		

	}

}

