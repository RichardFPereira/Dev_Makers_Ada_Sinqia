public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Runnable r = () -> {
            System.out.println("Teste0");
            System.out.println("Teste1");
            System.out.println("Teste2");
        };
        r.run();
    }
}