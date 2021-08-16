package algoritmos.strings;

import java.util.Scanner;

public class CompararStrings {

	public static void main(String[] args) {
		
		String texto1, texto2;
		Scanner s = new Scanner(System.in);
		texto1=s.nextLine();
		texto2="10";
		// código não recomendado		
		if (texto1==texto2) {
			System.out.println("Deu Certo");
		}else {
			System.out.println("Deu errado");
		}
		
		if (texto1.equals(texto2)) {
			System.out.println("Deu Certo, são iguais");
		}else {
			System.out.println("Deu errado");
		}
		s.close();
		// ignorar maiusculo e minusculo
		//texto1.equalsIgnoreCase(anotherString)
		
		//não use ==, >, >=, <, <= para comparar texto
		// equals , compareTo
	}

}
