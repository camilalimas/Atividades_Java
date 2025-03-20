package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade_6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nDigite o nome do colaborador: ");
		String nome = leia.nextLine();
		
		System.out.println("\nDigite o código do colaborador: ");
		int codigoColaborador = leia.nextInt();
		
		System.out.println("\nDigite o salário do colaborador: ");
		float salario = leia.nextFloat();
		
		
		String cargo = "";
		float reajuste = 0.0f;

		switch (codigoColaborador) {
		    case 1:
		    	cargo = "Gerente";
		    	reajuste = 0.10f;
		    	break;
		    case 2:
		    	cargo = "Vendedor";
		    	reajuste = 0.07f;
		    	break;
		    case 3:
		    	cargo = "Supervisor";
		    	reajuste = 0.09f;
		    	break;
		    case 4:
		    	cargo = "Motorista";
		    	reajuste = 0.06f;
		    	break;
		    case 5:
		    	cargo = "Estoquista";
		    	reajuste = 0.05f;
		    	break;
		    case 6:
		    	cargo = "Técnico de TI";
		    	reajuste = 0.08f;
		    	break;
		    default:
		    	System.out.println("Código de cargo inválido");
		
		}
		
		float novoSalario = salario + (reajuste * salario);

		
		System.out.println("\nNome do colaborador: " + nome);
		System.out.println("\nCargo: " + cargo);
		System.out.println("\nNovo Salário: " + novoSalario);
		
	}

}
