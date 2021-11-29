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
		objeto.add(1, "UFg");
		objeto.add(objeto.size()-1, "Unesp");
		objeto.add(temp);
		objeto.set(0, "UFTM");
		
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
	
}
