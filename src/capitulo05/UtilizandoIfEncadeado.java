package capitulo05;

import java.util.Scanner;

public class UtilizandoIfEncadeado {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		Double peso = scanner.nextDouble();
		
//		Boolean pesoLeve = peso <= 60;
//		Boolean pesoMedio = (peso > 60) && (peso <= 90);
//		Boolean pesoPesado = peso > 90;
//		
//		if (pesoLeve) {
//			System.out.println("Categoria peso leve!");
//		} else {
//			Boolean pesoMedio = (peso > 60) && (peso <= 90);
//			
//			if (pesoMedio) {
//			System.out.println("Categoria peso Médio!");
//		} else {
//			Boolean pesoPesado = peso > 90;
//			
//			if(pesoPesado) {
//				System.out.println("Categoria peso pesado!");
//			}
//			
//		}
//			
//	}
	
		Boolean pesoLeve = (peso <= 60) && (peso > 0);
		Boolean pesoMedio = (peso > 60) && (peso <= 90);0
		Boolean pesoPesado = peso > 90;
		
		if (pesoLeve) {
			System.out.println("Categoria peso Leve!");
		} else if (pesoMedio) {
			System.out.println("Categoria peso Médio!");
		} else if (pesoPesado) {
			System.out.println("Categoria peso pesado!");
		} else {
			System.out.println("O lutador não se encaixa em nenhuma categoria.");
		}
		
		scanner.close();
	}
	

}
