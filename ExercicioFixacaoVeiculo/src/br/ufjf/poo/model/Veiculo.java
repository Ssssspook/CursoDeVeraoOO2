package br.ufjf.poo.model;

public abstract class Veiculo {
	private String marca;
	private double capacidadeTanque;
	private double kmPorLitro;
	

	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}



	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}



	public double getKmPorLitro() {
		return kmPorLitro;
	}



	public void setKmPorLitro(double kmRodados) {
		this.kmPorLitro = kmRodados;
	}
	
	private double calcularConsumo(double precoLitro) {
		return 0;
	}
}
