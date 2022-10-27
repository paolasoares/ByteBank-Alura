package br.com.bytebank.banco.Teste;

//importou
import br.com.bytebank.banco.Modelo.Cliente;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.ContaPoupanca;

public class TestArrayReferencia {
	
	public static void main(String[] args) {

		//alterando tipo de conta
		Object[] referencias = new Object[5];
		ContaCorrente cc1 = new ContaCorrente(22, 21);
		referencias[0] = cc1;
		
		//cria instacia poupaca
		ContaPoupanca cc2 = new ContaPoupanca(23, 24);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//alterou o tipo, realizando o cast
		ContaPoupanca ref= (ContaPoupanca)referencias[1];//type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}
}

