package Aula05;

import java.util.Scanner;

public class inverteVetores{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int TAMANHO = 100;
		int[] vetor = new int [TAMANHO];
		int entrada = 1;
		int cnt = 0;
		int aumenta = 0;
		int diminui;
		
		while (entrada != 0 && cnt <= 100) {
			System.out.printf("Digite o %dº valor: ", (cnt+1));
			entrada = input.nextInt();
			if (entrada == 0) {
				break;
			}
			vetor[cnt] = entrada;
			cnt++;
		}
		
		System.out.println("O vetor digitado é: ");
		printVetor(vetor, cnt);
		
		diminui = cnt;
		vetor = swap(vetor, cnt, aumenta, diminui);
		
		System.out.println("O vetor invertido é: ");
		printVetor(vetor, cnt);
		
		input.close();
	}
	
	public static int[] swap(int[]vetor, int cnt, int aumenta, int diminui) {
		int num1;
		int num2;
		
		if(aumenta+1 < cnt/2) {
			diminui--;
			num1 = vetor[aumenta]; 
			num2 = vetor[diminui]; 
			num1 = num1 + num2; 
			num2 = num1 - num2; 
			num1 = num1 - num2; 
			vetor[aumenta] = num1;
			vetor[diminui]= num2;
			
			aumenta++;			
			return swap(vetor, cnt, aumenta, diminui);
		} else {		
			diminui--;
			num1 = vetor[aumenta]; 
			num2 = vetor[diminui]; 
			num1 = num1 + num2; 
			num2 = num1 - num2; 
			num1 = num1 - num2; 
			vetor[aumenta] = num1;
			vetor[diminui]= num2;
		}		
		return vetor;
	}
	
	public static void printVetor(int[] vetor, int cnt) {		
		System.out.printf("[");
		for (int i = 0; i < cnt; i++) {	
			if (i > 0) {
				System.out.print(",");
			}
			System.out.printf("%d", vetor[i]);		
		}
		System.out.println("]");
	}
}
