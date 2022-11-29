public class VwGol {

    int anoFabricacao;
    String cor;
    int qtdPortas;
    boolean ligado = false;

    public static void montar() {
        // Contexto static pertence a classe e não ao objeto
        System.out.println("Montado!");
    }

    public void ligar(){
        // Sem a palavra stratic o método pertence ao contexto do objeto e não da classe
        this.ligado = true;
    }

    public static void main(String[] args) {

    }
}
