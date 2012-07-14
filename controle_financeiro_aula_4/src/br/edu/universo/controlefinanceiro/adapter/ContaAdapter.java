package br.edu.universo.controlefinanceiro.adapter;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import br.edu.universo.controlefinanceiro.R;
import br.edu.universo.controlefinanceiro.model.Conta;

public class ContaAdapter extends ArrayAdapter<Conta> {

	public ContaAdapter(Context context, List<Conta> contas) {
		super(context, R.layout.row_listagem_conta, contas);
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		if (view == null) {
			LayoutInflater inflater = LayoutInflater.from(getContext());
			view = inflater.inflate(R.layout.row_listagem_conta, null);
		}

		Conta conta = getItem(position);

		View corView = view.findViewById(R.id.row_conta_cor);
		corView.setBackgroundColor(conta.getBackgroundColor());

		TextView textNome = (TextView) view.findViewById(R.id.row_conta_nome);
		textNome.setText(conta.getNome());

		TextView textSaldo = (TextView) view.findViewById(R.id.row_conta_saldo);
		textSaldo.setText(String.format("R$ %.2f", conta.getSaldo()));

		if (conta.getSaldo() < 0d) {
			textSaldo.setTextColor(Color.RED);
		} else {
			textSaldo.setTextColor(0xFF003500);
		}

		return view;
	}
}
