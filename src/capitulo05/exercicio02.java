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
		
		Double oitentaPorCentoDaMeta = (meta * 80) / 100;
		
		Boolean metaBatida = faturamento >= meta;
		
		Boolean bateuOitentaPorCento = faturamento >= oitentaPorCentoDaMeta;
		
		if (metaBatida) {
			System.out.println("Parabéns você bateu a meta e vai receber 100% de bônus! O valor será: " + mediaSalarial);
		} else if (bateuOitentaPorCento) {
			Double receberOitentaPorCento = (mediaSalarial * 80) / 100;
			
			System.out.println("Parabéns, seu bônus será de 80%. O valor será: " + receberOitentaPorCento);
		} else {
			System.out.println("Infelzimente a meta não foi batida, você não receberá bônus.");
		}
	}
}
