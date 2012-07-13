package br.edu.universo.controlefinanceiro.datasource;

import java.util.ArrayList;
import java.util.List;

import br.edu.universo.controlefinanceiro.model.Conta;

public class ContaDataSource {
	
	private static List<Conta> contas = new ArrayList<Conta>();

	// inserir
	public void inserir(Conta novaConta) {
		contas.add(novaConta);
	}
	
	// listar
	public List<Conta> listar() {
		return contas;
	}
	
	// buscar um
	
	// editar
	
	// remover
	
}