package capitulo05;

import java.util.Scanner;

public class UtilizandoIfEncadeado {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		Double peso = scanner.nextDouble();
		
		Boolean pesoLeve = peso <= 60;
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado = peso > 90;
		
		if (pesoLeve) {
			System.out.println("Categoria peso leve!");
		}
		
		if (pesoMedio) {
			System.out.println("Categoria peso Médio!");
		}
		
		if(pesoPesado) {
			System.out.println("Categoria peso pesado!");
		}
		
		scanner.close();
	}
	

}
