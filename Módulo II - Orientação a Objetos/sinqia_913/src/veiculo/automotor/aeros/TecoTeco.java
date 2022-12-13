package veiculo.automotor.aeros;

import veiculo.automotor.VeiculoAutomotor;
import veiculo.automotor.motores.MotorCombustao;

import java.util.List;

public class TecoTeco extends VeiculoAutomotor {

    //constante
    public static final int NUMERO_PROJETO = 86;

    private List<MotorCombustao> motores;
    private final int qtdePortas;
    private boolean ligado;
    private int qtdePassageiros;

    public TecoTeco(
            int anoFabricacao,
            String cor,
            List<MotorCombustao> motores,
            int qtdePortas,
            int qtdePassageiros
    ) {
        super(anoFabricacao, cor);
        this.motores = motores;
        this.qtdePortas = qtdePortas;
        this.qtdePassageiros = qtdePassageiros;
        this.ligado = false;
    }

    public int getQtdePortas() {
        return qtdePortas;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void mover() {

    }
}