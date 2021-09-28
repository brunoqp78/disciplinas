package algoritmos.strings;

import java.util.Scanner;

public class OutrasFuncoes {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String t1 = s.nextLine();
		String t2 = "<html>";
		String t3 = "</html>";
		
		if (t1.startsWith(t2) && t1.endsWith(t3))
		{
			System.out.println("HTML");
		}else {
			System.out.println("não HTML");
		}
		
		System.out.println(t1.toUpperCase());
		System.out.println(t1);
		t2 = t1.toLowerCase();
		
		System.out.println(t2);
	}
}
