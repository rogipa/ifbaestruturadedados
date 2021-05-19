package vetores;


public class Vetor<T> {
	
	
	private Object[] obj = new Object[3];
	private int totalobj = 0;
	
	public void adicionar(T c){
		aumentaEspaco();
		obj[this.totalobj] = c;
		this.totalobj++;
		
	}
	

	
	public int size() {
		return this.totalobj;
	}
	
	public T procurarPosicao(int posicao){
		if(!verificaPosicaOculpada(posicao)){
			throw new IllegalArgumentException("Posição inválida, verifique a posição!");
		}
		return (T) obj[posicao];
	}
	
	public String toString(){
		
		if(this.totalobj == 0){
			return "[]";
		}
		
		StringBuffer buffer = new StringBuffer();
			buffer.append("[");
		for(int i = 0; i < this.totalobj -1; i++){
			buffer.append(obj[i]);
			buffer.append(",");
		}
		
		buffer.append(obj[this.totalobj-1]);
		buffer.append("]");
		
		return buffer.toString();
		
	}
	
	public void adicionaPosicao(int posicao, T c){
		
		if(!verificaPosicao(posicao)){
			throw new IllegalArgumentException("Posic�o inv�lida, verifique a posi��o!");
		}
		
		aumentaEspaco();
		
		for(int i = this.totalobj-1;i>=posicao;i-=1){
			this.obj[i+1]= this.obj[i];
		}
		
		
		this.obj[posicao] = c;
		this.totalobj++;
		
	}
	
	public void remove(int posicao){
		if(!verificaPosicaOculpada(posicao)){
			throw new IllegalAccessError("Posicao a ser removida vazia");
		}
		
		aumentaEspaco();
		
		for(int i = posicao;i < this.totalobj;i++){
			this.obj[i] = this.obj[i+1];
		}
		
		this.obj[this.totalobj-1]=null;
		
		this.totalobj--;
	}
	
	public boolean verificaPosicao(int posicao){
		return posicao >= 0 && posicao <= this.totalobj;
	}
	
	public boolean verificaPosicaOculpada(int posicao){
		return posicao < this.totalobj && posicao >=0;
	}
	
	//Método privado, pois só será útil para os métodos de adicionar
	private void aumentaEspaco(){
		if(this.totalobj == this.obj.length){
			
			Object[] newobj = new Object[this.obj.length*2];

			System.arraycopy(this.obj, 0, newobj, 0, this.obj.length);

			this.obj = newobj;
			
		}
	}
	
	

}
