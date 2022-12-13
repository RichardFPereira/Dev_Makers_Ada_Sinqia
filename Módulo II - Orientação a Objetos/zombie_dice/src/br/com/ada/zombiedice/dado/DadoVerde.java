package br.com.ada.zombiedice.dado;

public class DadoVerde extends Dado{
    //SEIS DADOS VERDES
    //CEREBRO:3
    //TIRO: 1
    //PASSOS: 2

    public DadoVerde(){
        super(
            new Face[]{
                Face.CEREBRO,
                Face.CEREBRO,
                Face.CEREBRO,
                Face.TIRO,
                Face.PASSOS,
                Face.PASSOS
            }
        );
    }
}
