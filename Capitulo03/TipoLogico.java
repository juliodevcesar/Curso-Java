package capitulo03;

public class TipoLogico {
	
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("variavelVerdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("variavelFalsa " + variavelFalsa);

		System.out.println("------------");
		
		Integer idade = 20;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		//System.out.println("Pode tirar carteira?" + " " + podeTirarCarteira);
		
		
		if (podeTirarCarteira) {
			System.out.println("Sim, ele(a) pode tirar carteira.");
		} else {
				System.out.println("Não, ele(a) não pode tirar carteira.");
			
		}
		
		
	}
	
}