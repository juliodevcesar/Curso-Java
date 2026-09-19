package capitulo03;

import java.util.Scanner; // importação pra usar o scanner


public class Exercicio03 {

	static final Integer NOTA_MINIMA_PARA_PASSAR_DE_ANO = 70;
	
	public static void main(String[] args) { // main padrão
		Scanner scanner = new Scanner(System.in); // Função Scanner pra receber do console
		
		System.out.println("Digite sua nota: ");
		Double nota = scanner.nextDouble();
		
		Boolean passou = nota >= NOTA_MINIMA_PARA_PASSAR_DE_ANO;
		
		if(passou) {
			System.out.println("Você foi aprovado!");
		} else {
			System.out.println("Você reprovou!");
		}
		
		scanner.close();
	}

}
