package entities;

import model.enums.StatusVeiculo;

public abstract class VeiculoAlugado extends Veiculo{

	


	private String placa;
	private double kmExtra;
	private double valorDiaria;
	private double custoDiario;
	


	
	public VeiculoAlugado(String marca, String modelo, int anoFabricacao, String placa,
			double kmExtra, double valorDiaria, double custoDiario) {
		super(marca, modelo, anoFabricacao);
		this.placa = placa;
		this.kmExtra = kmExtra;
		this.valorDiaria = valorDiaria;
		this.custoDiario = custoDiario;
	}




	public String getPlaca() {
		return placa;
	}




	public void setPlaca(String placa) {
		this.placa = placa;
	}





	public double getKmExtra() {
		return kmExtra;
	}




	public void setKmExtra(double kmExtra) {
		this.kmExtra = kmExtra;
	}




	public double getValorDiaria() {
		return valorDiaria;
	}




	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}




	public double getCustoDiario() {
		return custoDiario;
	}




	public void setCustoDiario(double custoDiario) {
		this.custoDiario = custoDiario;
	}


	



	@Override
	public String toString() {
		return "VeiculoAlugado [placa=" + placa + ", kmExtra=" + kmExtra + ", valorDiaria=" + valorDiaria
				+ ", custoDiario=" + custoDiario + "]";
	}




	public abstract double ganhoLiquido(int quantidadeDias);
	public abstract double calcularAluguel(int quantidadeDias);
	public abstract double calcularKmExtra(int quantidadeDias);

	
}
	
