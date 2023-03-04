package aula03;

import java.util.function.Function;

/*
2. Escreva um método utilizando Function que receba um número e
retorne o dobro daquele número;
 */
public class Exercicio02 {
    public static void main(String[] args) {

        int num = 3;

        Function<Integer, Integer> dobro = (numero) -> numero * 2;

        System.out.println("O dobro de " + num + " é " +dobro.apply(num)+ "!");
    }
}
