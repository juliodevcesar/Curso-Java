package capitulo08;

import java.util.Scanner;

public class calculadoraTeste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Calculadora Teste!!");
		
		System.out.println("Digite o primeiro número: ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.println("Escolha a operação: [1 = + | 2 = - | 3 = * | 4 = /]");
		Integer operacao = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		Double segundoNumero = scanner.nextDouble();
		
		Double resultado = null;
		
		if(operacao.equals(1)) {
			 resultado = primeiroNumero + segundoNumero;
		} if (operacao.equals(2)) {
			 resultado = primeiroNumero - segundoNumero;
		} if (operacao.equals(3)) {
			 resultado = primeiroNumero * segundoNumero;
		} if (operacao.equals(4)) {
			 resultado = primeiroNumero / segundoNumero;
		}
		
		System.out.println("O valor final da operação foi: " + resultado);
		
		scanner.close();
	}

}
