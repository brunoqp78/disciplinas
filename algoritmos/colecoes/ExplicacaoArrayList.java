package algoritmos.colecoes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExplicacaoArrayList {

	public static void main(String[] args) {
		ArrayList<String> objeto = new ArrayList<String>();
		// listas tem várias funções : uma delas é adicionar
		String temp = "IFTM";
		
		objeto.add("UFU");
		objeto.add("UFU");
		objeto.add(1, "UFg");
		objeto.add(objeto.size()-1, "Unesp");
		objeto.add(temp);
		objeto.set(0, "UFTM");
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno("Bruno"));
		alunos.add(new Aluno("Edson"));
		alunos.add(new Aluno("Wilton"));
		ArrayList<Aluno> novos = new ArrayList<Aluno>(alunos.subList(0, 1)) ;
		for (Iterator iterator = novos.iterator(); iterator.hasNext();) {
			Aluno aluno = (Aluno) iterator.next();
			System.out.println(aluno.getNome());
		}
		
		
		List<String> tempList = objeto.subList(1, 3);
		
		for (Iterator iterator = tempList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		//objeto.clear();		
		
		
		
		
		
		//classes Wrapper
		//int -> Integer
		//double -> Double
		//float -> Float
		//long -> Long
		//char -> Character

	}

}

class Aluno{
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
