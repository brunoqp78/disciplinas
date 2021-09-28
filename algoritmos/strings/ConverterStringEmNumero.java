package algoritmos.strings;

import java.util.Scanner;

public class ConverterStringEmNumero {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String entrada = s.nextLine();
		int numero=0, resultado;
		//o usuário entra com uma data(dd/mm/aaaa) em String e o programa precisa indicar quantos dias falta para o dia 30.
		// 1. Pegar a substring com os dois primeiros caracteres
		entrada = entrada.substring(0, 2);
		System.out.println(entrada);
		// 2. Converter essa substring em um número inteiro.
		numero = Integer.parseInt(entrada);	
		// 3. calcular quantos dias faltam para o 30° dia do mês
		resultado = 30-numero;
		System.out.println(resultado);
		
		System.out.println((double) 10);
		System.out.println((int) 10.10);
		
		s.close();

	}

}
