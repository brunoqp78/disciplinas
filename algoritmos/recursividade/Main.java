package algoritmos.recursividade;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();
        
        int n = s.nextInt();
        
        for (int i=0;i<n;i++){
            int x = s.nextInt();
            fib.setContador(0);
            long temp = fib.executa(x);
            System.out.println("fib("+x+") = "+ fib.getContador() +" calls = " + temp);
            
        }
 
    }
 
}

class Fibonacci{
    private int contador = 0;
    
    public long executa(int n) {
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
		    contador = contador+2;
			return executa(n-1) + executa(n-2);
		}
	}
	
	public int getContador(){
	    return contador;
	}
	
	public void setContador(int cont){
	    contador = cont;
	}
	
}