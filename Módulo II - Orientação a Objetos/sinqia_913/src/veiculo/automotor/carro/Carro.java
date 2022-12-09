package veiculo.automotor.carro;

import veiculo.Veiculo;
import veiculo.automotor.VeiculoAutomotor;

public class Carro extends VeiculoAutomotor {

    private int qtdePortas;
    private boolean arCondicionado;
    protected boolean ligado;

    public Carro(int anoFabricacao, String cor, int qtdePortas, boolean arCondicionado) {
        super(anoFabricacao, cor);
        this.qtdePortas = qtdePortas;
        this.arCondicionado = arCondicionado;
    }

    public Carro(int anoFabricacao, String cor, int qtdePortas) {
        super(anoFabricacao, cor);
        this.qtdePortas = qtdePortas;
    }

    public int getQtdePortas() {
        return qtdePortas;
    }

    public boolean getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

}