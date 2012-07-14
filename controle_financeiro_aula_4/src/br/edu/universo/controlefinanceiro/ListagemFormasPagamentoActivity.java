package br.edu.universo.controlefinanceiro;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import br.edu.universo.controlefinanceiro.adapter.FormaPagamentoAdapter;
import br.edu.universo.controlefinanceiro.datasource.FormaPagamentoDataSource;

public class ListagemFormasPagamentoActivity extends ListActivity {

	private FormaPagamentoDataSource dataSource = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listagem_formas_pagamento);

		dataSource = new FormaPagamentoDataSource();

		setListAdapter(new FormaPagamentoAdapter(this, dataSource.listar()));
	}

	@Override
	protected void onResume() {
		BaseAdapter adapter = (BaseAdapter) getListAdapter();
		adapter.notifyDataSetChanged();
		super.onResume();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_listagem_formas_pagamento,
				menu);
		return true;
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		if (item.getItemId() == R.id.menu_forma_pagamento_adicionar) {
			Intent intent = new Intent(this,
					FormularioFormaPagamentoActivity.class);
			startActivity(intent);
		}

		return super.onMenuItemSelected(featureId, item);
	}
}
