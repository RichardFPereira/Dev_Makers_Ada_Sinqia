package Aula02;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String username = input.next();
		
		System.out.println("Digite seu endereço: ");
		String address = input.next();
		
		System.out.println("Digite seu telefone: ");
		int phone = input.nextInt();
		
		System.out.println("Digite sua cidade: ");
		String city = input.next();
		
		System.out.println("Digite seu cep: ");
		int cep = input.nextInt();
		
		System.out.println("Nome: "+username);
		System.out.println("Endereço: "+address);
		System.out.println("Telefone: "+phone);
		System.out.println("Cidade: "+city);
		System.out.println("CEP: "+cep);
		
		input.close();
	}	
}