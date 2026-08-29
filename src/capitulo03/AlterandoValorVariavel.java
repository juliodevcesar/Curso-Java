package capitulo03;

import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble(); // decimal tipo float do python
		
		System.out.println("Digite o tipo do pagamento [1 = à vista / 2 = prazo]: ");
		Integer tipoPagamento = scanner.nextInt(); // inteiro
		
		Boolean pagamentoAVista = tipoPagamento.equals(1); // tipo pagamento igual a 1, equals 1.
		
		Double juros = 0.0; // criou mais uma variavel double, decimal. Sem juros.
		
		if (!pagamentoAVista) { // estrutura de decisão se // !pagamentoAVista é uma opção. 
			juros = 10.0;
		} 
		
		Double acrescimo = valorProduto * juros / 100; // regra de 3
		
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor Total: " + valorTotal);
		
		scanner.close();
	}
}
