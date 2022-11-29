package Aula05;

import java.util.Iterator;
import java.util.Scanner;

public class Vetores01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean encontrado = false;
		int posicao = -1;
				
		System.out.println("Digite um valor inteiro: ");
		int k = input.nextInt();
		
		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = input.nextInt();
		
		int[] vetor = new int [tamanho];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %dº valor: ", (i+1));
			vetor[i] = input.nextInt();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == k) {
				posicao = i+1;
				encontrado = true;
				break;
			}
		}
		
		if (encontrado == true) {
			System.out.printf("O elemento %d foi encontrado na %dº posição!", k, posicao);
		} else {
			System.out.println("O elemento não foi encontrado!");
		}
	}
}
