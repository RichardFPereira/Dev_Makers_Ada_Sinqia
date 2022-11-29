package Aula06;

public class Calculadora {
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		
		Calculadora calc = new Calculadora();
				
		int resultado = soma(x, y);
		System.out.println(resultado);
	}

	static int soma(int a, int b) {
		return a+b;
	}
}
