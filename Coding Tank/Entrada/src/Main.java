import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double valor = Double.parseDouble("1");
        System.out.println("O tamanho do args é: "+args.length);

        System.out.println("Arrays.deepToString(args) = " + Arrays.deepToString(args));
    }
}