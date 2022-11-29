import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String name;

        System.out.println("Digite seu nome: ");
        name = entrada.nextLine();

        String hello = greet(name);
        System.out.println(hello);
    }

    static String greet(String name) {
        String hello = "Hello";

        if (name == null || name.equals("")) {
            hello = hello + " human!";
        }

        else {
            hello = hello + " " + name + "!";
        }
        return hello;
    }
}