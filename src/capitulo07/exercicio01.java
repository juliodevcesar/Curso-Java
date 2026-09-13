package capitulo07;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefas = new String[5];
		
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println("Digite as tarefas mais importantes do seu dia: " + i + " =");
			tarefas[i] = scanner.nextLine();
		}
		
		System.out.println("Suas tarefas mais importantes são: ");
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println(i + ": " + tarefas[i]);
		}
		
		scanner.close();

	}

}
