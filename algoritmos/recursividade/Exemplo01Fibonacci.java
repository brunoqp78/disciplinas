package algoritmos.recursividade;

import java.util.Scanner;

public class Exemplo01Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero = s.nextInt();
		long r = fibonacci(numero);
		System.out.println(r);
		//System.out.println(f((new Scanner(System.in)).nextInt()));
	}
	
	/**
	 * Função recursiva para calcular a posição n da sequencia de fibonacci
	 * @param n : posição buscada
	 * @return : número da posição buscada.
	 */
	public static long fibonacci(int n) {
		// caso da parada(caso base) : que o algoritmo para e retorna valores *constantes*	
		if (n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}
		else {
		/* caso recursivo : terá as chamadas recursivas para resolver um problema complexo, dividindo-o
		em problemas menores.
		*/			
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

}
