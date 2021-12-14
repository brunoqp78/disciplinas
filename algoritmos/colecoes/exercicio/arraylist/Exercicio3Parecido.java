package algoritmos.colecoes.exercicio.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3Parecido {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> frases = new ArrayList<>();
		String texto = "";
		while(texto.equalsIgnoreCase("Sair") == false) {
			texto = s.nextLine();
			if (texto.equalsIgnoreCase("Sair") == false) {
				frases.add(texto);
			}
		}		
		
		for (int i = 0; i < frases.size(); i++) {
			String palavras[] = frases.get(i).split(" ");
			System.out.print(palavras[palavras.length-1] + " ");
		}
		
		for (String frase : frases) {
			//System.out.println(string);
			String palavras[] = frase.split(" ");
			System.out.print(palavras[palavras.length-1] + " ");
		}
		
	}

}
