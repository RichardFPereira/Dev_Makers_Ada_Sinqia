import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb = getNumber(input);
        System.out.println();
    }

    static int getNumber(Scanner input){
        try {
            System.out.println("Digite o valor desejado.");
            return input.nextInt();
        } catch (Exception e){
            input.nextLine();
            System.out.println("Número inválido.");
            return getNumber(input);
        }
    }
}