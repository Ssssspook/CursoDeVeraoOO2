package br.ufjf.dcc.poo.model;

import java.util.ArrayList;
import java.util.Date;

public class Estadia {
	private Date dataHoraEnt;
	private Date dataHoraSai;
	private double valor;
	private ArrayList<Veiculo> veiculos;
	
	public Date getDataHoraEnt() {
		return dataHoraEnt;
	}
	public void setDataHoraEnt(Date dataHoraEnt) {
		this.dataHoraEnt = dataHoraEnt;
	}
	public Date getDataHoraSai() {
		return dataHoraSai;
	}
	public void setDataHoraSai(Date dataHoraSai) {
		this.dataHoraSai = dataHoraSai;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
}
