package aula03;

/*
4. Escreva um método utilizando Supplier para retornar uma data
com o LocalDate.now();
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class Exercicio04 {
    public static void main(String[] args) {

        Supplier<LocalDate> data = () -> LocalDate.now();

        LocalDate dataAtual = data.get();

        System.out.println("Hoje é: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }


}
