package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nDigite um número: ");
		int numeroEscolhido = leia.nextInt();
		
		
		if (numeroEscolhido % 2 == 0) {
			if (numeroEscolhido > 0) {
				System.out.println("\nO número " + numeroEscolhido + " é par e positivo.");
			} else if (numeroEscolhido < 0) {
				System.out.println("\nO número " + numeroEscolhido + " é par e negativo.");
			} else {
				System.out.println("\nO número " + numeroEscolhido + " é zero e par.");
			}
		} else { 
			if (numeroEscolhido > 0) {
				System.out.println("\nO número " + numeroEscolhido + " é ímpar e positivo.");
			} else {
				System.out.println("\nO número " + numeroEscolhido + " é ímpar e negativo ");
			}
		}	
     		
	}

}
