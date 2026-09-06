package capitulo05;

public class estruturaIf {

	public static void main(String[] args) {
		
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		 Boolean movimentaPeloMenosMetadoDoValor = (movimentacaoMedia * 2) >= emprestimo;
		 Boolean aContaTemTempoSuficienteDeAbertura = true;
		 Boolean temNomeLimpo = true;
		 
		 Boolean liberarEmprestimo = movimentaPeloMenosMetadoDoValor 
				 && aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
				 
		 if (liberarEmprestimo) {
			 System.out.println("Sim! Pode liberar empréstimo.");
		 } // toda expressão que retorna um valor booleano pode ser colocada dentro de um if
	}

}
