package algoritmos.colecoes.provaAnterior;

import java.util.ArrayList;

public class Venda {
	private int numero;
	private String data;
	private String nomeCliente;
	//coleção para representar os ItensVenda
	private ArrayList<ItemVenda> itens = new ArrayList<>();
	
	public void inserirItemVenda(Produto prod, int quantidade) {
		ItemVenda item = new ItemVenda();
		itens.add(item);
	}
}
