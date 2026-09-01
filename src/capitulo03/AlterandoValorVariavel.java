package capitulo03;

import java.util.Scanner;

public class AlterandoValorVariavel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Escolha a forma de pagamento: [1 - À vista | 2 - À prazo]");
		Integer formaPagamento = scanner.nextInt();
		
		Boolean pagamentoAVista = formaPagamento.equals(1);
		
		Double juros = 0.0;
		
		if (!pagamentoAVista) {
			juros = 10.0;
		}
		
		Double acrescimo = valorProduto * juros / 100;
		
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("O valor total é: " + valorTotal);
		
	scanner.close();
		
	}	
}
