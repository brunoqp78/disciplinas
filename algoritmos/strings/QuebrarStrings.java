package algoritmos.strings;

import java.util.Arrays;

public class QuebrarStrings {

	public static void main(String[] args) {
		String texto2 = "Bruno Queiroz;Iftm;Algoritmos;Sistemas para internet";
		String resultado2[] = texto2.split(";"); 

		//Arrays.toString imprime o conteúdo do vetor
		System.out.println(Arrays.toString(resultado2));
		System.out.println(resultado2[0]);
		
		String texto4 = "02/12/2020";
		String resultado4[] = texto4.split("/");
		System.out.println(Arrays.toString(resultado4));
		
		/*
		texto3 = O professor falou que podemos utilizar Split para capturar cada palavra.

		texto3.split(“ ”) == [O, professor, falou, que, podemos, utilizar, Split, para, capturar, cada, palavra];

		

		texto5 = 111.111.111-22
		texto5.split(“-”) == [111.111.111, 22]
		 */
	}

}
