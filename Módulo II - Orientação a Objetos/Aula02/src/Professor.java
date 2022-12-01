import java.util.ArrayList;
import java.util.UUID;

public class Professor {
    String nome;
    String registro;
    Double valorHoraAula;
    ArrayList<String> disciplinas = new ArrayList<>();
    ArrayList<String> turmas = new ArrayList<>();

    public static Professor contratarProfessor(String nome, Double valorHoraAula) {
        Professor professor = new Professor();
        professor.nome = nome;
        professor.registro = UUID.randomUUID().toString();
        professor.valorHoraAula = valorHoraAula;
        professor.disciplinas.add("POO_1");
        professor.disciplinas.add("Banco de dados");
        return professor;
    }

    public void deuAula(String turma, String disciplina){
        System.out.println("O professor " + nome + " deu aula de "
                + disciplina + " na turma " + turma);
    }

    public void corrigiuAtividade(String turma, String atividade, String disciplina){
        System.out.println("O professor " + nome + " corrigiu a " + atividade +
                " da disciplina " + disciplina + ".");
    }
}
