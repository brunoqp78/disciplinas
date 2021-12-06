package algoritmos.colecoes.lista;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SetExercicio2 {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o número de cidades: ");
		int n = s.nextInt();
		s.nextLine();
		HashSet<String> nomeCidades = new HashSet<>();
		for(int i=0;i<n;i++) {
			String nomeCidade = s.nextLine();
			nomeCidades.add(nomeCidade);			
		}
		System.out.println("Saída: ");
		for (String nomes : nomeCidades) {
			System.out.println(nomes);
		}
	}
	
}
