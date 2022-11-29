import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número par: ");
        int numero = entrada.nextInt();

        while ((numero % 2 != 0) || (numero == 0)) {
            System.out.println("Erro! Digite um número par: ");
            numero  = entrada.nextInt();
        }
        System.out.println("O número " + numero + " é par!");
        int soma = 0;
        for (int i = 0; i < numero; i++) {
            soma += numero;
        }
        System.out.println("O número " + numero + " multiplicado por ele mesmo é: " + soma);
    }
}