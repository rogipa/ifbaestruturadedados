package br.edu.agenda.cadastro;

import java.util.Vector;

import br.edu.agenda.basica.Categoria;
import br.edu.agenda.colecao.InterfaceColecaoCategoria;

public class CadastroCategoria implements InterfaceCadastroCategoria {
	private InterfaceColecaoCategoria colecaoCategoria;

	public CadastroCategoria(InterfaceColecaoCategoria colecaoCategoria) {
		this.colecaoCategoria = colecaoCategoria;
	}

	/* (non-Javadoc)
	 * @see br.edu.fasete.agenda.cadastro.InterfaceCadastroCategoria#adicionarCategoria(br.edu.fasete.agenda.basica.Categoria)
	 */
	public void adicionarCategoria(Categoria c) {
		colecaoCategoria.adicionarCategoria(c);
	}

	/* (non-Javadoc)
	 * @see br.edu.fasete.agenda.cadastro.InterfaceCadastroCategoria#atualizarCategoria(br.edu.fasete.agenda.basica.Categoria)
	 */
	public void atualizarCategoria(Categoria c) {
		colecaoCategoria.atualizarCategoria(c);
	}

	/* (non-Javadoc)
	 * @see br.edu.fasete.agenda.cadastro.InterfaceCadastroCategoria#listarCategorias()
	 */
	public Vector<Categoria> listarCategorias() {
		return colecaoCategoria.listarCategorias();
	}

	/* (non-Javadoc)
	 * @see br.edu.fasete.agenda.cadastro.InterfaceCadastroCategoria#procurarCategoriaId(int)
	 */
	public Categoria procurarCategoriaId(int id) {
		return colecaoCategoria.procurarCategoriaId(id);
	}

	/* (non-Javadoc)
	 * @see br.edu.fasete.agenda.cadastro.InterfaceCadastroCategoria#removerCategoria(br.edu.fasete.agenda.basica.Categoria)
	 */
	public void removerCategoria(Categoria c) {
		colecaoCategoria.removerCategoria(c);
	}
	
	
	
	
	
}
