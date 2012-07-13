package br.edu.universo.controlefinanceiro.adapter;

import java.util.List;

import br.edu.universo.controlefinanceiro.R;
import br.edu.universo.controlefinanceiro.model.FormaPagamento;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class FormaPagamentoAdapter extends ArrayAdapter<FormaPagamento> {

	public FormaPagamentoAdapter(Context context, List<FormaPagamento> formasPagamento) {
		super(context, R.layout.row_listagem_forma_pagamento, formasPagamento);
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		if (view == null) {
			LayoutInflater inflater = LayoutInflater.from(getContext());
			view = inflater.inflate(R.layout.row_listagem_forma_pagamento, null);
		}
		
		FormaPagamento formaPagamento = getItem(position);
		
		TextView textView = (TextView) view.findViewById(R.id.row_forma_pagamento_nome);
		textView.setText(formaPagamento.getNome());

		return view;
	}
}