package aula03;

import java.util.function.Predicate;

/*
1. Escreva um método utilizando Predicate que recebe um número e
verifica se é par;
 */
public class Exercicio01 {

    public static void main(String[] args) {
        int num = 8;

        Predicate<Integer> par = (numero) -> numero % 2 == 0;

        if (par.test(num) && num > 0) {
            System.out.println("O numero " + num + " e par!");
        } else {
            System.out.println("O numero " + num + " nao e par!");
        }
    }
}
