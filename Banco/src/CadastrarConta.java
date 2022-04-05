import java.util.Arrays;

public class CadastrarConta {
	
	private Conta vetor[] = new Conta[3];
	
	int totalVetor = 0;
	
	public void add(Conta conta) {
		
		aumentaVetor();
		
		this.vetor[this.totalVetor] = conta;
		
		this.totalVetor++;
		
	}
	
	
	public void listar() {
		
		System.out.println(Arrays.toString(vetor));
		
	}
	
	public Conta procurar(String nome) {
		
		Conta conta=null;
		
		for(int cont=0;cont<this.totalVetor;cont++) {
			
			if(nome.equals(this.vetor[cont].getNome())) {
				conta = this.vetor[cont];
			}
			
		}
		
		return conta;
		
	}
	
	public void addPosicao(Conta c, int posicao) {
		
		aumentaVetor();
		
		for(int cont=this.totalVetor-1;cont>=posicao;cont--) {
			
			this.vetor[cont+1] = this.vetor[cont];
			
		}
		
		this.vetor[posicao]=c;
		
		this.totalVetor++;
		
	}
	
	
	
	public void aumentaVetor() {
		
		if(this.vetor.length == this.totalVetor) {
		
		Conta newVetor[] = new Conta[this.vetor.length+10];
		
		System.arraycopy(this.vetor, 0, newVetor, 0, this.vetor.length);
		
		this.vetor = newVetor;
		
		}
		
	}

}
