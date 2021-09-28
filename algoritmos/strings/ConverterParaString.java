package algoritmos.strings;

import java.util.Scanner;

public class ConverterParaString {

	public static void main(String[] args) {
		// entrar 3 números inteiros e então somá-los. 
		// Por fim, imprimir o primeiro e depois o último digito do número resultante.
		
		Scanner s = new Scanner(System.in);
		int n1, n2, n3, r;
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3 = s.nextInt();
		
		r = n1+n2+n3;
		
		System.out.println(r);
		
		String resultado = String.valueOf(r);
		System.out.print(resultado.charAt(0));
		System.out.println(resultado.charAt(resultado.length()-1));		
				
		
		s.close();

	}

}
