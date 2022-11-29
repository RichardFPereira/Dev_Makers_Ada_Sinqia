public class Paridade {
    public static void main(String[] args) {
        System.out.printf("O numero %.0f e %s!", Double.parseDouble(args[0]), (Double.parseDouble(args[0])%2 == 0) ? "par" : "impar");
    }
}