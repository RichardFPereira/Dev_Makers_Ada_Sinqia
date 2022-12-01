import java.util.ArrayList;
import java.util.UUID;

public class Aluno {
    String nome;
    String matricula;
    String curso;

    ArrayList<String> atividades = new ArrayList<>();
    //static int[] notas = new int[4];
    //static boolean[] presenca = new boolean[20];
    //boolean aprovado;

    public static Aluno matricular(String nome, String curso) {
        Aluno aluno = new Aluno();
        aluno.matricula = UUID.randomUUID().toString();
        aluno.nome = nome;
        aluno.curso = curso;
        return aluno;
    }
    public void assistirAula(String disciplina){
        System.out.println("O aluno " + nome + " assistiu a aula de "
                + disciplina + " no curso de " + curso + ".");
    }

    public void realizarAtividade(String disciplina, String atividade){
        System.out.println("O aluno " + nome + " realizou a atividade "
                + atividade + " no curso de " + curso);
    }

//    public static int calcularPresença() {
//        int cnt = 0;
//        for ( boolean i : presenca) {
//            if(i == true) {
//                cnt++;
//            }
//        }
//        return cnt * 100 / 20;
//    }
    /*public static int notaFinal(){
        int nota = 0;
        for (int i : notas) {
          nota += i;
        }
        return nota / notas.length;
    }*/
    /*public static boolean verificarAprovacao() {
        boolean aprovado;
        if (calcularPresença() > 80 && notaFinal() > 7){
            aprovado = true;
        } else {
            aprovado = false;
        }
        return aprovado;
    }*/
}
