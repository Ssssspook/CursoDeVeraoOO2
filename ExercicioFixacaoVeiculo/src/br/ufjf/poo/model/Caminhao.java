package br.ufjf.poo.model;

public class Caminhao extends Automovel {
		private double tara;

		public double getTara() {
			return tara;
		}

		public void setTara(double tara) {
			this.tara = tara;
		}
		
		private double calcularConsumo(double precoLitro) {
			double consumo = 0;
			consumo = (getCapacidadeTanque()/getKmPorLitro()*precoLitro)/tara;
			return consumo;
		}
}


