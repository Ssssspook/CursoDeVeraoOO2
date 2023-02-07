package br.ufjf.dcc.poo.model;

public class Automovel extends Veiculo {
	
	@Override
	public double calcularConsumo(double precoLitro) {
		double consumo = 0;
		consumo = (getCapacidadeTanque()/getKmPorLitro()*precoLitro);
		return consumo;
	}
}
