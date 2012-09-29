package com.marlonandrade.calculadora;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class InformacoesActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacoes);
        
        TextView resultadoTextView = (TextView) findViewById(R.id.textViewResultado);
        Intent intent = getIntent();
        String resultado = intent.getStringExtra("resultado");
        
        resultadoTextView.setText(resultado);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_informacoes, menu);
        return true;
    }
}
