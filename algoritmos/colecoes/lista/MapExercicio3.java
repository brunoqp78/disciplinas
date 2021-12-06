package algoritmos.colecoes.lista;

import java.util.HashMap;
import java.util.Scanner;

public class MapExercicio3 {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		HashMap<String, String> estados = new HashMap<>();
		estados.put("MG", "Minas Gerais");
		estados.put("SP", "São Paulo");
		estados.put("RJ", "Rio de Janeiro");
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite a sigla de um estado: ");
			String sigla = s.next();
			System.out.println(estados.getOrDefault(sigla.toUpperCase(), "Não existe estado com essa sigla."));
		}
	}
	
}
