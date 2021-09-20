package br.edu.agenda.colecao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import br.edu.agenda.basica.Categoria;
import br.edu.agenda.basica.Contato;

public class ColecaoContatoDB implements InterfaceColecaoContato  {

	/* (non-Javadoc)
	 * @see br.edu.agenda.colecao.InterfaceColecaoContato#adicionarContato(br.edu.agenda.basica.Contato)
	 */
	public void adicionarContato(Contato c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("insert into Contato (nome, email, fone, celular, id_categoria) values (?,?,?,?,?)");
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getEmail());
			stmt.setString(3, c.getFone());
			stmt.setString(4, c.getCelular());
			stmt.setInt(5, c.getCategoria().getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see br.edu.agenda.colecao.InterfaceColecaoContato#atualizarContato(br.edu.agenda.basica.Contato)
	 */
	public void atualizarContato(Contato c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("update Contato set nome=?, email=?, fone=?, celular=?, id_categoria=? where id=?");
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getEmail());
			stmt.setString(3, c.getFone());
			stmt.setString(4, c.getCelular());
			stmt.setInt(5, c.getCategoria().getId());
			stmt.setInt(6, c.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see br.edu.agenda.colecao.InterfaceColecaoContato#listarContatos()
	 */
	public Vector<Contato> listarContatos() {
		Vector<Contato> resposta = new Vector<Contato>();
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("select * from Contato");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Contato con = new Contato();
				con.setId(rs.getInt("id"));
				con.setNome(rs.getString("nome"));
				con.setEmail(rs.getString("email"));
				con.setFone(rs.getString("fone"));
				con.setCelular(rs.getString("celular"));
				
				ColecaoCategoriaDB colecaoCategoria = new ColecaoCategoriaDB();
				con.setCategoria(colecaoCategoria.procurarCategoriaId(rs.getInt("id_categoria")));
				resposta.add(con);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return resposta;
	}
	
	//Retorna todos os contatos associados a uma categoria passada como parâmetro
	public Vector<Contato> listarContatoPorCategoria(Categoria cat) {
		Vector<Contato> resposta = new Vector<Contato>();
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("select * from Contato where id_categoria=?");
			stmt.setInt(1, cat.getId());
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Contato con = new Contato();
				con.setId(rs.getInt("id"));
				con.setNome(rs.getString("nome"));
				con.setEmail(rs.getString("email"));
				con.setFone(rs.getString("fone"));
				con.setCelular(rs.getString("celular"));
				
				ColecaoCategoriaDB colecaoCategoria = new ColecaoCategoriaDB();
				con.setCategoria(colecaoCategoria.procurarCategoriaId(rs.getInt("id_categoria")));
				resposta.add(con);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return resposta;
		
	}

	/* (non-Javadoc)
	 * @see br.edu.agenda.colecao.InterfaceColecaoContato#procurarContatoId(int)
	 */
	public Contato procurarContatoId(int id) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("select * from Contato where id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				Contato con = new Contato();
				con.setId(rs.getInt("id"));
				con.setNome(rs.getString("nome"));
				con.setEmail(rs.getString("email"));
				con.setFone(rs.getString("fone"));
				con.setCelular(rs.getString("celular"));
				
				ColecaoCategoriaDB colecaoCategoria = new ColecaoCategoriaDB();
				con.setCategoria(colecaoCategoria.procurarCategoriaId(rs.getInt("id_categoria")));
				
				return con;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.agenda.colecao.InterfaceColecaoContato#removerContato(br.edu.agenda.basica.Contato)
	 */
	public void removerContato(Contato c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("delete from Contato where id=?");
			stmt.setInt(1, c.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
