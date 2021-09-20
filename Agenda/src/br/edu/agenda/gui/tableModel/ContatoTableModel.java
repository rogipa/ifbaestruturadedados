package br.edu.agenda.gui.tableModel;

import javax.swing.table.DefaultTableModel;

import br.edu.agenda.basica.Contato;

public class ContatoTableModel extends DefaultTableModel {
	private String []columnNames = {"Id", "Nome", "Email", "Fone", "Celular"};
	private Class<?> []columnClass = {Integer.class, String.class, String.class, String.class, String.class};
	
	public void addContato(Contato c) {
		Object linha[] = new Object[5];
		linha[0] = c.getId();
		linha[1] = c.getNome();
		linha[2] = c.getEmail();
		linha[3] = c.getFone();
		linha[4] = c.getCelular();
		addRow(linha);
	}
	
	public boolean isCellEditable(int a, int b){
		return false;
	} 
	
	public void removeAllElements() {
		while(getRowCount() > 0) {
			removeRow(getRowCount() -1);
		}
	}
	public String getColumnName(int i) {
		return columnNames[i];
	}
	
	public Class getColumnClass(int i) {
		return columnClass[i];
	}
	
	public int getColumnCount() {
		return columnNames.length;
	}
	

	
}
