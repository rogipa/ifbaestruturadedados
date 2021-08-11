import java.util.LinkedList;

public class Estrutura {
	
	LinkedList fila = new LinkedList();
	
	
	public void inserir(Object a) {
		
		fila.addLast(a);
		
	}
	
	public Object remover() {
		Object a = fila.removeFirst();
		return a;
	}
	
	public boolean verifica() {
		return fila.isEmpty();
	}
	
	public void mostrar () {
		System.out.println(fila.toString());
	}

}
