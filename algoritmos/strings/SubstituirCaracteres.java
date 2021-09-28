package algoritmos.strings;

public class SubstituirCaracteres {

	public static void main(String[] args) {
		String palavras = "meus textos";
		palavras = palavras.replace('e', '&');	
		// A função replace gera uma nova String que precisará ser salva na variável correspondente.
			
		System.out.println(palavras);
		
		palavras = palavras.replace("m&us t&xtos", "seu");
		System.out.println(palavras);

	}

}
