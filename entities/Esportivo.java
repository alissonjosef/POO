package entities;

import model.enums.StatusVeiculo;

public class Esportivo extends VeiculoAlugado {

	
	
	
	private int capacidadePassageiro;
	
	
	


	public Esportivo(String marca, String modelo, int anoFabricacao, String placa, double kmExtra,
			double valorDiaria, double custoDiario, int capacidadePassageiro) {
		super(marca, modelo, anoFabricacao, placa, kmExtra, valorDiaria, custoDiario);
		this.capacidadePassageiro = capacidadePassageiro;
	}




	public int getCapacidadePassageiro() {
		return capacidadePassageiro;
	}




	public void setCapacidadePassageiro(int capacidadePassageiro) {
		this.capacidadePassageiro = capacidadePassageiro;
	}



	

	@Override
	public String toString() {
		return "Esportivo [capacidadePassageiro=" + capacidadePassageiro + "]";
	}



	
	public double calcularAluguel(int quantidadeDias) {

		return (quantidadeDias*super.getValorDiaria())-super.getCustoDiario();
	
}
	
	
	public double calcularKmExtra(int quantidadeDias) {
		
		
		return quantidadeDias + (super.getKmExtra()*2.50);
	}
	

	public  double ganhoLiquido(int quantidadeDias) {
		
		double valordiaria= calcularAluguel(quantidadeDias)+calcularKmExtra(quantidadeDias);
		
		
		return valordiaria;
		
		
	}
	
	
}


