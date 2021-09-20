package br.edu.agenda.fachada;

public class CategoriaNaoSalvaException extends Exception{
	private String nome;

	public CategoriaNaoSalvaException(String nome) {
		super("O contato não pode estar associado a uma categoria que ainda não foi salva");
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
