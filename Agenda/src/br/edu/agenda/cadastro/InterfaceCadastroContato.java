package br.edu.agenda.cadastro;

import java.util.Vector;

import br.edu.agenda.basica.Categoria;
import br.edu.agenda.basica.Contato;

public interface InterfaceCadastroContato {

	public abstract void adicionarContato(Contato c)
			throws ContatoJaCadastradoException;

	public abstract void atualizarContato(Contato c);

	public abstract Vector<Contato> listarContatos();

	public abstract Contato procurarContatoId(int id);

	public abstract void removerContato(Contato c);

	public abstract Vector<Contato> listarContatoPorCategoria(Categoria cat);

}