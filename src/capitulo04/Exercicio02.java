package capitulo04;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Double valorFrete = 15.0;
		
		Boolean compraAcimaDeCem = valorProduto >= 100;
		
		if (compraAcimaDeCem) {
			valorFrete = 0.0;
		}
		
		Double valorTotal = valorProduto + valorFrete;
		System.out.println("O valor total foi de: " + valorTotal);
		
		scanner.close();	
		
	}
}
