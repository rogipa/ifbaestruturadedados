package Lista;

import Basica.Celula;

public class Lista {
	
	private Celula primeiro;
	private Celula ultimo;
	
	private int totalDeElementos;
	
	public void adicionarNoComeco(Object objeto) {
		
		Celula elemento = new Celula(this.primeiro,objeto);
		this.primeiro = elemento;
		
		if(this.totalDeElementos == 0) {
			this.ultimo = elemento;
		}
		
		this.totalDeElementos ++;
		
	}
	
	public void imprimir() {
		
		Celula a = this.primeiro;
		
		for(int cont = 0; cont<this.totalDeElementos; cont++) {
			
			System.out.println(a.getObjeto());
			
			a = a.getProxima();
			
			
		}
		
	}

}
