package capitulo04;

import java.util.Scanner;

public class Exercicio04 {

	static final Integer IDADE_MINMA_PARA_APOSENTAR = 55;
	
	static final Integer TEMPO_MINIMO_DECONTRIBUICAO = 25;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.println("Digite o anos de contribuição: ");
		Integer anosContribuicao = scanner.nextInt();
		
		Boolean temIdadeParaAposentar = idade >= IDADE_MINMA_PARA_APOSENTAR;
		
		Boolean temTempoDeContribuicaoSuficiente = anosContribuicao >= TEMPO_MINIMO_DECONTRIBUICAO;
		
		Boolean podeAposentar = temIdadeParaAposentar && temTempoDeContribuicaoSuficiente;
		
		if (podeAposentar ) {
			System.out.println("Sim! Pode aposentar.");
		} else {
			System.out.println("Não vai ser possível aposentar agora.");
		}
		
		 scanner.close();
	}
}
