package br.com.bytebank.banco.Teste;

import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.ContaPoupanca;
import br.com.bytebank.banco.Modelo.SaldoInsuficienteException;

//FQN (Full Qualified Name) é nome completo da classe, composto pelo nome do pacote e o nome da classe.
public class TesteConta {
	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("Cc " + cc.getSaldo());
		System.out.println("Cp " + cp.getSaldo());
	}
}
