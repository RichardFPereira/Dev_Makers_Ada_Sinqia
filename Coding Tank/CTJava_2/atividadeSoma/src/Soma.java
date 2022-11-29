import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        if (args.length > 2){
            System.out.println("Erro! Quantidade inválida!");
        } else if (args.length == 2) {
            double sum = Double.parseDouble(args[0]) + Double.parseDouble(args[1]);
            System.out.printf("A soma de %.2f e %.2f é: %.2f.", Double.parseDouble(args[0]), Double.parseDouble(args[1]), sum);
        } else if (args.length == 1) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o segundo numero: ");
            double num2 = entrada.nextDouble();
            double sum = Double.parseDouble(args[0]) + num2;
            System.out.printf("A soma de %.2f e %.2f é: %.2f.", Double.parseDouble(args[0]), num2, sum);
        }else {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o primeiro número: ");
            double num1 = entrada.nextDouble();
            System.out.println("Digite o segundo número: ");
            double num2 = entrada.nextDouble();
            double sum = num1 + num2;
            System.out.printf("A soma de %.2f e %.2f é: %.2f.", num1, num2, sum);

        }
    }
}