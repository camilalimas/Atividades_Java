package Operadores_Java;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o Salário Bruto: ");
		float salarioBruto = leia.nextFloat();
		
		System.out.println("\nDigite o Adicional Noturno: ");
		float adicionalNoturno = leia.nextFloat();
		
		System.out.println("\nDigite as Horas Extras: ");
		float horasExtras = leia.nextFloat();
		
		System.out.println("\nDigite os Descontos: ");
		float descontos = leia.nextFloat();
		
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\nO salário líquido é de: " + salarioLiquido);


	}

}
