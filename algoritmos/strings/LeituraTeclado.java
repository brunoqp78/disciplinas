package algoritmos.strings;

import java.util.Scanner;

public class LeituraTeclado {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String texto1 = s.next(); // lê toda a linha até o ENTER
		String texto2 = s.next(); // lê apenas uma palavra
		String texto3 = s.next(); // lê apenas uma palavra		
		
		System.out.println(texto1);
		System.out.println(texto2);
		System.out.println(texto3);
		s.close();		
	}

}
