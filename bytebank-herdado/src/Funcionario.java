//nao pode instancia dessa classe, pq é abstrata
public abstract class Funcionario {
	// atributos
	private String nome;
	private String cpf;
	protected double salario;// protected foi feio para liberar o acesso para os filhos
	// e deixar privado pra todas as outras classes

	// contrutor
	public Funcionario() {

	}

	// metodos sem corpo, nao ha i mplementacao
	public abstract double getBonificacao();

	// metodos get e set para acessar os atribultos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
