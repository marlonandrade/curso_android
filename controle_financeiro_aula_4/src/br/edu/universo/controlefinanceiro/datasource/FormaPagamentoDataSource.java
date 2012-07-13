package br.edu.universo.controlefinanceiro.datasource;

import java.util.ArrayList;
import java.util.List;

import br.edu.universo.controlefinanceiro.model.FormaPagamento;

public class FormaPagamentoDataSource {

	private static List<FormaPagamento> formasPagamento =
			new ArrayList<FormaPagamento>();
	
	// inserir
	public void inserir(FormaPagamento formaPagamento) {
		formasPagamento.add(formaPagamento);
	}
	
	// listar
	public List<FormaPagamento> listar() {
		return formasPagamento;
	}
	
	// buscar um
	
	// editar
	
	// remover	
}