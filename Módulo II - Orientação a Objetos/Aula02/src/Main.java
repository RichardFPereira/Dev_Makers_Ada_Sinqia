import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = input.next();
        System.out.println("Digite o nome do curso: ");
        String curso = input.next();

        Aluno aluno = Aluno.matricular(nome, curso);
        aluno.assistirAula("POO_1");
        aluno.realizarAtividade("POO_1", "Atividade_01");

        System.out.println("Digite o nome do professor: ");
        nome = input.next();
        System.out.println("Digite o nome da disciplina: ");
        String disciplina = input.next();

        Professor professor = Professor.contratarProfessor(nome,1.0);
        professor.deuAula("Dev_makers_913", "POO_1");
        professor.corrigiuAtividade("Dev_makers_913",
                "Atividade01", "POO_1");

        input.close();
    }
}
