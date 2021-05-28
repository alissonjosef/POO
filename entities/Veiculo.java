package entities;

public abstract class Veiculo {
	
	
	private String marca;
	private String modelo;
	private int anoFabricacao;
	
	
	public Veiculo(String marca, String modelo, int anoFabricacao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	
	
	

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + "]";
	}

	public abstract double ganhoLiquido(int quantidadeDias);


}
