package br.edu.agenda.fachada;

public class CategoriaContemContatoException extends Exception{
	private String nome;

	public CategoriaContemContatoException(String nome) {
		super("A categoria não pode ser removida pois existem contatos associados à mesma");
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
