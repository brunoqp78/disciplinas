package algoritmos.colecoes.lista;

import java.util.HashMap;
import java.util.Scanner;

public class MapExercicio4 {
	private static HashMap<String, String> dic = new HashMap<>();
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		criarDicionario();
		String entrada = s.nextLine();
		System.out.println(corretor(entrada));		
	}	
	
	public static void criarDicionario() {
		dic.put("Udi", "Uberlândia");
		dic.put("Uberlândi", "Uberlândia");
		dic.put("berlândia", "Uberlândia");
		dic.put("Uberlndia", "Uberlândia");
		dic.put("Uberlânda", "Uberlândia");		
	}
	
	public static String corretor(String entrada) {
		String resposta = "";		
		String palavras[] = entrada.split(" ");
		for (int i = 0; i < palavras.length; i++) {
			resposta += dic.getOrDefault(palavras[i], palavras[i]) + " ";			
		}		
		return resposta;
	}
	

}
