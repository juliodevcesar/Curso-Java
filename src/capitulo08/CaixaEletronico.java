package capitulo08;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double saldo = 1000.0;
		
		
		exibirMenu();
		
		System.out.println("Digite a opção desejada: ");
		Integer opcao = scanner.nextInt();
		
		if(opcao.equals(1)) {
			exibirSaldo(saldo);
		} else if (opcao.equals(2)) {
			System.out.println("Qual valor deseja depositar?");
			Double deposito = scanner.nextDouble();
			saldo += deposito;
			
			System.out.println("Seu novo saldo é de: " + saldo);
		}
	}
		
		static void imprimirLinha() {
			System.out.println("========================================");
		}
		
		static void exibirMenu() {
		    
			imprimirLinha();

		    System.out.println("[1] Consultar saldo");
		    System.out.println("[2] Realizar depósito");
		    System.out.println("[3] Sair");

		    imprimirLinha();
		}
		
		static void exibirMensagemSaida() {
			System.out.println("Obrigado por utilizar nosso Caixa Eletrônico.");
		}
		
		static void exibirSaldo(Double valor) {
			System.out.println("Seu saldo atual é: " + valor);
		}

	}


