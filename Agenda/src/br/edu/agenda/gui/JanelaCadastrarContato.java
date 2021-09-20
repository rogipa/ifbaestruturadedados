package br.edu.agenda.gui;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JButton;

import br.edu.agenda.basica.Categoria;
import br.edu.agenda.basica.Contato;
import br.edu.agenda.cadastro.ContatoJaCadastradoException;
import br.edu.agenda.fachada.CategoriaNaoSalvaException;
import br.edu.agenda.fachada.Fachada;

public class JanelaCadastrarContato extends JInternalFrame {

	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JComboBox campoCategoria = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JTextField campoNome = null;
	private JTextField campoEmail = null;
	private JTextField campoCelular = null;
	private JTextField campoFone = null;
	private JButton botaoCadastrar = null;

	/**
	 * This is the xxx default constructor
	 */
	public JanelaCadastrarContato() {
		super();
		initialize();
		carregarListaCategoria();
		
	}
	
	private void carregarListaCategoria() {
		Vector<Categoria> categoriasCadastradas = Fachada.getInstancia().listarCategorias();
		//campoCategoria.addItem("Selecione a Categoria:");
		for(Categoria temp: categoriasCadastradas) {
			campoCategoria.addItem(temp);
		}
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(273, 200);
		this.setTitle("Cadastrar Contato");
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
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(52, 109, 38, 16));
			jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel4.setText("Fone:");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(34, 86, 56, 16));
			jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel3.setText("Celular:");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(52, 40, 38, 16));
			jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel2.setText("Nome:");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(52, 63, 38, 16));
			jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel1.setText("Email:");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(28, 17, 62, 16));
			jLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel.setText("Categoria:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getCampoCategoria(), null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getCampoNome(), null);
			jContentPane.add(getCampoEmail(), null);
			jContentPane.add(getCampoCelular(), null);
			jContentPane.add(getCampoFone(), null);
			jContentPane.add(getBotaoCadastrar(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes campoCategoria	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCampoCategoria() {
		if (campoCategoria == null) {
			campoCategoria = new JComboBox();
			campoCategoria.setBounds(new Rectangle(107, 13, 125, 23));
		}
		return campoCategoria;
	}

	/**
	 * This method initializes campoNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getCampoNome() {
		if (campoNome == null) {
			campoNome = new JTextField();
			campoNome.setBounds(new Rectangle(107, 38, 125, 20));
		}
		return campoNome;
	}

	/**
	 * This method initializes campoEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getCampoEmail() {
		if (campoEmail == null) {
			campoEmail = new JTextField();
			campoEmail.setBounds(new Rectangle(107, 61, 125, 20));
		}
		return campoEmail;
	}

	/**
	 * This method initializes campoCelular	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getCampoCelular() {
		if (campoCelular == null) {
			campoCelular = new JTextField();
			campoCelular.setBounds(new Rectangle(107, 84, 125, 20));
		}
		return campoCelular;
	}

	/**
	 * This method initializes campoFone	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getCampoFone() {
		if (campoFone == null) {
			campoFone = new JTextField();
			campoFone.setBounds(new Rectangle(107, 107, 125, 20));
		}
		return campoFone;
	}

	/**
	 * This method initializes botaoCadastrar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoCadastrar() {
		if (botaoCadastrar == null) {
			botaoCadastrar = new JButton();
			botaoCadastrar.setBounds(new Rectangle(132, 135, 98, 22));
			botaoCadastrar.setText("Cadastrar");
			botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Categoria categoria = (Categoria) campoCategoria.getSelectedItem();
					String nome = campoNome.getText();
					String email = campoEmail.getText();
					String celular = campoCelular.getText();
					String fone = campoFone.getText();
					
					
					//Contato c = new Contato(categoria, celular, email, fone, nome);
					
					Contato c = new Contato();
					c.setCategoria(categoria);
					c.setNome(nome);
					c.setEmail(email);
					c.setFone(fone);
					c.setCelular(celular);
					
					try {
						Fachada.getInstancia().adicionarContato(c);
						JOptionPane.showMessageDialog(null, "Contato Cadastrado com sucesso!");
					} catch (ContatoJaCadastradoException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					} catch (CategoriaNaoSalvaException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
					
					
					
				}
			});
		}
		return botaoCadastrar;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
