package capitulo03;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Digite a quantidade: ");
		Double quantidade = scanner.nextDouble();
		
		Double subtotal = valorProduto * quantidade;
		
		Double percentualDesconto = 0.0;
		
		Boolean quantidadeAcimaDeDez = quantidade > 10;
		
		if(quantidadeAcimaDeDez) {
			percentualDesconto = 10.0;
		}
		
		Double desconto = subtotal * percentualDesconto / 100;
		
		Double valorComDesconto = subtotal - desconto;
		
		System.out.println("Valor total: " + valorComDesconto);
		
		scanner.close();

	}
}
