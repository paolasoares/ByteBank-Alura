package br.com.bytebank.banco.Teste;

import br.com.bytebank.banco.Modelo.Cliente;
import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		//polimorfismo
		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33,22);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		
		//println(cp);
		
	}
	static void println(){}
	static void println(int a){}
	static void println(boolean valor){}
	static void println(Object referencia){
		
	}


}
