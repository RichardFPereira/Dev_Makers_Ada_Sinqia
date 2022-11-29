public class Main {
    public static void main(String[] args) {
        VwGol golDoDiego = new VwGol();
        golDoDiego.anoFabricacao = 2022;
        golDoDiego.cor = "Preto";
        golDoDiego.qtdPortas = 5;
        golDoDiego.ligar();
        golDoDiego.montar();
        System.out.println("A cor do gol do Diego é: "+golDoDiego.cor);
        mudarCor(golDoDiego);
        System.out.println("A cor do gol do Diego é: "+golDoDiego.cor);

        VwGol golDoVitor = new VwGol();
        golDoVitor.anoFabricacao = 2021;
        golDoVitor.cor = "Branca";
        golDoVitor.qtdPortas = 3;
        mudarCor(golDoVitor);
        System.out.println(golDoVitor.anoFabricacao);

    }

    public static void mudarCor(VwGol gol) {
        gol.cor = "Azul";
        gol.anoFabricacao = 2029;
    }
}