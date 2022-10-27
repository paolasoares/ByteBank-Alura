
public class TesteGerente {
	public static void main(String[] args) {
		Autenticavel gerente = new Cliente();
		
		Gerente g1 = new Gerente();
		g1.setNome("paola");
		g1.setCpf("12345666-00");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(g1.getCpf());
		
//		g1.setSenha(12345);
//		boolean autenticou = g1.autentica(12345);
//		
//		System.out.println(autenticou);

		System.out.println(g1.getBonificacao());
	}
}
