package algoritmos.strings;

import java.util.Scanner;

public class CriarStrings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero = 10;
		// forma simplificada de declaração de variáveis(objetos) Strings
		String s1 = "Bruno";
		String s2 = "Bruno";
		String s3 = "Pedro";
		// forma original de declaração de variáveis (objetos) Strings
		String s4 = new String("Bruno");
		
		String s5 = new String(); // String s5 = "";
		char texto[] = {'T','e','x','t','o'};
		String s6 = new String(texto);
		String s7 = new String(texto, 0, 3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		

		//String s10 = s.nextLine();
		
	}

}
