//gerente e um funcionario, gerente herda a class funcionario, assina o contrato autentical
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	// metodos
	public double getBonificacao() {

		System.out.println("chamando o metodo de bonificacao do gerente");
		return super.getSalario();
		// super classe esta relacioada com a classe mae, é preciso ver a classe mae
		// para enconrar os aribultos
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}

	
}