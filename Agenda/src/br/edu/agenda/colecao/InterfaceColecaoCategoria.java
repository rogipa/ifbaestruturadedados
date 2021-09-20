package br.edu.agenda.colecao;

import java.util.Vector;

import br.edu.agenda.basica.Categoria;

public interface InterfaceColecaoCategoria {
	void adicionarCategoria(Categoria c);
	void removerCategoria(Categoria c);
	Vector<Categoria> listarCategorias();
	void atualizarCategoria(Categoria c);
	Categoria procurarCategoriaId(int id);
}
