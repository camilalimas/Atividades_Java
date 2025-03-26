package Collections_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		int opcao = -1;

		while (opcao != 0) {
			System.out.println("Menu:");
			System.out.println("1: Adicionar um novo Cliente na fila");
			System.out.println("2: Listar todos os Clientes na fila");
			System.out.println("3: Chamar (retirar) um cliente da fila");
			System.out.println("0: Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			if (opcao == 1) {
				System.out.print("Digite o nome do Cliente: ");
				String nomeCliente = scanner.nextLine();
				fila.add(nomeCliente);
				System.out.println("Cliente " + nomeCliente + " adicionado à fila.");
			} else if (opcao == 2) {
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila: " + fila);
				}
			} else if (opcao == 3) {
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia. Não há clientes para chamar.");
				} else {
					String clienteChamado = fila.poll();
					System.out.println("Cliente " + clienteChamado + " foi chamado.");
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
