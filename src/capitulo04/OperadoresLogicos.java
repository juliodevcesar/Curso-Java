package capitulo04;

public class OperadoresLogicos {
	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100  = false;
		Boolean periodoDePromocao = true;
		Boolean jaFezCompraNaLoja = false;
		Boolean pagamentoAVista = true;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao; // && significa "e", só tem desconto se for maior que 100 e estiver no periodo de promocao	
	
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao; // o || só precisa de um treu pra ser true
		
//		Boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja; 
		
//		Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja; 
		
		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista; 
		
		if (aplicarDesconto) { // o && requer que ambos sejam true
			System.out.println("Sim! Aplique o desconto.");
		}	else {
			System.out.println("Não aplique o desconto.");
		}
	}
}
