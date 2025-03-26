package Collections_2;

import java.util.Scanner;
import java.util.Stack;

public class Atividade_2 {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		int opcao = -1;

		while (opcao != 0) {
			System.out.println("Menu:");
			System.out.println("1: Adicionar um novo livro na pilha");
			System.out.println("2: Listar todos os livros da pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			if (opcao == 1) {
				System.out.print("Digite o nome do livro: ");
				String nomeLivro = scanner.nextLine();
				pilha.push(nomeLivro);
				System.out.println("Livro " + nomeLivro + " adicionado à pilha.");
			} else if (opcao == 2) {
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("Livros na pilha: " + pilha);
				}
			} else if (opcao == 3) {
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia. Não há livros para retirar.");
				} else {
					String livroRetirado = pilha.pop();
					System.out.println("Livro " + livroRetirado + " foi retirado da pilha.");
				}
			} else if (opcao == 0) {
				System.out.println("Programa finalizado.");
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

		scanner.close();
	}
}
