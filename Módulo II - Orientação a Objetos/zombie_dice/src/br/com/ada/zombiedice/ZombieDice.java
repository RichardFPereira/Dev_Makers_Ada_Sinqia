package br.com.ada.zombiedice;

import br.com.ada.zombiedice.dado.*;

public class ZombieDice {

    public static void main(String[] args) {

        DadoVerde dadoVerde = new DadoVerde();
        dadoVerde.jogar();
        System.out.println("O valor sorteado para o dado verde foi: " + dadoVerde.getFaceSorteada());

        DadoAmarelo dadoAmarelo = new DadoAmarelo();
        dadoAmarelo.jogar();
        System.out.println("O valor sorteado para o dado amarelo foi: " + dadoAmarelo.getFaceSorteada());

        DadoVermelho dadoVermelho = new DadoVermelho();
        dadoVermelho.jogar();
        System.out.println("O valor sorteado para o dado vermelho foi: " + dadoVermelho.getFaceSorteada());
    }
}
