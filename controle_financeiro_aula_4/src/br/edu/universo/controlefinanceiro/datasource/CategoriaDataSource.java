package br.edu.universo.controlefinanceiro.datasource;

import java.util.ArrayList;
import java.util.List;

import br.edu.universo.controlefinanceiro.model.Categoria;

public class CategoriaDataSource {

	private static List<Categoria> categorias =
			new ArrayList<Categoria>();
	
	// inserir
	public void inserir(Categoria categoria) {
		categorias.add(categoria);
	}
	
	// listar
	public List<Categoria> listar() {
		return categorias;
	}
	
	// buscar um
	
	// editar
	
	// remover
}