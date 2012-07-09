package br.edu.universo.android.listview;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {
	
    private final String[] VERSOES_ANDROID = {
    	"1.0 - Sem nome - 2008",
    	"1.1 - Sem nome - 2009, fev",
    	"1.5 - Cupcake - 2009, jun",
    	"1.6 - Donut - 2009, set",
    	"2.0/2.1 - Éclair - 2009, out",
    	"2.2.x - Froyo - 2010, mar",
    	"2.3.x - Gingerbread - 2010, dez",
    	"3.x - Honeycomb - 2011, feb",
    	"4.0.x - Ice Cream Sandwich - 2011, out",
    	"4.1 - Jelly Bean - 2012, jun"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        setListAdapter(new ArrayAdapter<String>(
//        		this, android.R.layout.simple_list_item_1, VERSOES_ANDROID));
        
        List<Map<String, String>> dados = new LinkedList<Map<String,String>>();
        
        for (String android : VERSOES_ANDROID) {
        	Map<String, String> linha = new HashMap<String, String>();
        	
        	String[] linha_android = android.split(" - ");
        	
        	linha.put("versão", linha_android[0]);
        	linha.put("data", linha_android[2]);
        	linha.put("nome", linha_android[1]);
        	
        	dados.add(linha);
		}
        
        String[] from = { "versão", "data", "nome" };
        int[] to = { R.id.versao, R.id.data, R.id.nome_versao };
        
        setListAdapter(new SimpleAdapter(this, dados, R.layout.custom_list_row, from, to));
    }
    
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	super.onListItemClick(l, v, position, id);
    	
    	Object item = l.getAdapter().getItem(position);
    	
    	Toast toast = Toast.makeText(this, "Clicado em: " + item.toString(), 3);
    	toast.show();
    }
}