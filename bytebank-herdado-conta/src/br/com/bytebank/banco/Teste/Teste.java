package br.com.bytebank.banco.Teste;

import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.ContaPoupanca;
import br.com.bytebank.banco.Modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {

		Object[] guardador = new Object[5];
		
		ContaCorrente cc = new ContaCorrente(21, 22);
		guardador[0] = cc;
		
		Conta cc2 = new ContaPoupanca(22, 21);
		guardador[1] = cc2;
		
//		int tamanho = guardador.getQuantidadeElementos[];
//		System.out.println(tamanho);
		
		ContaCorrente ref = (ContaCorrente)guardador[1];
		System.out.println(cc.getNumero());
		System.out.println(ref.getNumero());
		
	}
}
