package Aula05;

import java.util.Iterator;
import java.util.Scanner;

public class ProblemaD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tamanho;
		
		while (true) {
			System.out.println("Insira um tamanho entre 1 e 20: ");
			tamanho = input.nextInt();
			if(tamanho >= 1 && tamanho <= 20) {
				break;
			}
		}
		
		int[][] matriz = new int[tamanho][tamanho];	
		
		matriz = preencheMatriz(matriz, tamanho);

		imprimeMatriz(matriz, tamanho);
		
	}
	
	public static int[][] preencheMatriz(int[][] matriz, int tamanho) {
		int aux = 1;
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < aux; j++) {
				matriz[i][j] = 1;				
			}
			aux++;
		}	
		return matriz;
	}
	
	public static void imprimeMatriz(int[][] matriz, int tamanho){
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				System.out.printf("%d", matriz[i][j]);
			}
			System.out.println();
		}
	}
}
