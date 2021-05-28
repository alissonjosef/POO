package entities;

import model.enums.StatusVeiculo;

public class Moto extends VeiculoAlugado {
	
	
	private double seguroAdicional;


	public Moto(String marca, String modelo, int anoFabricacao, String placa, double kmExtra,
			double valorDiaria, double custoDiario, double seguroAdicional) {
		super(marca, modelo, anoFabricacao, placa, kmExtra, valorDiaria, custoDiario);
		this.seguroAdicional = seguroAdicional;
	}

	public double getSeguroAdicional() {
		return seguroAdicional;
	}

	public void setSeguroAdicional(double seguroAdicional) {
		this.seguroAdicional = seguroAdicional;
	}

	@Override
	public String toString() {
		return "Moto [seguroAdicional=" + seguroAdicional + "]";
	}
	
	
	
	
	public double calcularAluguel(int quantidadeDias) {

		return ((quantidadeDias*seguroAdicional/100)*super.getCustoDiario())-super.getCustoDiario();
	
 }

	public double calcularKmExtra(int quantidadeDias) {
		
		
		return quantidadeDias + (super.getKmExtra()*3.75);
	}
	
	
	public  double ganhoLiquido(int quantidadeDias) {
		
		double valordiaria= calcularAluguel(quantidadeDias)+calcularKmExtra(quantidadeDias);
		
		
		return valordiaria;
		
		
	}
	
	
	
}


