import java.util.Scanner;

public class Operacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma operação. ( + , -, *, /):");
        String operacao = entrada.nextLine();

        if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")){
            System.out.println("Digite o primeiro número:");
            Double num1 = entrada.nextDouble();

            System.out.println("Digite o primeiro número:");
            Double num2 = entrada.nextDouble();

            if (operacao.equals("+")) {
                double sum = num1 + num2;
                System.out.println("A soma entre "+num1+" e "+num2+" é: "+sum);
            } else if (operacao.equals("-")) {
                double sub = num1 - num2;
                System.out.println("A subtração entre "+num1+" e "+num2+" é: "+sub);
            } else if (operacao.equals("*")) {
                double mult = num1 * num2;
                System.out.println("A multiplicação entre "+num1+" e "+num2+" é: "+mult);
            } else {
                double div = num1 / num2;
                System.out.println("A divisão entre "+num1+" e "+num2+" é: "+div);
            }
        }

        else {
            System.out.println("Erro! Digite uma operação válida.");
        }
    }
}