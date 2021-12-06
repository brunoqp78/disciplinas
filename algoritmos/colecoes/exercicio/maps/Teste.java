package algoritmos.colecoes.exercicio.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		HashMap<String, String> mapa = new HashMap<>();
		ArrayList<String> lista = new ArrayList<>();
		HashSet<String> conjunto = new HashSet<>();
		
		// um método para colocar um par de valores no mapa
		mapa.put("1", "João");
		mapa.put("2", "Pedro");
		
		HashMap<String, String> dddPorMunicipio = new HashMap<>();
		dddPorMunicipio.put("Uberlândia", "34");
		dddPorMunicipio.put("São Paulo", "11");
		dddPorMunicipio.put("São Paulo", "111");
		
		
		HashMap<Integer, Integer> teste = new HashMap<>();
		teste.put(1, 1024);
		teste.put(2, 2048);
		
		HashMap<String, String> unidadeMedida = new HashMap<>();
		unidadeMedida.put("pc", "Peça");
		unidadeMedida.put("un", "Unidade");
		unidadeMedida.put("mt", "Metro");
		//unidadeMedida.put("pc", "Personal Computer");
		
		for (Map.Entry<String, String> valores : unidadeMedida.entrySet()) {
			System.out.println(valores.getKey() + " - " + valores.getValue());
		}
		
		for (Map.Entry<String, String> valores : dddPorMunicipio.entrySet()) {
			System.out.println(valores.getKey() + " - " + valores.getValue());
		}
		
		Produto p = new Produto("Banana", "pc", 4);
		
		
		System.out.println("Uma " + unidadeMedida.get(p.getUnidade()) + " de " + p.getNome());
		
		
		
		
		//String entrada = s.nextLine();
		///System.out.println(unidadeMedida.getOrDefault(entrada, "Unidade incorreta!!"));
		
			
		dddPorMunicipio.replace("São Paulo", "11");
		for(String chave : dddPorMunicipio.keySet()) {
			System.out.println(chave);
		}
		System.out.println(dddPorMunicipio.get("São Paulo"));
		
		System.out.println(mapa.containsKey("1"));
		
		for(String valores : unidadeMedida.values()) {
			System.out.println(valores);
		}
		
		HashMap<String, String> estados = new HashMap<>();
		estados.put("MG", "Minas Gerais");
		
		System.out.println(estados.get(s.nextLine()));
		
		HashMap<Integer, Aluno> bd = new HashMap<>();
		Aluno aluno = new Aluno(1, "Bruno", 8);
		bd.put(aluno.getCodigo(), aluno);
		
	}

}

class Aluno{
	private Integer codigo;
	private String nome;
	private double nota;
	
	public Aluno(int codigo, String nome, double nota){
		this.nome = nome;
		this.nota = nota;
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
}

class Produto{
	private String nome;
	private String unidade;
	private double preco;
	public Produto(String nome, String unidade, double preco) {
		super();
		this.nome = nome;
		this.unidade = unidade;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
