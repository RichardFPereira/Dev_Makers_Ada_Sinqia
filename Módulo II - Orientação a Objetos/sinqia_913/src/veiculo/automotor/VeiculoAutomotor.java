package veiculo.automotor;

import veiculo.Veiculo;
import veiculo.automotor.carro.Carro;

public class VeiculoAutomotor extends Veiculo {

    private boolean ligado;

    public VeiculoAutomotor(int anoFabricacao, String cor) {
        super(anoFabricacao, cor);
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Veiculo esta ligado");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Veiculo esta desligado");
    }

}