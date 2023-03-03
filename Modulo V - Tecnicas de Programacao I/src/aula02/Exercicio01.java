package aula02;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
1. Dada uma data e hora específiva,
use a nova API de data do Java para criar um objeto
ZonedDateTime com o seu fuso horário e imprimí-los
 */
public class Exercicio01 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2023,3,2,12,30,0,0);
        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss O");

        System.out.println(zonedDateTime.format(formatter));
    }
}
