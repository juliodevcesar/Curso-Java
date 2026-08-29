package capitulo02; // precisa disso pois está dentro do package

import java.util.Scanner; // essa importação faz o scanner funcionar

public class CalcularValorTroco { //criada uma classe pública
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // criada a variável scanner
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble(); // criada a var valorProduto e nextDouble lê o numero recebido e é atribuido a var
		// depois daqui o valor recebido foi atribuído a var e será utilizado novamente
		System.out.print("Digite quantidade passada pelo cliente: ");
		Double valorPassadoPeloCliente = scanner.nextDouble(); // a mesma coisa aqui
		
		Double resultado = valorPassadoPeloCliente - valorProduto; // aqui foi utilizado novamente o valor recebido
		
		System.out.println("Troco: " + resultado);
		
		scanner.close();
	}

}
