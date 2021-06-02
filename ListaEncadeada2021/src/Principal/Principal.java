package Principal;

import java.util.Scanner;

import Lista.Lista;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista a = new Lista();
		
		Scanner in = new Scanner(System.in);
		for(int cont = 0; cont <4; cont++) {
			a.adicionarNoComeco(in.next());
		}
		
	a.imprimir();

	}

}
