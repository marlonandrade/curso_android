package br.edu.universo.controlefinanceiro;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import br.edu.universo.controlefinanceiro.datasource.CategoriaDataSource;
import br.edu.universo.controlefinanceiro.model.Categoria;

public class FormularioCategoriaActivity extends Activity {
	
	private CategoriaDataSource dataSource;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_categoria);
        
        dataSource = new CategoriaDataSource();
    }

    public void confirmarClicked(View view) {
    	EditText editNome = (EditText) findViewById(R.id.nome_categoria);
    	String nome = editNome.getText().toString();
    	
    	Categoria categoria = new Categoria();
    	categoria.setNome(nome);
    	
    	dataSource.inserir(categoria);
    	
    	finish();
    }
    
    public void cancelarClicked(View view) {
    	finish();
    }
}