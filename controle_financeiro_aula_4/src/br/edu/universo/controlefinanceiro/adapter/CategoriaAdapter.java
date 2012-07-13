package br.edu.universo.controlefinanceiro.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import br.edu.universo.controlefinanceiro.R;
import br.edu.universo.controlefinanceiro.model.Categoria;

public class CategoriaAdapter extends ArrayAdapter<Categoria> {

	public CategoriaAdapter(Context context, List<Categoria> categorias) {
		super(context, R.layout.row_listagem_categoria, categorias);
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		if (view == null) {
			LayoutInflater inflater = LayoutInflater.from(getContext());
			view = inflater.inflate(R.layout.row_listagem_categoria, null);
		}

		Categoria categoria = getItem(position);

		TextView textView = (TextView) view.findViewById(R.id.row_categoria_nome);
		textView.setText(categoria.getNome());

		return view;
	}
}
