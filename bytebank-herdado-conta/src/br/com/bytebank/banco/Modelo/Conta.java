package br.com.bytebank.banco.Modelo;

/*
 * classe representa a moldura de um conta
 * 
 * @author Paola 
 * 
 */
//class mae
public abstract class Conta extends Object{

	// atribultos
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/*
	 * contrutor para inicializar o objeto Conta a partir da agencia e numero
	 * 
	 *  @param agencia
	 *  @param numero
	 */
	// construtores e inicializacao e criaçao de objetos
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("Total da Conta é: "+Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		// System.out.println("Criando uma conta");
	}

	// metodos
	public abstract void deposita(double valor);

	/*
	 * valor precisar ser maior do que o saldo
	 * 
	 * @param valor  
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo +","+ "Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
			destino.deposita(valor);
	}

	// get e set para acessar os atribulos
	public double getSaldo() {
		return this.saldo;

	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int Numero) {
		if (numero <= 0) {
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		this.numero = Numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {

		return Conta.total;
	}
	@Override
	public String toString() {
		return " Numero: "+ this.getNumero()+", Agencia: "+ this.getAgencia()+", Saldo: "+this.saldo;
	}
	

	
}
