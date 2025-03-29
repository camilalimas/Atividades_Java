package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<>();

		System.out.println("Digite 10 valores inteiros não repetidos:");
		while (numeros.size() < 10) {
			System.out.print("Valor " + (numeros.size() + 1) + ": ");
			int valor = scanner.nextInt();
			if (!numeros.add(valor)) {
				System.out.println("Valor já inserido, tente outro.");
			}
		}

		ArrayList<Integer> listaOrdenada = new ArrayList<>(numeros);
		Collections.sort(listaOrdenada);

		System.out.println("\nElementos do Set em ordem:");
		Iterator<Integer> iterator = listaOrdenada.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		scanner.close();
	}
}