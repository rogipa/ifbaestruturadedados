package br.edu.agenda.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import br.edu.agenda.basica.Categoria;
import br.edu.agenda.fachada.Fachada;

import java.awt.Dimension;
import java.util.Vector;

public class JanelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JDesktopPane desktop = null;
	private JMenuBar barraDeMenu = null;
	private JMenu jMenuCadastrar = null;
	private JMenu jMenuListar = null;
	private JMenuItem menuCadastrarCategoria = null;
	private JMenuItem menuCadastrarContato = null;
	private JMenuItem menuListarCategoria = null;
	private JMenuItem menuListarContato = null;

	/**
	 * This is the default constructor
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JanelaPrincipal() {
		super();
		initialize();
	}


	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(592, 302);
		this.setJMenuBar(getBarraDeMenu());
		this.setContentPane(getJContentPane());
		this.setTitle("Agenda Telefônica");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getDesktop(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes desktop	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getDesktop() {
		if (desktop == null) {
			desktop = new JDesktopPane();
		}
		return desktop;
	}

	/**
	 * This method initializes barraDeMenu	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getBarraDeMenu() {
		if (barraDeMenu == null) {
			barraDeMenu = new JMenuBar();
			barraDeMenu.add(getJMenuCadastrar());
			barraDeMenu.add(getJMenuListar());
		}
		return barraDeMenu;
	}

	/**
	 * This method initializes jMenuCadastrar	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuCadastrar() {
		if (jMenuCadastrar == null) {
			jMenuCadastrar = new JMenu();
			jMenuCadastrar.setText("Cadastrar");
			jMenuCadastrar.add(getMenuCadastrarCategoria());
			jMenuCadastrar.add(getMenuCadastrarContato());
		}
		return jMenuCadastrar;
	}

	/**
	 * This method initializes jMenuListar	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuListar() {
		if (jMenuListar == null) {
			jMenuListar = new JMenu();
			jMenuListar.setText("Listar");
			jMenuListar.add(getMenuListarCategoria());
			jMenuListar.add(getMenuListarContato());
		}
		return jMenuListar;
	}

	/**
	 * This method initializes menuCadastrarCategoria	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMenuCadastrarCategoria() {
		if (menuCadastrarCategoria == null) {
			menuCadastrarCategoria = new JMenuItem();
			menuCadastrarCategoria.setText("Categoria");
			menuCadastrarCategoria.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JanelaCadastrarCategoria jcc = new JanelaCadastrarCategoria();
					jcc.setVisible(true);
					desktop.add(jcc);
				}
			});
		}
		return menuCadastrarCategoria;
	}

	/**
	 * This method initializes menuCadastrarContato	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMenuCadastrarContato() {
		if (menuCadastrarContato == null) {
			menuCadastrarContato = new JMenuItem();
			menuCadastrarContato.setText("Contato");
			menuCadastrarContato.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JanelaCadastrarContato jcc = new JanelaCadastrarContato();
					jcc.setVisible(true);
					desktop.add(jcc);
				}
			});
		}
		return menuCadastrarContato;
	}

	/**
	 * This method initializes menuListarCategoria	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMenuListarCategoria() {
		if (menuListarCategoria == null) {
			menuListarCategoria = new JMenuItem();
			menuListarCategoria.setText("Categoria");
			menuListarCategoria.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JanelaListarCategoria jlc = new JanelaListarCategoria();
					jlc.setVisible(true);
					desktop.add(jlc);
				}
			});
		}
		return menuListarCategoria;
	}

	/**
	 * This method initializes menuListarContato	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMenuListarContato() {
		if (menuListarContato == null) {
			menuListarContato = new JMenuItem();
			menuListarContato.setText("Contato");
			menuListarContato.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JanelaListarContato jcont = new JanelaListarContato();
					jcont.setVisible(true);
					desktop.add(jcont);
				}
			});
		}
		return menuListarContato;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
