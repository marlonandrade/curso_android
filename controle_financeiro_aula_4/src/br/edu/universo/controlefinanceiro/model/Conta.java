package br.edu.universo.controlefinanceiro.model;

import android.graphics.Color;

public class Conta {

	private String nome;
	private String cor;
	private Double saldo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public int getBackgroundColor() {
		int backgroundColor = Color.WHITE;
		
		if (this.cor.equals("Amarelo")) {
			backgroundColor = Color.YELLOW;
		} else if (this.cor.equals("Azul")) {
			backgroundColor = Color.BLUE;
		} else if (this.cor.equals("Vermelho")) {
			backgroundColor = Color.RED;
		} else if (this.cor.equals("Verde")) {
			backgroundColor = Color.GREEN;
		} else if (this.cor.equals("Preto")) {
			backgroundColor = Color.BLACK;
		}
		
		return backgroundColor;
	}
}