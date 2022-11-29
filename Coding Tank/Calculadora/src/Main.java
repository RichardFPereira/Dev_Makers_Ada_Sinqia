public class Main {
    public static void main(String[] args) {

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double sum = num1 + num2;

        System.out.printf("A soma de %.2f e %.2f eh: %.2f", num1, num2, sum);

        String check1 = (num1%2 == 0) ? "Par": "Impar";
        String check2 = (num2%2 == 0) ? "Par": "Impar";

        System.out.printf("\nO num1 e: %s\nO num2 e: %s", check1, check2);
    }
}