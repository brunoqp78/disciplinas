package algoritmos.strings;

import java.util.Scanner;

public class StringContemString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String textoOriginal = s.nextLine();
		String textoBuscado = s.nextLine();
		
		boolean resultado = textoOriginal.contains(textoBuscado);
		
		System.out.println(resultado);
		
		int pos = textoOriginal.indexOf(textoBuscado);
		
		String novo = textoOriginal.substring(pos);
		
		System.out.println(pos);
		
		System.out.println(novo);		

	}

}
