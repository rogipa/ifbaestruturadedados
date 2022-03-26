import java.util.Arrays;

public class Servico {
	
	int vetor[] = new int[1];
	int aux=0;
	
	public String verifica(int numero, int aleatoria) {
	
		if(this.vetor.length==this.aux) {
			aumentaVetor();
		}
		
		if(numero<aleatoria) {
			
			this.vetor[this.aux] = numero;
			this.aux++;
			return "O número aleatorio é maior";
			
		}else if(numero>aleatoria) {
			
			this.vetor[this.aux] = numero;
			this.aux++;
			return "O número aleatorio é menor";
			
		}else {
			
			this.vetor[this.aux] = numero;
			this.aux++;
			return "Parabéns!! Você acertou!!";
			
		}
		
		
	}
	
	public void imprimir() {
		
		System.out.println("Suas tentativas foram:");
		
		System.out.println(Arrays.toString(this.vetor));
		
	}
	
	public void aumentaVetor() {
		
		int newVetor[] = new int[this.vetor.length+1];
		
		System.arraycopy(this.vetor, 0, newVetor, 0, this.vetor.length);
		
		this.vetor = newVetor;
		
	}
	

}
