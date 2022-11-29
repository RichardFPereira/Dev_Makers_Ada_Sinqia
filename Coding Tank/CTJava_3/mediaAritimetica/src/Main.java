import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        double media = 0;
        double nota = 0.0;
        int cnt = 0;

        while (nota != -1)
        {
            System.out.println("Digite uma nota: ");

            nota = entrada.nextDouble();

            if (nota > 0 && nota <= 10) {
                media = media + nota;
                cnt++;
            }
            else if (nota != -1) {
                System.out.println("Nota inválida!");
            }
        }

        media = (media / cnt);
        System.out.printf("A média das notas é: %.2f\n", media);
    }
}