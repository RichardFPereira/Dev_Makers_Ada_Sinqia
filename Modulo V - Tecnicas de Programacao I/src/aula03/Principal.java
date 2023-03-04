package aula03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {

        // Programação Funcional

        // Forma Declarativa vs Forma Imperativa

        //Forma Declarativa
        var numeros = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        numeros.removeIf (numero -> numero % 2 != 0);
        System.out.println(numeros);

        int nr = 20;
        double porcentagem = nr * 1.1;

        //Forma Imperativa
        var numerosPares = new ArrayList<>();
        for (int i = 0; i< numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                numerosPares.add(numeros.get(i));
            }
        }
        System.out.println(numerosPares);
    }
}
