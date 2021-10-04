package algoritmos.recursividade;

import java.util.Scanner;

public class Exemplo04ContarDigitos {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(contaDigitos(s.nextInt()));
	}
	
	public static int contaDigitos(int n){
		if (n<10) {
			return 1;
		}else {
			return 1 + contaDigitos(n/10);
		}
	}

}
