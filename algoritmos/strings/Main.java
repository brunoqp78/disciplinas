package algoritmos.strings;

import java.util.Scanner;

public class Main
{    
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		String original = "12345678";
		String teste = "678";
		System.out.println(original.endsWith(teste));
		
		
		/*
		 * Ambos são bem mais rápidos para concatenação de valores do que a String comum 
		 * e fazem exatamente a mesma função. A principal diferença é que o StringBuffer 
		 * é sincronizado, enquanto que o outro não. Assim, você garante a consistência 
		 * do seu código quando há diversas threads lendo ou modificando a mesma String. 
		 * Para esses casos, o ideal é usar o StringBuffer.
		 * 
		 * Porém o StringBuilder ainda é mais rápido do que o StringBuffer.
		*/
		/*
		StringBuilder texto2 = new StringBuilder();
		StringBuffer texto = new StringBuffer();
		texto.append('c');
		texto.append(12.3);
		texto.delete(0, 1);
		texto.setCharAt(0, 'd');
		System.out.println(texto);
		
		String teste = "";
		teste += 'c';
		
		System.out.println(teste);
		*/
		s.close();
/*	
		String entrada = "Iftm Uberlândia centro";
		String saida = "";
		for(int i=0;i<entrada.length();i++) {
			char temp =  entrada.charAt(i);
			if (temp != ' ') {
				if (i < entrada.length()/2) {
					temp +=3;
				}else {
					temp -=2;
				}
			}			
			saida = saida + temp;
		}
		System.out.println(saida);
*/
	}
	
	
}
