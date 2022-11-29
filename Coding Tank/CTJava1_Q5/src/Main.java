public class Main {
    public static void main(String[] args) {
        double farenheit;

        double celsius = 32;
        final double fator1 = 9d/5;
        final double fator2 = 32d;

        farenheit = (celsius * fator1) + fator2;

        System.out.println("\nA temperatura de "+celsius+"ºC é igual a "+farenheit+"ºF.");

        celsius = 18;
        farenheit = (celsius * fator1) + fator2;

        System.out.println("\nA temperatura de "+celsius+"ºC é igual a "+farenheit+"ºF.");
    }
}