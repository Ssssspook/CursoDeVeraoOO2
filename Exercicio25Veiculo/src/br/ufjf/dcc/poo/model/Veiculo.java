package br.ufjf.dcc.poo.model;

import java.sql.Date;

public abstract class Veiculo {
	private String nro_placa;
	private String modelo;
	private Date data_ultima_revisao;
	
	public String getNro_placa() {
		return nro_placa;
	}
	public void setNro_placa(String nro_placa) {
		this.nro_placa = nro_placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getData_ultima_revisao() {
		return data_ultima_revisao;
	}
	public void setData_ultima_revisao(Date data_ultima_revisao) {
		this.data_ultima_revisao = data_ultima_revisao;
	}
	
	public Date proxima_revisao() {
		return null;
	}
	
}
