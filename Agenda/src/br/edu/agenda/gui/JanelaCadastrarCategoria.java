package br.edu.agenda.gui;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JButton;

import br.edu.agenda.basica.Categoria;
import br.edu.agenda.fachada.Fachada;

import java.awt.Dimension;

public class JanelaCadastrarCategoria extends JInternalFrame {

	private JPanel jContentPane = null;
	private JLabel jLabelNome = null;
	private JTextField campoNome = null;
	private JButton botaoCadastrar = null;
	private JButton botaoCancelar = null;

	/**
	 * This is the xxx default constructor
	 */
	public JanelaCadastrarCategoria() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 141);
		this.setIconifiable(true);
		this.setClosable(true);
		this.setTitle("Cadastrar Categoria");
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelNome = new JLabel();
			jLabelNome.setBounds(new Rectangle(31, 18, 44, 16));
			jLabelNome.setText("Nome:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelNome, null);
			jContentPane.add(getCampoNome(), null);
			jContentPane.add(getBotaoCadastrar(), null);
			jContentPane.add(getBotaoCancelar(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes campoNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getCampoNome() {
		if (campoNome == null) {
			campoNome = new JTextField();
			campoNome.setBounds(new Rectangle(103, 18, 155, 20));
		}
		return campoNome;
	}

	/**
	 * This method initializes botaoCadastrar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoCadastrar() {
		if (botaoCadastrar == null) {
			botaoCadastrar = new JButton();
			botaoCadastrar.setBounds(new Rectangle(156, 55, 98, 22));
			botaoCadastrar.setText("Cadastrar");
			botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//Receber os dados do formul�rio
					String nome = campoNome.getText();
					
					if(nome.length() <= 0) {
						JOptionPane.showMessageDialog(null, "Nome inv�lido");
						//Interrompe o cadastro se o nome n�o for v�lido
						return;
					}
					
					//Constuir o objeto com os dados digitados
					Categoria c = new Categoria(nome);

					//Chamar a fachada para cadastrar o objeto
					Fachada.getInstancia().adicionarCategoria(c);
					
					//Manda uma mensagem para o usu�rio
					JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso!!!");
					
					
					//Limpa os campos do formul�rio
					campoNome.setText("");
				}
			});
		}
		return botaoCadastrar;
	}

	/**
	 * This method initializes botaoCancelar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoCancelar() {
		if (botaoCancelar == null) {
			botaoCancelar = new JButton();
			botaoCancelar.setBounds(new Rectangle(27, 55, 98, 22));
			botaoCancelar.setText("Cancelar");
		}
		return botaoCancelar;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
