package br.ufjf.poo.model;

public class Automovel extends Veiculo {
	
	private double calcularConsumo(double precoLitro) {
		double consumo = 0;
		consumo = (getCapacidadeTanque()/getKmPorLitro()*precoLitro);
		return consumo;
	}
}
