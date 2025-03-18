package Operadores_Java;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite um valor para a Variável salario: ");
		float salario = leia.nextFloat();
		
		System.out.println("\nDigite um valor para a Variável abono: ");
		float abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.println("\nO novo salario é de; " + novoSalario);
		

	}

}
