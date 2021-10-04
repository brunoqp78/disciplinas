package algoritmos.recursividade;

import java.util.Scanner;

public class Exemplo03Somatoria {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(somatoria(s.nextInt()));
		//int n = s.nextInt();
		//int s = somatoria(n);
		//System.out.println(s);

	}
	
	public static long somatoria(int n) {
		//caso da parada
		if (n==1) {
			return 1;
		}else {
		//caso recursivo
			return n + somatoria(n-1);
		}
	}

}
