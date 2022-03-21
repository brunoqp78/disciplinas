package logica.sequenciais;

import java.util.Scanner;

public class CalculoMedia {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int faltas;
		double nota1, nota2, media;
		System.out.println("Digite a primeira nota: ");
		nota1 = s.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = s.nextDouble();
		System.out.println("Digite as faltas: ");
		faltas = s.nextInt();
		media = (nota1+nota2)/2.0;
		if (media>=9 && faltas<=10) {
			System.out.println("Parabéns");
		}
	}
}
