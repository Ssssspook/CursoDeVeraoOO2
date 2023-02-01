package br.ufjf.dcc.poo.controller;

import br.ufjf.dcc.poo.model.Aluno;
import br.ufjf.dcc.poo.model.Funcionario;
import br.ufjf.dcc.poo.model.Pessoa;
import br.ufjf.dcc.poo.model.Professor;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Afú");
		aluno.setCpf("001.654.678-87");
		aluno.setRg("MG-765432");
		aluno.setSexo("M");
		aluno.setMatrícula("123456789");
		
		Professor professor = new Professor();
		professor.setNome("Ronney");
		professor.setCpf("001.654.678-87");
		professor.setRg("M-54321");
		professor.setSexo("M");
		professor.setSiape("123456");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Carol");
		funcionario.setCpf("001.001.001-01");
		funcionario.setRg("MG-123456");
		funcionario.setSexo("F");
		funcionario.setRegistro("F123456");
		
	}

}
