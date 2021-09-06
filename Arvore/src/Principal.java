
public class Principal {
	
	public static void main(String[]args) {

		Estrutura arvore = new Estrutura();
		No n;
		
		arvore.inserir(4);
		arvore.inserir(3);
		arvore.inserir(8);
		arvore.inserir(6);
		arvore.inserir(1);
		arvore.inserir(7);
		arvore.inserir(10);
		arvore.inserir(14);
		arvore.inserir(13);
		//arvore.inserir(0);
		arvore.inserir(2);
		arvore.inserir(11);
		
//		arvore.inserir(0);
//		arvore.inserir(1);
//		arvore.inserir(2);
//		arvore.inserir(3);
//		arvore.inserir(4);
//		arvore.inserir(5);
//		arvore.inserir(6);
//		arvore.inserir(7);
//		arvore.inserir(8);
		
		System.out.println("Mímino= "+ arvore.minimo().getValor());
		System.out.println("Altura= "+arvore.calcularAltura());
	//System.out.println(arvore.altura());
	n = arvore.removeValorMinimoDaArvore();
	//n = arvore.encontraMinimo();
	//System.out.println("--->>"+n.getValor());
		//arvore.posfixado();
	//System.out.println("REMOVEU--->>"+ n.getValor());
	arvore.posfixado();
	//arvore.imprimirArvore();
		
	}

}
