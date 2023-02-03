package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Cliente extends Pessoa {
	
	private double limiteCredito;
	private int cartaoCredito;
	private String contato;
	private Boolean status;
	private ArrayList<Pedido> pedidos;
	
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public int getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(int cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public double verificaCredito() {
		double limite = this.getLimiteCredito();
		return limite;
	}
	
	public int validaCartao() {
		int cartao = this.getCartaoCredito();
		return cartao;
	}


}
