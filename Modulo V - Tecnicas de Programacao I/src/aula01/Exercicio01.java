package aula01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
Dada uma data e hora específica em string, use a nova API de data do Java
para criar um objeto LocalDate, LocalTime e LocalDateTime e imprimílos
 */
public class Exercicio01 {

    public static void main(String[] args) {

        String dataHoraString = "28-02-2023 12:30:00 PM";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");

        LocalDateTime dataHora = LocalDateTime.parse(dataHoraString, formatter);

        LocalDate date = dataHora.toLocalDate();
        LocalTime time = dataHora.toLocalTime();

        System.out.println("LocalDate: " + date);
        System.out.println("LocalTime: " + time);
        System.out.println("LocalDateTime: " + dataHora);
    }
}
