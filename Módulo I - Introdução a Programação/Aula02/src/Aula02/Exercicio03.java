package Aula02;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = input.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = input.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		int num3 = input.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3)
				System.out.println("O maior número é: "+num1);
		} else if (num2 > num3) {
			System.out.println("O maior número é: "+num2);
		} else {
			System.out.println("O maior número é: "+num3);
		}
		
		input.close();
	}
}
