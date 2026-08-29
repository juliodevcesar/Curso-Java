package capitulo03;

import java.util.Scanner; // importação pra usar o scanner

public class Exercicio03 {
	public static void main(String[] args) { // main padrão
		Scanner scanner = new Scanner(System.in); // Função Scanner pra receber do console
		
		System.out.println("Digite sua nota: "); // printa pra digitar a nota
		Double notaDoAluno = scanner.nextDouble(); // var do tipo numerico decimal tipo float
		
		Boolean passouDeAno = notaDoAluno >= 70; // variavel boleana, true or false, recebe a nota e faz a logica
		
		if (passouDeAno) { // passou de ano é a nota do acima ser acima ou igual a 70
			System.out.println("Parabéns você passou de ano.");
		}	else {
			System.out.println("Infelizmente, ficou de recuperação.");
		}
		
		scanner.close();
	}

}
