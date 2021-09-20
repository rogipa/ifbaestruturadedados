package br.edu.agenda.gui;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import java.util.List;
import java.util.Vector;

import javax.swing.JTable;

import br.edu.agenda.basica.Categoria;
import br.edu.agenda.basica.Contato;
import br.edu.agenda.cadastro.ContatoJaCadastradoException;
import br.edu.agenda.fachada.CategoriaContemContatoException;
import br.edu.agenda.fachada.Fachada;
import br.edu.agenda.gui.tableModel.CategoriaTableModel;
import br.edu.agenda.gui.tableModel.ContatoTableModel;

import java.awt.Dimension;
import javax.swing.JButton;

public class JanelaListarContato extends JInternalFrame {

	private JPanel jContentPane = null;
	private JScrollPane jScrollPane = null;
	private JTable tabelaContato = null;
	
	private ContatoTableModel modeloTabela = null;
	private JButton botaoRemover = null;

	/**
	 * This is the xxx default constructor
	 */
	public JanelaListarContato() {
		super();
		initialize();
		preencherTabelaContato();
	}
	private void preencherTabelaContato() {
		List<Contato> contatosCadastrados = Fachada.getInstancia().listarContatos();
		for(Contato temp: contatosCadastrados) {
			modeloTabela.addContato(temp);
		}
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(441, 308);
		this.setTitle("Lista de Contatos");
		this.setContentPane(getJContentPane());
		this.setClosable(true);

	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getBotaoRemover(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(30, 15, 357, 138));
			jScrollPane.setViewportView(getTabelaContatos());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes tabelaCategorias	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTabelaContatos() {
		if (tabelaContato == null) {
			modeloTabela = new ContatoTableModel();
			tabelaContato = new JTable(modeloTabela);
		}
		return tabelaContato;
	}
	
	private void removeTabela() {
		modeloTabela.removeAllElements();
	}
	/**
	 * This method initializes botaoRemover	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoRemover() {
		if (botaoRemover == null) {
			botaoRemover = new JButton();
			botaoRemover.setBounds(new Rectangle(102, 177, 164, 20));
			botaoRemover.setText("Remover Contatos");
			botaoRemover.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(tabelaContato.getSelectedRowCount() != 1) {
						JOptionPane.showMessageDialog(null, "Selecione exatamente um contato para remover");
						return;
					}
					int linhaSelecionada = tabelaContato.getSelectedRow();
					int id = (Integer) tabelaContato.getValueAt(linhaSelecionada, 0);
					Contato contato = Fachada.getInstancia().procurarContatoId(id);
					Fachada.getInstancia().removerContato(contato);
					removeTabela();
	                 preencherTabelaContato();
				}
			});
		}
		return botaoRemover;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
