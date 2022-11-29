package Aula04;

//Dada uma dívida de 10 mil reais que cresce a juros de 
//2,5% ao mês e uma aplicação de 1,5 mil reais com rendimento de
//4% ao mês, escrever um algoritimo que determine o número de
//meses necessários para pagar a dívida
public class Exercicio02 {

	public static void main(String[] args) {
		double divida = 10000;
		double aplicacao = 1500;
		int cnt = 0;
		
		while (divida > aplicacao) {
			divida = divida + (divida * 0.025);
			aplicacao = aplicacao + (aplicacao * 0.04);
			cnt++;
		}
		
		System.out.println("A quantidade de meses necessário é de "+cnt+" meses!");
	}
}
