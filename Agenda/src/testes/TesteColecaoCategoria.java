package testes;

import br.edu.agenda.basica.Categoria;
import br.edu.agenda.colecao.ColecaoCategoriaDB;

public class TesteColecaoCategoria {
	public static void main(String[] args) {
		ColecaoCategoriaDB col = new ColecaoCategoriaDB();
		
		//Teste do cadastrar
		//col.adicionarCategoria(new Categoria("teste"));
		
		//Teste do listar
		/*for(Categoria temp: col.listarCategorias()) {
			System.out.println(temp.getId() + " - " + temp.getNome());
		}*/
		
		//Teste do Localizar
		Categoria c = col.procurarCategoriaId(1);
		if(c != null) {
			//teste do alterar
			c.setNome(c.getNome() + " da on�a");
			col.atualizarCategoria(c);
			System.out.println(c.getNome());
			
			
			//teste do remover
			col.removerCategoria(c);
		} else {
			System.out.println("Categoria inexistente");
		}
		
		
		
	}
}
