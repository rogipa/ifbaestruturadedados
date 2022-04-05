
public class Conta {
	
	private String nome;
	private double valor;
	
	public Conta(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	public Conta() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}
	
	

}
