package Aula02;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String username = input.next();
		
		System.out.println("Digite sua idade: ");
		int age = input.nextInt();
		
		System.out.println("Olá "+username+" de "+age+" anos!");
		
		input.close();
	}	
}
