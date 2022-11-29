package Aula08;

public class ExemploException {
	
	public static void main(String[] args) {
		int[] vetor = new int[10];
		try {
			vetor[11] = 5;
		} catch (Exception e) {
			System.out.println("Presta atenção!");
		}		
	}
}