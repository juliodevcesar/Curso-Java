package capitulo05;

import java.util.Scanner;

public class exercicio01 {

	static final Double NOTA_MINIMA_PARA_PASSAR = 150.0;
	static final Double NOTA_MINIMA_INDIVIDUAL = 60.0;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota de Português: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.println("Digite a nota de Matemática: ");
		Double notaMatematica = scanner.nextDouble();
		
		Boolean acimaDoMinimoPortugues= notaPortugues >= NOTA_MINIMA_INDIVIDUAL;
		Boolean acimaDoMinimoMatematica= notaMatematica >= NOTA_MINIMA_INDIVIDUAL;
		
		Double notaTotal = notaMatematica + notaPortugues;
		
		Boolean temNotaParaPassar = notaTotal >= NOTA_MINIMA_PARA_PASSAR;
		
		Boolean passou = temNotaParaPassar && acimaDoMinimoMatematica && acimaDoMinimoPortugues;
		
		if (passou) {
			System.out.println("Você foi aprovado!");
		} else {
			System.out.println("Você foi reprovado!");
		}
	}

}
