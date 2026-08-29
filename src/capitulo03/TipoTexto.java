package capitulo03;

import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ctrl shift o importa e scanner recebe do console
		
		System.out.println("Digite seu nome: ");// printar na tela
		String nome = scanner.nextLine(); // var, nextline recebe texto
		
		System.out.println("Digite seu sobrenome: ");// printar na tela
		String sobrenome = scanner.nextLine();
		
		System.out.println("Agora sua idade: ");
		int idade = scanner.nextInt();
		
		
		scanner.close(); // o console espera você digitar para usar o println
		
		System.out.println("Olá " + nome + " " + sobrenome + "!" + "Você tem " + idade + " anos!");
		
		Character variavelChar = 'A';
	}
}
