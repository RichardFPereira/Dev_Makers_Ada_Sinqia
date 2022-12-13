package br.com.ada.zombiedice.dado;

public class DadoVermelho extends Dado{
    //TRES DADOS VERMELHOS
    //CEREBRO: 1
    //TIRO: 3
    //PASSOS: 2

    public DadoVermelho(){
        super(
            new Face[]{
                Face.CEREBRO,
                Face.TIRO,
                Face.TIRO,
                Face.TIRO,
                Face.PASSOS,
                Face.PASSOS
            }
        );
    }

}
