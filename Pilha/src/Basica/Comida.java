package Basica;

public class Comida {
	
	private String tipoComida;
	private Double preco;
	
	public Comida() {}

	public Comida(String tipoComida, Double preco) {
		super();
		this.tipoComida = tipoComida;
		this.preco = preco;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	

}
