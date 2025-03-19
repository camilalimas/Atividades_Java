package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um valor para a A: ");
		int nA = leia.nextInt();
		
		System.out.println("\nDigite um valor para a B: ");
		int nB = leia.nextInt();
		
		System.out.println("\nDigite um valor para a C: ");
		int nC = leia.nextInt();

				
		if (nA + nB > nC) {
			System.out.println("A soma de A + B é maior que C");
		}
		
		if (nA + nB < nC) {
			System.out.println("A soma de A + B é menor que C");

	    }
		if (nA + nB == nC) {
			System.out.println("A soma de A + B é igual a C");
			
		}
		
	}
	
}
