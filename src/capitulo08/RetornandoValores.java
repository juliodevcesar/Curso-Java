package capitulo08;

public class RetornandoValores {

	public static void main(String[] args) {
//		Integer numeroQualquer = numeroAleatorio();
//		
//		System.out.println("Número: " + numeroQualquer);
//	}	
//
//	static Integer numeroAleatorio() {
//		Integer numero = 1;
//		return 1;
		Double[] premissaInicial = new Double[] {100.0, 100.0 };
		Double proporcao = 20.0;
		
		Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
		
		System.out.println("Resultado: " + resultadoFinal);
		
	}
	
	static Double regraDeTres(Double[] premissa, Double proporcao) {
		Double resultado = (premissa[0] * proporcao) / premissa[1];
		return resultado;
 	}
}
