import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        DayOfWeek dia = DayOfWeek.WEDNESDAY;
        String formatado = String.format("$ %.2f é o preço.", 2.0/3);

        LocalDateTime data = LocalDateTime.now();


        System.out.printf("Imprime: "+formatado);

        System.out.printf("%tB", data);
    }
}