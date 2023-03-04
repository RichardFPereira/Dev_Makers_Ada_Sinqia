package aula03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
3. Escreva um método utilizando Consumer para imprimir elementos
de uma lista;
 */
public class Exercicio03 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

        Consumer<Integer> imprimirLista = (lista) -> System.out.println(lista + "");

        numeros.forEach(imprimirLista);
    }
}
