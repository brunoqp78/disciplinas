package algoritmos.strings;
/**
 * String são imutáveis : depois de serem criados eles não podem ser alterados. 
Quando concatenamos(juntamos) duas Strings,estamos criando um novo objeto em um outro local da memória.
 * @author turin-turambar
 *
 */
public class Imutabilidade {

	public static void main(String[] args) {
		String s1 = "Bruno";
		String s2 = "João";
		String s4 = "Bruno";
		String s3 = s2 + s1;
		s1 = s1 + s2;
		s4 = s2 + s2;		

	}

}
