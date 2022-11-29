import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int limiteInferior = 0;
        int limiteSuperior = 0;
        int temp = 0;
        int cnt = 1;
        double result = 0;
        boolean test = false;
        int[] aux = new int[0];
        int[] primos = new int[1];

        while(test == false){
            System.out.println("Digite o primeiro número: ");
            limiteInferior = entrada.nextInt();
            System.out.println("Digite o segundo número: ");
            limiteSuperior = entrada.nextInt();

            if (limiteInferior >= 0 && limiteSuperior >= 0) {
                test = true;
            } else {
                System.out.println("Ambos os números devem ser positivos.");
            }
        }

        if (limiteInferior > limiteSuperior) {
            temp = limiteInferior;
            limiteInferior = limiteSuperior;
            limiteSuperior = temp;
        }

        while (limiteSuperior >= limiteInferior) {
            temp = limiteSuperior;
            result = temp-1;

            while ((result > 1)) {
                if (temp % result == 0) {
                    result = 0;
                    test = false;
                } else {
                    result--;
                    test = true;
                }
            }
            if (test && (temp > 1)){
                int i = primos.length;
                primos[i-1] = temp;
                aux = new int[cnt];
                for (int j = 0; j < aux.length; j++) {
                    aux[j] = primos[j];
                }
                cnt++;
                primos = new int[cnt];
                for (int j = 0; j < aux.length; j++) {
                    primos[j] = aux[j];
                }
            }
            limiteSuperior--;
        }
        System.out.println("Os numeros primos no intervalo digitado é/são: ");
        System.out.println("Tamanho do array: " + aux.length);
        for (int i = 0; i < aux.length; i++) {
            System.out.print(aux[i]+",");
        }
    }
}