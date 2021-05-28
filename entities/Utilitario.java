package entities;

import model.enums.StatusVeiculo;

public class Utilitario extends VeiculoAlugado {

	
	private double capacidadeCarga;
	
	


	public Utilitario(String marca, String modelo, int anoFabricacao, String placa,
			double kmExtra, double valorDiaria, double custoDiario, double capacidadeCarga) {
		super(marca, modelo, anoFabricacao, placa, kmExtra, valorDiaria, custoDiario);
		this.capacidadeCarga = capacidadeCarga;
	}





	@Override
	public String toString() {
		return "Utilitario [capacidadeCarga=" + capacidadeCarga + "]";
	}




	
	public double calcularAluguel(int quantidadeDias) {

		return (quantidadeDias*super.getCustoDiario())-super.getCustoDiario();
	
 }

	public double calcularKmExtra(int quantidadeDias) {
		
		
		return quantidadeDias + (super.getKmExtra()*3.75);
	}
	
	
    public  double ganhoLiquido(int quantidadeDias) {
		
		double valordiaria= calcularAluguel(quantidadeDias)+calcularKmExtra(quantidadeDias);
		
		
		return valordiaria;
		
		
	}
}
