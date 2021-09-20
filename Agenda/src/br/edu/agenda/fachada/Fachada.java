package br.edu.agenda.fachada;

import java.util.Vector;

import br.edu.agenda.basica.Categoria;
import br.edu.agenda.basica.Contato;
import br.edu.agenda.cadastro.CadastroCategoria;
import br.edu.agenda.cadastro.CadastroContato;
import br.edu.agenda.cadastro.ContatoJaCadastradoException;
import br.edu.agenda.cadastro.InterfaceCadastroCategoria;
import br.edu.agenda.cadastro.InterfaceCadastroContato;
import br.edu.agenda.colecao.ColecaoCategoriaDB;
import br.edu.agenda.colecao.ColecaoContatoDB;

public class Fachada {
	private InterfaceCadastroCategoria cadastroCategoria;
	private InterfaceCadastroContato cadastroContato;
	
	//Padrão de projeto Singleton - Todas as telas do sistema acessarão 
	//o mesmo objeto da fachada. 
	//O construtor deve ser private
	private Fachada() {
		//Inicializar todos os cadastros e coleções
		cadastroCategoria = new CadastroCategoria(new ColecaoCategoriaDB());
		cadastroContato = new CadastroContato(new ColecaoContatoDB());
	}
	
	//Define-se um atributo estático do mesmo tipo da classe chamado instancia
	private static Fachada instancia;
	
	//O método get da instancia também será estático.
	
	public static Fachada getInstancia() {
		//Verifica se a instancia já foi inicializada
		if(instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}
	
	
	public void adicionarCategoria(Categoria c) {
		cadastroCategoria.adicionarCategoria(c);
	}
	public void atualizarCategoria(Categoria c) {
		cadastroCategoria.atualizarCategoria(c);
	}
	public Vector<Categoria> listarCategorias() {
		return cadastroCategoria.listarCategorias();
	}
	public Categoria procurarCategoriaId(int id) {
		return cadastroCategoria.procurarCategoriaId(id);
	}
	
	//O método só deve permitir que sejam removidas categorias vazias
	public void removerCategoria(Categoria c) throws CategoriaContemContatoException {
		//Verifica se a listagem dos contatos da categoria c retorna algum contato
		if(cadastroContato.listarContatoPorCategoria(c).size() != 0) {
			CategoriaContemContatoException ex = new CategoriaContemContatoException(c.getNome());
			throw (ex);
		}
		cadastroCategoria.removerCategoria(c);
	}
	
	public void adicionarContato(Contato c) throws ContatoJaCadastradoException, CategoriaNaoSalvaException {
		if(procurarCategoriaId(c.getCategoria().getId()) == null) {
			CategoriaNaoSalvaException ex = new CategoriaNaoSalvaException(c.getNome());
			throw (ex);
		}
		cadastroContato.adicionarContato(c);
	}
	
	public void atualizarContato(Contato c) {
		cadastroContato.atualizarContato(c);
	}
	public Vector<Contato> listarContatoPorCategoria(Categoria cat) {
		return cadastroContato.listarContatoPorCategoria(cat);
	}
	public Vector<Contato> listarContatos() {
		return cadastroContato.listarContatos();
	}
	public Contato procurarContatoId(int id) {
		return cadastroContato.procurarContatoId(id);
	}
	public void removerContato(Contato c) {
		cadastroContato.removerContato(c);
	}
	
	
	
}
