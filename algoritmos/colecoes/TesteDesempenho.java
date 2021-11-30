package algoritmos.colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TesteDesempenho {

	public static void main(String[] args) {
		Collection<Integer> colecao = new ArrayList<>();

		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < 3000000; i++) { 	      
			colecao.add(i); 	    
		}

		for (int i = 0; i < 30; i++) { 	      
			colecao.contains(i);  
		}

		long tempoFinal = System.currentTimeMillis();
		System.out.println(((tempoFinal-tempoInicial) / 1000.0) + " segundos" );

	}

}
