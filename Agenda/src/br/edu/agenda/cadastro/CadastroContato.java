package br.edu.agenda.cadastro;

import java.util.Vector;

import br.edu.agenda.basica.Categoria;
import br.edu.agenda.basica.Contato;
import br.edu.agenda.colecao.InterfaceColecaoContato;

public class CadastroContato implements InterfaceCadastroContato {
	private InterfaceColecaoContato colecaoContato;

	public CadastroContato(InterfaceColecaoContato colecaoContato) {
		this.colecaoContato = colecaoContato;
	}

	/* (non-Javadoc)
	 * @see br.edu.agenda.cadastro.InterfaceCadastroContato#adicionarContato(br.edu.agenda.basica.Contato)
	 */
	public void adicionarContato(Contato c) throws ContatoJaCadastradoException {
		//Lista todos os contatos cadastrados na categoria do contato c.
		Vector<Contato> contatosCadastradosCategoria = listarContatoPorCategoria(c.getCategoria());
		//Procura por um contato cadastrado que possui o mesmo nome de c, presente na mesma categoria
		for(Contato temp: contatosCadastradosCategoria) {
			if(temp.getNome().equalsIgnoreCase(c.getNome())) {
				//Caso seja encontrado, uma exceção é levantada.
				ContatoJaCadastradoException ex = new ContatoJaCadastradoException(c.getCategoria().getNome(), c.getNome());
				throw (ex);
			}
		}
		colecaoContato.adicionarContato(c);
	}

	/* (non-Javadoc)
	 * @see br.edu.agenda.cadastro.InterfaceCadastroContato#atualizarContato(br.edu.agenda.basica.Contato)
	 */
	public void atualizarContato(Contato c) {
		colecaoContato.atualizarContato(c);
	}

	/* (non-Javadoc)
	 * @see br.edu.agenda.cadastro.InterfaceCadastroContato#listarContatos()
	 */
	public Vector<Contato> listarContatos() {
		return colecaoContato.listarContatos();
	}

	/* (non-Javadoc)
	 * @see br.edu.agenda.cadastro.InterfaceCadastroContato#procurarContatoId(int)
	 */
	public Contato procurarContatoId(int id) {
		return colecaoContato.procurarContatoId(id);
	}

	/* (non-Javadoc)
	 * @see br.edu.agenda.cadastro.InterfaceCadastroContato#removerContato(br.edu.agenda.basica.Contato)
	 */
	public void removerContato(Contato c) {
		colecaoContato.removerContato(c);
	}

	/* (non-Javadoc)
	 * @see br.edu.agenda.cadastro.InterfaceCadastroContato#listarContatoPorCategoria(br.edu.agenda.basica.Categoria)
	 */
	public Vector<Contato> listarContatoPorCategoria(Categoria cat) {
		return colecaoContato.listarContatoPorCategoria(cat);
	}
	
	
	
}
