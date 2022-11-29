package Aula04;

import java.util.Scanner;

//Recebe um número digitado pelo usuário
//E verifica se o número é primo ou não
public class Exercicio01 {
	
	public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int num = 0;
        int divisor = 2;

        do {
        	System.out.println("Digite um número inteiro e positivo maior que zero: ");
        	num = entrada.nextInt();
		} while (num < 1);
//        
//        if (num == 1) {
//			System.out.println("O número 1 não é primo!");
//		}
//        
//        while(num1 > 1) {
//        	if (num%num1 == 0) {
//        		System.out.println("O número "+num+" não é primo!");
//        		break;
//        	} else {
//        		num1--;
//        	}
//        }
//        if(num1 == 1) {
//        	System.out.println("O número "+num+" é primo!");
//        }
        
        while (num%divisor != 0) {
        	if (num == 1) {
				break;
			}
        	divisor++;
		}
        
        if(num == divisor) {
        	System.out.println("O número "+num+" é primo!");
        } else if (num == 1) {
			System.out.println("O número "+num+" não é primo!");
		} else {
			System.out.println("O número "+num+" não é primo!");
		}
    }
}
