package algoritmos.recursividade;

import java.util.Scanner;

public class Exemplo02Fatorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(fatorial(n));
		System.out.println(fatorial2(n));

	}
	
	// fatorial(5) = 5! = 5*4*3*2*1*1
	// !5 = 5 * 4!
	public static long fatorial (int n) {
		if (n==0) {
			return 1;
		}
		else {
			return n * fatorial(n-1);
		}
	}
	
	public static long fatorial2(int n) {
		long r = 1;
		while(n>0) {
			r*=n;
			n--;
		}
		return r;
	}

}
