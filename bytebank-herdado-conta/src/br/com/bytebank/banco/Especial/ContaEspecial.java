package br.com.bytebank.banco.Especial;

import br.com.bytebank.banco.Modelo.Conta;

public class ContaEspecial extends Conta {

	
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void deposita(double valor) {
		super.saldo +=valor;
	}
	
}
