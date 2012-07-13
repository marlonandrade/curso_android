package br.edu.universo.controlefinanceiro;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import br.edu.universo.controlefinanceiro.datasource.FormaPagamentoDataSource;
import br.edu.universo.controlefinanceiro.model.FormaPagamento;

public class FormularioFormaPagamentoActivity extends Activity {
	
	private FormaPagamentoDataSource dataSource;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_forma_pagamento);
        
        dataSource = new FormaPagamentoDataSource();
    }

    public void confirmarClicked(View view) {
    	EditText editNome = (EditText) findViewById(R.id.nome_forma_pagamento);
    	String nome = editNome.getText().toString();
    	
    	FormaPagamento formaPagamento = new FormaPagamento();
    	formaPagamento.setNome(nome);
    	
    	dataSource.inserir(formaPagamento);
    	
    	finish();
    }
    
    public void cancelarClicked(View view) {
    	finish();
    }
}