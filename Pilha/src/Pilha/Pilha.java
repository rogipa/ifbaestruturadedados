package Pilha;

import java.util.LinkedList;

import Basica.Comida;

public class Pilha {
	
	LinkedList<Comida> lista = new LinkedList<>();
	
	public void adicionar(Comida c) {
		
		lista.add(c);
		
	}
	
	public Comida getComida() {
		
		return lista.removeLast();
		
	}
	
	public boolean verificaPilha() {
		
		return lista.isEmpty();
		
		
	}
	
	

}
