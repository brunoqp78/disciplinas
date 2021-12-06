package algoritmos.colecoes.lista;

import java.util.HashSet;
import java.util.Scanner;

public class SetExercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String entrada = s.nextLine();
		String palavras[] = entrada.split(" ");
		HashSet<String> saida = new HashSet<>();
		for (int i=0;i<palavras.length;i++) {
			saida.add(palavras[i]);
		}
		System.out.println(saida.size());
	}

}
