package br.ufjf.dcc.poo.controller;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

import br.ufjf.dcc.poo.model.Cliente;

public class Principal {

	public static void main(String[] args) {
		
		try {
			Cliente cliente = new Cliente();
			cliente.setCod_cliente(JOptionPane.showInputDialog(null,"Entre com o código"));
			cliente.setNome(JOptionPane.showInputDialog(null,"Entre com o nome"));
			cliente.setEnd_bairro(JOptionPane.showInputDialog(null,"Entre com a rua"));
			cliente.setEnd_numero(Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com o número")));
			cliente.setEnd_complemento(JOptionPane.showInputDialog(null,"Entre com o complemento"));
		}  catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro!", "Erro", 0, null);
			e.printStackTrace();
		} finally {
			JOptionPane.showMessageDialog(null, "Fim do programa", "Erro", 0, null);
		}
	}

}
