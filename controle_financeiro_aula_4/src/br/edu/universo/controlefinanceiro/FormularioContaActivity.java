package br.edu.universo.controlefinanceiro;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import br.edu.universo.controlefinanceiro.datasource.ContaDataSource;
import br.edu.universo.controlefinanceiro.model.Conta;

public class FormularioContaActivity extends Activity {

	private ContaDataSource dataSource;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_formulario_conta);

		dataSource = new ContaDataSource();
	}

	public void confirmarClicked(View view) {
		EditText editNome = (EditText) findViewById(R.id.nome_conta);
		String nome = editNome.getText().toString();

		Spinner spinnerCor = (Spinner) findViewById(R.id.cor_conta);
		String cor = spinnerCor.getSelectedItem().toString();

		EditText editSaldoInicial = (EditText) findViewById(R.id.saldo_conta);
		Double saldoInicial = 0d;
		try {
			saldoInicial = Double.parseDouble(editSaldoInicial.getText()
					.toString());
		} catch (Exception e) {
		}

		Conta novaConta = new Conta();
		novaConta.setNome(nome);
		novaConta.setCor(cor);
		novaConta.setSaldo(saldoInicial);

		dataSource.inserir(novaConta);

		finish();
	}

	public void cancelarClicked(View view) {
		finish();
	}
}