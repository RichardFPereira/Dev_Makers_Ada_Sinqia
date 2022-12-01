public class Main {
    public static void main(String[] args) {
        VwGol golDoDiego = new VwGol(2022,"Preto",4);
        golDoDiego.ligar();
        System.out.println("A cor do gol do Diego é: "+golDoDiego.cor);

        VwGol golDoVitor = new VwGol(2021,"Branca", 2);
        System.out.println(golDoVitor.anoFabricacao);
    }
}