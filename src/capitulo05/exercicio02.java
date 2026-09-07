package capitulo05;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a meta de faturamento da empresa: ");
		Double meta = scanner.nextDouble();
		
		System.out.println("Digite o faturamento anual da empresa: ");
		Double faturamento = scanner.nextDouble();
		
		System.out.println("Digite sua média salarial dos últimos 12 meses: ");
		Double mediaSalarial = scanner.nextDouble();
		
		Double setentaPorCentoDaMeta = (meta * 70) / 100;
		
		Boolean metaBatida = faturamento >= meta;
		
		Boolean bateuSetentaPorCento = faturamento >= setentaPorCentoDaMeta;
		
		if (metaBatida) {
			System.out.println("Parabéns você bateu a meta e vai receber 100% de bônus! O valor será: " + mediaSalarial);
		} else if (bateuSetentaPorCento) {
			Double faturouSetentaPorCento = (mediaSalarial * 7100) / 100;
			
			System.out.println("Parabéns, seu bônus será de 70%. O valor será: " + faturouSetentaPorCento);
		} else {
			System.out.println("Infelzimente a meta não foi batida, você não receberá bônus.");
		}
	}
}
