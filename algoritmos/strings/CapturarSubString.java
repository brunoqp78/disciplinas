package algoritmos.strings;

import java.util.Scanner;

public class CapturarSubString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String texto = s.nextLine();

		int pos1 = s.nextInt();
		int pos2 = s.nextInt();
		if (pos1 >= 0 && pos1 <= texto.length() - 1 && pos2 >= 1 && pos2 <= texto.length()) {
			for (int i = pos1; i < pos2; i++) {
				System.out.print(texto.charAt(i));
			}
			System.out.println(" ");
			// usar funções
			String texto2 = texto.substring(pos1, pos2);
			System.out.println(texto2);
		}
		
		// substring(pos1, pos2)
		// substring(pos1) -> nesse caso pos2 = length()
		
		System.out.println(texto.substring(2, texto.length()));
		System.out.println(texto.substring(2));

	}
	
	

}
