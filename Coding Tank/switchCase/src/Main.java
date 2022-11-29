import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro de 1 a 10.");
        Scanner entrada = new Scanner(System.in);
        int cnt = entrada.nextInt();

        switch (cnt) {
            case 10:
                System.out.println("10!");
            case 9:
                System.out.println("9!");
            case 8:
                System.out.println("8!");
            case 7:
                System.out.println("7!");
            case 6:
                System.out.println("6!");
            case 5:
                System.out.println("5!");
            case 4:
                System.out.println("4!");
            case 3:
                System.out.println("3!");
            case 2:
                System.out.println("2!");
            case 1:
                System.out.println("1!");
            default:
                System.out.println("BOOM!");
        }
        /*switch (cnt) {
            case 10:
                System.out.println("10!");
                break;
            case 9:
                System.out.println("9!");
                break;
            case 8:
                System.out.println("8!");
                break;
            case 7:
                System.out.println("7!");
                break;
            case 6:
                System.out.println("6!");
                break;
            case 5:
                System.out.println("5!");
                break;
            case 4:
                System.out.println("4!");
                break;
            case 3:
                System.out.println("3!");
                break;
            case 2:
                System.out.println("2!");
                break;
            case 1:
                System.out.println("1!");
                break;
            default:
                System.out.println("BOOM!");
        }*/
    }
}