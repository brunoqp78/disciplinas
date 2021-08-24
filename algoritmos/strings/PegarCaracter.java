package algoritmos.strings;

import java.util.Scanner;

public class PegarCaracter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String teste = s.nextLine();
		int pos = s.nextInt();
		if (teste.length()>=pos) {		
			System.out.println(teste.charAt(pos-1));
		}
		
		for (int i = 0; i < teste.length(); i++) {
			System.out.println(teste.charAt(i));
		}
		
	}

}
