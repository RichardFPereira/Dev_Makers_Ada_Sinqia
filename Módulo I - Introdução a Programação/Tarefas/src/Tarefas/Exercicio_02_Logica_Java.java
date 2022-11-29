package Tarefas;

import java.util.Scanner;

//Exercício: Crie um programa que receba nomes e preços de produtos e 
//depois no final mostre qual o produto mais caro e o mais barato.
public class Exercicio_02_Logica_Java {
	public static void main(String[] args) {
		String produto1 = null;
		String produto2 = null;
		double precoProduto1;
		double precoProduto2;
		
		produto1 = recebeProduto("primeiro");
		precoProduto1 = verificaPreco("primeiro");
		produto2 = recebeProduto("segundo");
		precoProduto2= verificaPreco("segundo");
		
		if (precoProduto1 > precoProduto2) {
			System.out.printf("O produto mais caro é %s que custa R$%.2f.", produto1, precoProduto1);
			System.out.println();
			System.out.printf("O produto mais barato é %s que custa R$%.2f.", produto2, precoProduto2);
		} else if (precoProduto1 < precoProduto2) {
			System.out.printf("O produto mais caro é %s que custa R$%.2f.", produto2, precoProduto2);
			System.out.println();
			System.out.printf("O produto mais barato é %s que custa R$%.2f.", produto1, precoProduto1);
		} else {
			System.out.printf("Tanto %s quanto o %s custam o mesmo valor de R$%.2f.", produto1, produto2, precoProduto1);
		}
	}
	
	public static String recebeProduto(String str) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome do "+str+" produto: ");
		String produto = input.nextLine();
		return produto;
	}
	public static double verificaPreco(String str) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o preço do "+str+" produto (somente números): ");
		double preco = input.nextDouble();
		while (preco < 0) {
			System.out.println("Preço deve ser maior que zero! Digite novamente: ");
			preco = input.nextDouble();
		}
		return preco;
	}
}
