package br.com.bytebank.banco.Teste;

import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.SaldoInsuficienteException;

public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
	
		conta.deposita(200.0);
		try {
		conta.saca(290.0);
		}catch (SaldoInsuficienteException ex) {
		System.out.println("ex: "+ex.getMessage());	
		
		}
		System.out.println(conta.getSaldo());
	}
}
