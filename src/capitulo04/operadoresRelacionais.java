package capitulo04;

public class operadoresRelacionais {
	public static void main(String[] args) {
		Boolean tresMaiorQueDois = 3 > 2; // o resultado de uma relação é sempre um valor booleano
		System.out.println("3 > 2? " + tresMaiorQueDois);
		
		Boolean tresMenorQueDois = 3 < 2; 
		System.out.println("3 < 2? " + tresMenorQueDois);
		
		Boolean tresMaiorQueTres = 3 > 3; 
		System.out.println("3 > 3? " + tresMaiorQueTres);
		
		Boolean tresMaiorOuIgualATres = 3 >= 3; 
		System.out.println("3 >= 3? " + tresMaiorOuIgualATres);
		
		Boolean tresMenorOuIgualATres = 3 <= 3; 
		System.out.println("3 <= 3? " + tresMenorOuIgualATres);
		
		Boolean doisIgualADois = 2 == 7;
		System.out.println("2 == 7? " + doisIgualADois);
		
		Boolean doisDiferenteDeDois = 2 != 2;
		System.out.println("2 != 2? " + doisDiferenteDeDois);
		
		Integer quatro = 4;
		Boolean quatroMaiorQueQuatro = quatro > quatro;
		System.out.println("quatro > quatro? " + quatroMaiorQueQuatro);
		
		Integer cinco =5;
		Boolean cincoIgualACinco = cinco.equals(cinco); // == só funciona até o numero 127, usamos o equals quando passar.
		System.out.println("cinco.equals(cinco)? " + cincoIgualACinco);
		
		Integer seis =6;
		Boolean cincoIgualASeis = cinco.equals(seis);
		System.out.println("cinco.equals(seis)? " + cincoIgualASeis);
		
		Integer centoVinteOito = 127;
		Integer centoVinteOito02 = 127;
		
		Boolean centoVinteOitoIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito02);
		System.out.println("centoVinteOito.equals(centoVinteOito02? " + centoVinteOitoIgualCentoVinteOito);
		
		Boolean centoVinteOitoIgualCentoVinteOito02 = centoVinteOito == centoVinteOito02;
		System.out.println("centoVinteOito == centoVinteOito02? " + centoVinteOitoIgualCentoVinteOito02);
	} 
}
 