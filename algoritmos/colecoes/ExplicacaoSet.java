package algoritmos.colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExplicacaoSet {

	public static void main(String[] args) {
		ArrayList<String> objeto = new ArrayList<>();
		// listas tem várias funções : uma delas é adicionar
		System.out.println("Listas:");
		objeto.add("a");
		objeto.add("a");
		objeto.add("aa");
		objeto.add("aaa");
		objeto.add("aaaa");
		objeto.add("aaaaa");
		
		for(String obj : objeto) {
			System.out.println(obj);
		}
		System.out.println(objeto.contains("a"));
		System.out.println(objeto.isEmpty());
		System.out.println(objeto.size());
		
		System.out.println("Conjuntos:");
		//declarar uma Set, utilizando a implementação HashSet
		HashSet<String> objeto2 = new HashSet<>();
		objeto2.add("a");
		//não insere elementos repetidos
		objeto2.add("a");
		objeto2.add("aa");
		objeto2.add("aaa");
		objeto2.add("aaaa");
		objeto2.add("aaaaa");
		for (String obj2 : objeto2) {
			System.out.println(obj2);
		}
		System.out.println(objeto2.contains("a"));
		System.out.println(objeto2.isEmpty());
		System.out.println(objeto2.size());
		
		
	}

}
