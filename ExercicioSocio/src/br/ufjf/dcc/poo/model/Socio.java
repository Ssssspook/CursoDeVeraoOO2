package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Socio {
	private String matricula;
	private String nome;
	private CartaoAcesso cartao;
	private ArrayList<Boleto> boletos;
	private ArrayList<Veiculo> veiculos;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CartaoAcesso getCartao() {
		return cartao;
	}
	public void setCartao(CartaoAcesso cartao) {
		this.cartao = cartao;
	}
	public ArrayList<Boleto> getBoletos() {
		return boletos;
	}
	public void setBoletos(ArrayList<Boleto> boletos) {
		this.boletos = boletos;
	}
	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	
}
