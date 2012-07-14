package br.edu.universo.controlefinanceiro;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import br.edu.universo.controlefinanceiro.adapter.ContaAdapter;
import br.edu.universo.controlefinanceiro.datasource.ContaDataSource;

public class ListagemContasActivity extends ListActivity {

	private ContaDataSource dataSource;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listagem_contas);

		dataSource = new ContaDataSource();

		setListAdapter(new ContaAdapter(this, dataSource.listar()));
	}

	@Override
	protected void onResume() {
		BaseAdapter adapter = (BaseAdapter) getListAdapter();
		adapter.notifyDataSetChanged();
		super.onResume();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_listagem_contas, menu);
		return true;
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		if (item.getItemId() == R.id.menu_conta_adicionar) {
			Intent intent = new Intent(this, FormularioContaActivity.class);
			startActivity(intent);
		}

		return super.onMenuItemSelected(featureId, item);
	}
}