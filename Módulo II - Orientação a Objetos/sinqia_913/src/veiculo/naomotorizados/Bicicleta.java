package veiculo.naomotorizados;

import veiculo.Veiculo;

public class Bicicleta extends Veiculo {

    private String cor;
    private String marca;
    private int marchas;
    private int aro;
    private int quadro;
    private boolean montado;

    public Bicicleta(int anoFabricacao, String cor, String marca, int marchas, int aro, int quadro) {
        super(anoFabricacao, marchas);
        this.cor = cor;
        this.marca = marca;
        this.marchas = marchas;
        this.aro = aro;
        this.quadro = quadro;
        this.montado = false;
    }

    public boolean montarBicicleta() {
        System.out.println("Bicicleta montada!");
        montado = true;
        return montado;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
