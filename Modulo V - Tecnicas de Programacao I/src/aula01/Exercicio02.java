package aula01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
A partir da data atual, calcule e imprima uma compra de R$ 64.000,00
parcelado em 48x. Imprima o valor e a data de cada parcela usando a
nova API de datas do Java.
 */
public class Exercicio02 {
    public static void main(String[] args) {
        BigDecimal valorTotal = new BigDecimal("64000.00");
        int qtdParcelas = 48;

        LocalDate currentDate = LocalDate.now();

        BigDecimal valorParcela = valorTotal.divide(new BigDecimal(qtdParcelas), RoundingMode.HALF_EVEN);

        System.out.println("Compra parcelada em " + qtdParcelas + "x de R$" + valorParcela + ":");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 1; i <= qtdParcelas; i++) {
            LocalDate dataCobranca = currentDate.plusMonths(i);
            if (i < 10) {
                System.out.println("Parcela 0" + i + " - Vencimento: " + dataCobranca.format(formatter) + " - Valor: R$" + valorParcela);
            } else {
                System.out.println("Parcela " + i + " - Vencimento: " + dataCobranca.format(formatter) + " - Valor: R$" + valorParcela);
            }
        }
    }
}
