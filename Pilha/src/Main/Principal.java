package Main;

import Basica.Comida;
import Pilha.Pilha;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pilha pilha = new Pilha();
		
		Comida comida1 = new Comida("lasanha",12.00);
		Comida comida2 = new Comida("Cuscuz",7.50);
		Comida comida3 = new Comida("Buchada",15.50);
		
		pilha.adicionar(comida1);
		pilha.adicionar(comida2);
		pilha.adicionar(comida3);
		
		Comida c;
		
		while(!pilha.verificaPilha()) {
			
			c = pilha.getComida();
				System.out.println("Nome: "+ c.getTipoComida() + " --- Preço: " + c.getPreco());
			
		
			
		}
		

	}

}
