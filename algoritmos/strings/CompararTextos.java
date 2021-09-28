package algoritmos.strings;

import java.util.Scanner;

public class CompararTextos {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String t1 = s.nextLine();
		String t2 = s.nextLine();
		
		//"iftm" > "banana"
		if (t1.compareTo(t2)<0) {
			System.out.println(t1 + " " + t2);
		}else if (t1.compareTo(t2)>0) {
			System.out.println(t2 + " " + t1);
		}else {
			System.out.println("iguais");
		}
		
		
		
		
		

	}

}
