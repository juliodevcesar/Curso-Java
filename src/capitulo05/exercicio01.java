package capitulo05;

import java.util.Scanner;

public class exercicio01 {

	static final Double NOTA_MINIMA_PARA_PASSAR = 150.0;
	static final Double NOTA_MINIMA_POR_MATERIA = 60.0;
	
	public static void main(String[] args) {
		
		System.out.println("CALCULANDO NOTAS PARA APROVAÇÃO!");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua nota de Português: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.println("Digite sua nota de Matemática: ");
		Double notaMatematica = scanner.nextDouble();
		
		Double notaGeral = notaMatematica + notaPortugues;
		
		Boolean notaMinimaPortugues = notaPortugues >= NOTA_MINIMA_POR_MATERIA;
		
		Boolean notaMinimaMatematica = notaMatematica >= NOTA_MINIMA_POR_MATERIA;
		
		Boolean temNotaParaPassar = notaGeral >= NOTA_MINIMA_PARA_PASSAR;
		
		Boolean passou = temNotaParaPassar && notaMinimaMatematica && notaMinimaPortugues;
		
		if(passou) {
			System.out.println("Parabéns, você foi aprovado!");
		} else {
			System.out.println("Infelizmente você não foi aprovado!");
		}
		
		scanner.close();
	}

}
