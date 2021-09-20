package br.edu.agenda.colecao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import br.edu.agenda.basica.Categoria;
import br.edu.agenda.basica.Contato;

public interface InterfaceColecaoContato {

	public abstract void adicionarContato(Contato c);

	public abstract void atualizarContato(Contato c);

	public abstract Vector<Contato> listarContatos();

	public abstract Contato procurarContatoId(int id);

	public abstract void removerContato(Contato c);

	public Vector<Contato> listarContatoPorCategoria(Categoria cat);

}