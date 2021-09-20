package br.edu.agenda.basica;

public class Categoria {
	private int id;
	private String nome;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//Construtor vazio
	public Categoria() {
	}
	
	//Construtor completo
	public Categoria(String nome) {
		this.nome = nome;
	}
	
	//"Converte" o objeto para String
	public String toString() {
		return id + ": " + nome;
	}
	
	
	
}
