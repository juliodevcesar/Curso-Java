package capitulo02;

import java.util.Scanner;

public class exercicio02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CÁCULO DE ÍNDICE DE MASSA CORPORAL.");
		
		System.out.println("Digite seu peso em KG: ");
		Double peso = scanner.nextDouble();
		
		System.out.println("Digite sua altura em CM: ");
		Double altura = scanner.nextDouble();
		
		Double alturaAoQuadrado = (altura * altura);
		
		Double IndiceDeMassaCorporal = peso / alturaAoQuadrado;
		
		System.out.println("Seu IMC é: " + IndiceDeMassaCorporal);
		
		scanner.close();
	}
}