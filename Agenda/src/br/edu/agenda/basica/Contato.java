package br.edu.agenda.basica;

public class Contato {
	private int id;
	private String nome;
	private String email;
	private String fone;
	private String celular;
	//Atributo de associa��o
	private Categoria categoria;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Contato(Categoria categoria, String celular, String email,
			String fone, String nome) {
		this.categoria = categoria;
		this.celular = celular;
		this.email = email;
		this.fone = fone;
		this.nome = nome;
	}
	public Contato() {
	}
	
}
