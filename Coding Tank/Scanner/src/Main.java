import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;

        System.out.println("Digite o texto desejado: ");
        texto = entrada.nextLine();

        System.out.println("O que foi digitado é: "+ texto);

        System.out.println("\nDigite um número inteiro: ");
        int inteiro = entrada.nextInt();

        System.out.printf("O número é: %d", inteiro);
    }
}