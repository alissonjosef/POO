package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Esportivo;
import entities.Veiculo;
import entities.VeiculoAlugado;
import model.enums.StatusVeiculo;

public class Locadora {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		VeiculoAlugado[] estoque = new VeiculoAlugado [1];
		
		
	 
		
		
		for(int i =0 ; i <estoque.length;i++) {
			
			System.out.printf("Digite a marca do %dº veiculo:",(i+1));
			sc.next();
			String marca= sc.nextLine();
			System.out.printf("Digite ao modelo do %dº veiculo:",(i+1));
			String modelo= sc.nextLine();
			System.out.printf("Digite ao ano de fabricação do %dº veiculo:",(i+1));
			int anoFabricação = sc.nextInt();
			System.out.printf("Digite a placa do %dº veiculo:",(i+1));
			String placa=sc.next();
			System.out.printf("Digite os km extras do %dº veiculo:",(i+1));
			double kmExtra = sc.nextDouble();
			System.out.printf("Digite o valor da diaria do %dº veiculo:",(i+1));
			double valorDiaria=sc.nextDouble();
			System.out.printf("Digite o custo diario do %dº veiculo:",(i+1));
			double custoDiario=sc.nextDouble();
			System.out.printf("Digite o custo diario do %dº veiculo:",(i+1));
			int capacidadePassageiro= sc.nextInt();
			
			estoque[i]= new Esportivo("ford", "fiesta", 2020, "KHB2076", 28, 340, 35, 5);
		}
		
		
		
		
		
		for(VeiculoAlugado v : estoque) {
			
			System.out.println("Veiculo v = "+v.getAnoFabricacao()+v.getModelo()+"Aluguel = R$"+v.ganhoLiquido(1)+v.calcularAluguel(1));
			
		}
		
		
		
		
		

	}

}
