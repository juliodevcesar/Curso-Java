package capitulo06;

public class IterandoFor {

	public static void main(String[] args) {
//		for(int i = 1; i <= 5; i++) { //int é o tipo primitivo, dentro do for é melhor usar ele. 
//			// a segunda expressão, é booleana, vai rodar 5 vezes e a terceira é i = i + 1, a cada rodada, vai adicionar um
//			System.out.println(i + ": Uma frase qualquer.");
//		}

		
//		Double[] carrinhoDeCompras = new Double[] {50.0, 50.0, 50.0};
//		Double total = 0.0;
//		for(int i = 0; i < carrinhoDeCompras.length; i++) {
//			System.out.println("Iteração " + i + ", Total: " + total);
//			total = total + carrinhoDeCompras[i];
//	}
//		
//		System.out.println("Total: " + total);
		
		
//		for(int i = 0; i < 10; i++) {
//			if(i == 5) {
//				System.out.println("Vai parar!");
//				break;
//			}
//			
//			System.out.println("Iteração:" + i);
//		}
		
		
//		for(int i = 0; i < 10; i++) {
//			if(i == 5) {
//				System.out.println("Vai continuar!");
//				continue;
//			}
//			
//			System.out.println("Iteração:" + i);
//		}
		
		
		Integer[] produtos = new Integer[] {100, 225, 300};
		
		for(int i = 0; i < produtos.length; i++) {
			Integer produto = produtos[i];
			
			System.out.println("Produto de código: " + produto);
			
			if (produto.equals(225)) {
				System.out.println("Produto encontrado!");
				break;
				
			}
		}
	}

}
