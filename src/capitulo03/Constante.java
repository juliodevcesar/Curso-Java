package capitulo03;

import java.util.Scanner;

public class Constante {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// final Integer idadeMinima = 18; // o final não deixa alterar e vira constante
		
		System.out.println("Idade: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira!");
		} else {
			System.out.println("Não! Ele(a) não pode tirar carteira.");
		}
		scanner.close();
	}
}
