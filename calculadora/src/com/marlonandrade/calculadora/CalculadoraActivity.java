package com.marlonandrade.calculadora;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculadoraActivity extends Activity {
	
	public String operando;
	public String operador;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_calculadora, menu);
        return true;
    }
    
    public void botaoPressionado(View view) {
    		Button botao = (Button) view;
    		TextView display = (TextView) findViewById(R.id.textViewDisplay);
    		
    		String textoAtual = display.getText().toString();
    		if (textoAtual.equals("0")) {
    			display.setText(botao.getText());
    		} else {
	    		display.setText(textoAtual + botao.getText());
    		}
    }
    
    public void pontoPressionado(View view) {
    		TextView display = (TextView) findViewById(R.id.textViewDisplay);
    		String textoAtual = display.getText().toString();
    		if (!textoAtual.contains(".")) {
    			display.setText(textoAtual + ".");
    		}
    }
    
    public void limparDisplay(View view) {
    		TextView display = (TextView) findViewById(R.id.textViewDisplay);
    		display.setText("0");
    }
    
    public void operadorPressionado(View view) {
    		Button botao = (Button) view;
    		TextView display = (TextView) findViewById(R.id.textViewDisplay);
    		
    		operando = display.getText().toString();
    		operador = botao.getText().toString();
    		
    		display.setText("0");
    }
    
    public void executarOperacao(View view) {
    		if (operador != null && operador.length() > 0) {
	    		TextView display = (TextView) findViewById(R.id.textViewDisplay);
	    		String textoAtual = display.getText().toString();
	    		
	    		double operandoEsquerda = Double.parseDouble(operando);
	    		double operandoDireita = Double.parseDouble(textoAtual);
	    		
	    		double resultado = 0;
	    		if (operador.equals("+")) {
	    			resultado = operandoEsquerda + operandoDireita;
	    		} else if (operador.equals("-")) {
	    			resultado = operandoEsquerda - operandoDireita;
	    		} else if (operador.equals("*")) {
	    			resultado = operandoEsquerda * operandoDireita;
	    		} else if (operador.equals("/")) {
	    			resultado = operandoEsquerda / operandoDireita;
	    		}
	    		
	    		String resultadoFormatado = String.valueOf(resultado);
	    		if (resultadoFormatado.contains(".")) {
	    			int posicaoPonto = resultadoFormatado.indexOf(".");
	    			String direitaPonto = resultadoFormatado.substring(posicaoPonto + 1);
	    			if (Double.parseDouble(direitaPonto) == 0) {
	    				resultadoFormatado = resultadoFormatado.substring(0, posicaoPonto);
	    			}
	    		}
	    		
	    		display.setText(resultadoFormatado);
	    		operador = null;
	    		operando = null;
    		}
    }
    
    public void informacoesPressionado(View view) {
    		TextView display = (TextView) findViewById(R.id.textViewDisplay);
    		Intent intent = new Intent(this, InformacoesActivity.class);
    		intent.putExtra("resultado", display.getText().toString());
    		startActivity(intent);
    }
}


























