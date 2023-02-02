package br.ufjf.dcc.poo.model;



public class Atendimento {
	private int codigoAtendimento;
	private Cliente cliente;
	private Funcionario funcionario;
	
	public int getCodigoAtendimento() {
		return codigoAtendimento;
	}
	public void setCodigoAtendimento(int codigoAtendimento) {
		this.codigoAtendimento = codigoAtendimento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
