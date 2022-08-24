package br.edu.ifba.pilha;

import java.util.Stack;

public class Pilha {
	
	Stack<Character> p = new Stack<Character>();
	StringBuilder verifica = new StringBuilder();

	public void inverte(String palavra) {
		for(int cont=0; cont<palavra.length(); cont++) {
			p.push(palavra.charAt(cont));
		}
		
		while(!p.isEmpty()) {
			verifica.append(p.pop());
		}

		this.verifica(palavra);
		
	}
	
	public void verifica(String palavra) {
		if(palavra.equals(verifica.toString())) {
			System.out.println("É palindromo");
		}else {
			System.out.println("Não é!");
		}
	}
	

}
