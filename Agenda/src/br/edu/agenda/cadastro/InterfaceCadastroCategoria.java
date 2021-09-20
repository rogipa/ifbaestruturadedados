package br.edu.agenda.cadastro;

import java.util.Vector;

import br.edu.agenda.basica.Categoria;

public interface InterfaceCadastroCategoria {

	public abstract void adicionarCategoria(Categoria c);

	public abstract void atualizarCategoria(Categoria c);

	public abstract Vector<Categoria> listarCategorias();

	public abstract Categoria procurarCategoriaId(int id);

	public abstract void removerCategoria(Categoria c);

}