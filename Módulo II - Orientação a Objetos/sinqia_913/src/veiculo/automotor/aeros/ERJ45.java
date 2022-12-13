package veiculo.automotor.aeros;

import veiculo.automotor.VeiculoAutomotor;
import veiculo.automotor.motores.Motor;
import veiculo.automotor.motores.MotorReacao;

import java.util.List;

public class ERJ45 extends VeiculoAutomotor {

    private int qtdePassageiros;

    private List<MotorReacao> motores;
    private boolean tripulado;
    private float peso;

    private String matricula;
    private String modelo;
    private String marca;

    private boolean emVoo = false;

    public ERJ45(
            int anoFabricacao,
            String cor,
            int qtdePassageiros,
            List<MotorReacao> motores,
            boolean tripulado,
            float peso,
            String modelo,
            String marca
    ) {
        super(anoFabricacao, cor);
        this.qtdePassageiros = qtdePassageiros;
        this.motores = motores;
        this.tripulado = tripulado;
        this.peso = peso;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public List<MotorReacao> getQtdeMotores() {
        return this.motores;
    }

    public boolean isTripulado() {
        return tripulado;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public void ligar() {
        System.out.println("Contato....");
        System.out.println("Combutível");
        for (Motor motor : motores) {
            System.out.println("Iniciando o motor: " + motor);
            motor.ligar();
        }
        System.out.println("Ligado");
        this.ligado = true;
    }

    @Override
    public void desligar() {
        System.out.println("Cortando combustível....");
        System.out.println("Desligando contato");
        System.out.println("Desligado");
        this.ligado = false;
    }

    @Override
    public void mover() {
        if (emVoo) {
            voar();
        } else {
            correr();
        }
    }

    protected void correr() {
        System.out.println("Iniciando corrida");
        System.out.println("Atingido velocidade necessária");
        System.out.println("Em voo");
        this.emVoo = true;
    }

    public void voar() {
        System.out.println("Continue a voar");
    }

}