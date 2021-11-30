package algoritmos.colecoes.exercicio.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		//criar a lista
		ArrayList<Aluno> alunos = new ArrayList<>();
		//popular a lista
		for(int i=0;i<2;i++) {
			/*
			String nome = s.nextLine();
			double nota = s.nextDouble();
			Aluno temp = new Aluno(nome, nota);
			alunos.add(temp);
			*/
			alunos.add(new Aluno(s.nextLine(), s.nextDouble()));
			s.nextLine();
		}
		double media = calcularMedia(alunos);
		System.out.println(media);
	}
	
	public static double calcularMedia(ArrayList<Aluno> alunos) {
		double soma=0;
		
		
		for (Aluno obj : alunos) {
			soma+=obj.getNota();
		}
		
		return soma/alunos.size();
		
		/*
		for (Iterator iterator = alunos.iterator(); iterator.hasNext();) {
			Aluno obj = (Aluno) iterator.next();
			soma+=obj.getNota();
		}
		*/
		
		
		
		/*
		for(int i=0;i<alunos.size();i++) {
			Aluno aluno = alunos.get(i);
			soma+=aluno.getNota();
		}
		*/
		
	}
}
