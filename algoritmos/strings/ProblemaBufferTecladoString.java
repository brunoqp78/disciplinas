package algoritmos.strings;

import java.util.Scanner;

public class ProblemaBufferTecladoString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o número");
		int x = s.nextInt();
		//s.nextLine();
		clearBuffer(s);
		System.out.println("Digite a frase");
		String texto6 = s.nextLine(); // todo o texto da linha
		        
		System.out.println("Digite a palavra");
		String texto7 = s.next(); // a primeira palavra

	}
	
	public static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
