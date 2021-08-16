package algoritmos.strings;

import java.util.Scanner;

public class ProblemaBufferTecladoString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o número");
		int x = s.nextInt();
		clearBuffer(s);
		 // s.nextLine(); 
		
		System.out.println("Digite a frase");
		String texto1 = s.nextLine(); // todo o texto da linha
		        
		System.out.println("Digite a palavra");
		String texto2 = s.next(); // a primeira palavra
		
		System.out.println(x);
		System.out.println(texto1);
		System.out.println(texto2);

	}
	
	public static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
