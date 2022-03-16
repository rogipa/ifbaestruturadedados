import java.util.Arrays;

public class Servico {
	
	private int vetor[] = new int[10];
	private int aux = 0;
	
	public void receberNumero(int aux) {
		
		this.vetor[this.aux]=aux;
		
		this.aux++;
		
		
		
		
	}
	
	public void par() {
		
		for(int cont=0; cont<this.vetor.length;cont++) {
			
			if(this.vetor[cont]%2==0) {
				System.out.println(this.vetor[cont]+" - É par");
			}
			
		}
		
	}
	
	public void imprimir() {
		
		for(int cont=0; cont<this.vetor.length;cont++) {
			System.out.println(this.vetor[cont]);
		}
		
		System.out.println(Arrays.toString(this.vetor));
		
	}

}
