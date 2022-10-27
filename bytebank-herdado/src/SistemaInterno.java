
public class SistemaInterno {

	private int senha = 2222;

	public void autentica(Autenticavel fa) {

		boolean autentica = fa.autentica(this.senha);
		if (autentica) {
			System.out.println("pode entrar no sistema");
		} else {
			System.out.println("Não pode entrar no sistema");

		}
	}

}
