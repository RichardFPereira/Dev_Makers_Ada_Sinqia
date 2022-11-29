package Tarefas;

import java.util.Scanner;

//Crie um programa calculadora que recebe a operação matemática (somar, subtrair,
//multiplicar ou dividir) e os dois números. Mostre o resultado da operação.
public class Exercicio_01_Logica_Java {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String operacao = null;
		double num1;
		double num2;
		boolean operacaoCorreta = false;
		
		while (!operacaoCorreta) {
			System.out.println("Digite a operação: (somar, subtrair, multiplicar ou dividir)");
			operacao = input.nextLine();
			operacao = operacao.toLowerCase();
			if (operacao.equals("somar") || operacao.equals("subtrair") || operacao.equals("multiplicar") || operacao.equals("dividir")) {
				operacaoCorreta = true;				
			} else {
				System.out.println("Operação inválida!");
			}
		}
		
		System.out.println("Digite o primeiro número: ");
		num1 = input.nextDouble();
		System.out.println("Digite o segundo número: ");
		num2 = input.nextDouble();
		
		switch (operacao) {
			case "somar":
				double soma = num1 + num2;
				System.out.printf("A soma entre %.2f e %.2f é: %.2f.", num1, num2, soma);
				break;
			case "subtrair":
				double sub = num1 - num2;
				System.out.printf("A subtração entre %.2f e %.2f é: %.2f", num1, num2, sub);
				break;
			case "multiplicar":
				double mult = num1 * num2;
				System.out.printf("A multiplicação entre %.2f e %.2f é: %.2f", num1, num2, mult);
				break;
			case "dividir":
				if (num1 == 0 || num2 == 0) {
					while (num1 == 0 || num2 == 0) {
						System.out.println("O divisor e/ou o dividendo não podem ser zero.");
						System.out.println("Digite o primeiro número: ");
						num1 = input.nextDouble();
						System.out.println("Digite novamente o segundo número: ");
						num2 = input.nextDouble();
					}
				}
				double div = num1 / num2;
				System.out.printf("A divisão entre %.2f e %.2f é: %.2f", num1, num2, div);
				break;
		}		
		input.close();
	}
}
