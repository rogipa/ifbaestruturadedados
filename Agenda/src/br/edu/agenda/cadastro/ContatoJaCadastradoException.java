package br.edu.agenda.cadastro;

public class ContatoJaCadastradoException extends Exception{
	private String nomeContato;
	private String nomeCategoria;
	
	public ContatoJaCadastradoException(String nomeCategoria, String nomeContato) {
		super("A categoria '" + nomeCategoria + "' já possui um contato com o nome: " + nomeContato);
		this.nomeCategoria = nomeCategoria;
		this.nomeContato = nomeContato;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}
	
}
