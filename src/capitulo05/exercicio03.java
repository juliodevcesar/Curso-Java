package capitulo05;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número desejado de 1 a 7: ");
		Integer dia = scanner.nextInt();
		
		String semana;
		
		switch (dia) {
		case 1: semana = "domingo";
			break;
		case 2: semana = "segunda-feira";
			break;
		case 3: semana = "terça-feira";
			break;
		case 4: semana = "quarta-feira";
			break;
		case 5: semana = "quinta-feira";
			break;
		case 6: semana = "sexta-feira";
			break;
		case 7: semana = "sábado";
			break;
		default: semana = "Inválido";
		}
		System.out.println("O dia escolhido foi : " + semana);
		
		scanner.close();
	}

}
