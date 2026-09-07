package capitulo05;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Meta de faturamento anual: ");
		Double metaFaturamento = scanner.nextDouble();
		
		System.out.println("Faturamento anual: ");
		Double faturamentoApurado = scanner.nextDouble();
		
		System.out.println("Média salarial do funcionário nos últimos 12 meses: ");
		Double mediaSalarial = scanner.nextDouble();
		
		Double oitentaPorCentoDaMeta = (metaFaturamento * 80) / 100;
		
		Boolean metaBatida = faturamentoApurado >= metaFaturamento;
		
		Boolean faturouOitentaPorCento = faturamentoApurado >= oitentaPorCentoDaMeta;
		
		if (metaBatida) {
			System.out.println("Ganhará um bônus de 100%! Ele será de: " + mediaSalarial);		
		} else if (faturouOitentaPorCento) {
			Double oitentaPorCentoDaMediaSalarial = (mediaSalarial * 80) / 100;
			
			System.out.println("Ganhará bônus de 80%! Ele será de: " + oitentaPorCentoDaMediaSalarial);
		} else {
			System.out.println("Infelizmente, esse ano não tem bônus!");
		}
		
		scanner.close();
	
	}
}
