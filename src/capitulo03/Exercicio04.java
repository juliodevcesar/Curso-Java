package capitulo03;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProdutos = scanner.nextDouble();
		
		System.out.println("Digite a quantidade: ");
		Integer quantidadeDeProdutos = scanner.nextInt();
		
		Double subtotalProdutos = valorProdutos * quantidadeDeProdutos;
		
		Boolean quantidadeMaiorOuIgualDez = quantidadeDeProdutos >= 10;
		
		Double percentualDesconto = 0.0;
		
		if (quantidadeMaiorOuIgualDez) {
			percentualDesconto = 10.0;
		}
		
		Double desconto = subtotalProdutos * percentualDesconto / 100;
		
		Double valorTotalDesconto = subtotalProdutos - desconto;
		
		System.out.printf("Valor total: R$ %.2f%n", valorTotalDesconto);
		
		scanner.close();
		
		
		
	}
}
