package algoritmos.colecoes.exercicio.set;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia uma frase e informe o número de palavras da frase,  
		 * sem considerar redundância de palavras (não repetidas).
			Use HashSet para fazer essa verificação.
		 */
		//entrada do usuário
		Scanner s = new Scanner(System.in);
		String frase = s.nextLine();
		String palavras2[] = frase.split(" ");
		
		HashSet<String> conjunto = new HashSet<>();
		
		for(int i = 0; i< palavras2.length; i++) {
			conjunto.add(palavras2[i]);
		}
		
		for (String string : conjunto) {
			System.out.println(string);
		}
		System.out.println(conjunto.size());
		
	}

}
