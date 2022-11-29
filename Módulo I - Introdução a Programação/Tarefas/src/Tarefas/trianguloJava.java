package Tarefas;

import java.util.Iterator;
import java.util.Scanner;

//Desenvolver um programa que deverá desenhar um triângulo conforme a figura abaixo. 
//O programa deverá receber quantidade de linhas a serem impressas.
public class trianguloJava {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tamanho = 0;
		
		while (tamanho < 1) {
			System.out.println("Digite a quantidade de linhas: ");
			tamanho = input.nextInt();	
		}
		
		if (tamanho == 1) {
			System.out.println("*");
		} else {
			int cnt = tamanho;
			for (int j = 0; j < tamanho; j++) {
				for(int i = 0; i < cnt; i++) {
					System.out.printf("*");
				}
				System.out.println();
				cnt--;
			}			
		}
		input.close();
	}
}