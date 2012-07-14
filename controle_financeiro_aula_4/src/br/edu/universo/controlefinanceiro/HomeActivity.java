package br.edu.universo.controlefinanceiro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	public void contasClicked(View view) {
		Intent intent = new Intent(this, ListagemContasActivity.class);
		startActivity(intent);
	}

	public void categoriasClicked(View view) {
		Intent intent = new Intent(this, ListagemCategoriasActivity.class);
		startActivity(intent);
	}

	public void formasPagamentoClicked(View view) {
		Intent intent = new Intent(this, ListagemFormasPagamentoActivity.class);
		startActivity(intent);
	}

	public void sobreClicked(View view) {
		Toast toast = Toast.makeText(this, "Sobre", Toast.LENGTH_LONG);
		toast.show();
	}
}
