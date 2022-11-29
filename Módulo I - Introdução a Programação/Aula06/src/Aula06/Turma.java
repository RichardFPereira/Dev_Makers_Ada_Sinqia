package Aula06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Turma {
	String nomeAluno;
	int matriculaAluno;
	double[] notasAluno = new double[4];
	double mediaAluno;
	
	void novoAluno(String nome, int matricula, double[] notas, double media) {
		nomeAluno = nome;
		matriculaAluno = matricula;
		notasAluno = notas;
		mediaAluno = media;
	}
	
	public static void main(String[] args) {		
		Turma[] vetorAlunos = new Turma[5];
		
		for(int i = 0; i < 5; i++) {
			vetorAlunos[i] = cadastraAluno();	
			vetorAlunos[i].mediaAluno = media(vetorAlunos[i]);
			}		
		for(int i = 0; i < 5; i++) {
			System.out.println("\n\nNome: "+vetorAlunos[i].nomeAluno);
			System.out.println("Matricula: "+vetorAlunos[i].matriculaAluno);			
			for(int j = 0; j < 4; j++) {
				System.out.printf("Nota %d: %.2f: ", j+1,vetorAlunos[i].notasAluno[j]);
			}
			System.out.printf("\nMedia: %.2f", vetorAlunos[i].mediaAluno);
		}
	}
	
	public static Turma cadastraAluno() {		
		Scanner input = new Scanner(System.in);
		Turma aluno = new Turma();
		boolean test = false;
		int matricula = 0;
		String nome = null;
		double media;
		media = 0;
		
		while (!test) {
			System.out.println("Digite o nome do(a) aluno(a): ");
			try {
				nome = input.next();
				test = true;
			} catch (Exception e) {
				System.out.println("O número de matrícula deve ser inteiro e maior que zero!");				
				input.next();
			}
		}			
		test = false;
		while (!test) {
			System.out.println("Digite o número de matrícula do(a) aluno(a) "+nome+": ");
			try {
				matricula = input.nextInt();
				if (matricula > 0) {
					test = true;
				} else {
					System.out.println("O número de matrícula deve ser inteiro e maior que zero!");
				}
			} catch (Exception e) {
				System.out.println("O número de matrícula deve ser inteiro e maior que zero!");				
				input.next();
			}
		}
		double[] notas = new double[4];
		for (int j = 0; j < 4; j++) {
			test = false;
			while (!test) {
				System.out.println("Digite a "+(j+1)+"º nota do(a) aluno(a) "+nome+": ");
				try {
					notas[j] = input.nextDouble();
					if(notas[j] >= 0.0 && notas[j] <= 10.0) {
						test = true;
					} else {
						System.out.println("A nota deve ser um número entre 0 e 10.");
					}
				} catch (Exception e) {
					System.out.println("A nota deve ser um número entre 0 e 10.");
					input.next();
				}
			}				
		}
		aluno.novoAluno(nome, matricula, notas, media);		
		return aluno;
	}
	
	public static double media(Turma alunoTurma) {
		double media = 0;
		for(double notas : alunoTurma.notasAluno) {
			media += notas;
		}
		return media /= alunoTurma.notasAluno.length;
	}
}
