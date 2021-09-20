package br.edu.agenda.colecao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import br.edu.agenda.basica.Categoria;

public class ColecaoCategoriaDB implements InterfaceColecaoCategoria {

	public void adicionarCategoria(Categoria c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("insert into categoria (nome) values (?)");
			stmt.setString(1, c.getNome());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualizarCategoria(Categoria c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("update categoria set nome=? where id=?");
			stmt.setString(1, c.getNome());
			stmt.setInt(2, c.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Vector<Categoria> listarCategorias() {
		Vector<Categoria> resposta = new Vector<Categoria>();
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("select * from categoria");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Categoria cat = new Categoria();
				cat.setId(rs.getInt("id"));
				cat.setNome(rs.getString("nome"));
				resposta.add(cat);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return resposta;
	}

	public Categoria procurarCategoriaId(int id) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("select * from categoria where id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				Categoria cat = new Categoria();
				cat.setId(rs.getInt("id"));
				cat.setNome(rs.getString("nome"));
				return cat;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return null;
	}

	public void removerCategoria(Categoria c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("delete from categoria where id=?");
			stmt.setInt(1, c.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
