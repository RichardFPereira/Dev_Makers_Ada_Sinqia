public class VwGol {

    int anoFabricacao;
    String cor;
    int qtdPortas;
    boolean ligado = false;

    public VwGol(int anoFabricacao, String cor, int qtdPortas) {
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.qtdPortas = qtdPortas;
    }

    public  static VwGol montar() {
        return new VwGol(2022,"Preto", 5);
    }

    public void ligar(){
        // Sem a palavra stratic o método pertence ao contexto do objeto e não da classe
        this.ligado = true;
    }
}
