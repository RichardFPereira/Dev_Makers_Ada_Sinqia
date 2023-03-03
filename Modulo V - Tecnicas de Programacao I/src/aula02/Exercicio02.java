package aula02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/*
2. A partir da data atual, calcule e imprima uma compra de R$ 64.000,00
parcelado em 48x, imprima o valor e a data de cada parcela usando a nova API de datas do Java.
Obs.: com uma nova regra;
Caso a data do pagamento seja no final de semana, a data do pagamento deve ser postergada para
a primeira segunda feira subsequente, porém sem alterar a data dos próximos pagamentos!
 */

public class Exercicio02 {
    public static void main(String[] args) {

        LocalDate dataAtual = LocalDate.now();

        BigDecimal valorCompra = new BigDecimal("64000");
        int numParcelas = 48;
        BigDecimal valorParcela = valorCompra.divide(new BigDecimal(numParcelas), 2, RoundingMode.HALF_EVEN);

        LocalDate dataPagamento = dataAtual.withDayOfMonth(5);

        for (int i = 1; i <= numParcelas; i++){
            dataPagamento = dataPagamento.withDayOfMonth(5);
            if (dataPagamento.getDayOfWeek().getValue() >= 6) {
                dataPagamento = dataPagamento.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            }
            if (i < 10) {
                System.out.println("Parcela 0" + i + ": " +
                        "R$ " + valorParcela + " - Data de Pagamento: " +
                        dataPagamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                        + " " + dataPagamento.getDayOfWeek());
            } else {
                System.out.println("Parcela " + i + ": " +
                        "R$ " + valorParcela + " - Data de Pagamento: " +
                        dataPagamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                        + " " + dataPagamento.getDayOfWeek());
            }
            dataPagamento = dataPagamento.plusMonths(1);
        }
    }
}
