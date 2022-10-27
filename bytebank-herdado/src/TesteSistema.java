
public class TesteSistema {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setSenha(2222);

		Admistrador adm = new Admistrador();
		adm.setSenha(3333);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);

		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
	}
}
