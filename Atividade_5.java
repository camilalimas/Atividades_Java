package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade_5 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nCódigo do Produto: ");
		int codigoProduto = leia.nextInt();
		
		System.out.println("\nDigite a quantidade de produtos desejada: ");
		int quantidade = leia.nextInt();
		
		
		String produto = "";
		float valorUnitario = 0.0f;

		switch (codigoProduto) {
		    case 1:
		    	produto = "Cachorro Quente";
		    	valorUnitario = 10.0f;
		    	break;
		    case 2:
		    	produto = "X-Salada";
		    	valorUnitario = 15.0f;
		    	break;
		    case 3:
		    	produto = "X-Bacon";
		    	valorUnitario = 18.0f;
		    	break;
		    case 4:
		    	produto = "Bauru";
		    	valorUnitario = 12.0f;
		    	break;
		    case 5:
		    	produto = "Refrigerante";
		    	valorUnitario = 8.0f;
		    	break;
		    case 6:
		    	produto = "Suco de Laranja";
		    	valorUnitario = 13.0f;
		    	break;
		    
		    default:
		    	System.out.println("Código de produto inválido");
		
		}
		
		float valorTotal = quantidade * valorUnitario;

		
		System.out.println("\nProduto: " + produto);
		System.out.println("\nValor Total: " + valorTotal);		
		
		
	 }
	
	}

