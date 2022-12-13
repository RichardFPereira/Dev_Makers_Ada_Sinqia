package br.com.ada.zombiedice.dado;

public class DadoAmarelo extends Dado{
    //QUATRO DADOS AMARELOS
    //CEREBRO: 2
    //TIRO: 2
    //PASSOS: 2

    public DadoAmarelo(){
        super(
            new Face[]{
                Face.CEREBRO,
                Face.CEREBRO,
                Face.TIRO,
                Face.TIRO,
                Face.PASSOS,
                Face.PASSOS
            }
        );
    }
}
