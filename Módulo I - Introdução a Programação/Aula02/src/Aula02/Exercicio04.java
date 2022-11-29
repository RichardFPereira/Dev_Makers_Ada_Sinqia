package Aula02;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = input.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = input.nextInt();
		
		if(num1 < num2) {
			System.out.println(num1+", "+num2);
		} else {
			System.out.println(num2+", "+num1);
		}
		
		input.close();		
	}
}