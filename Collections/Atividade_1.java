package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();

		System.out.println("Digite 5 cores:");
		for (int i = 0; i < 5; i++) {
            System.out.print("Cor " + (i + 1) + ": ");
            cores.add(scanner.nextLine());
        }

        System.out.println("\nCores adicionadas:");
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collections.sort(cores);

        System.out.println("\nCores ordenadas:");
        iterator = cores.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}