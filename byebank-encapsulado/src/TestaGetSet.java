
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paola = new Cliente();
		paola.setNome ("Paola");
				 
		conta.setTitular(paola);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programadora");
		//agora em duas linhas: 
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programadora");
		
		System.out.println(titularDaConta);
		System.out.println(paola);
		System.out.println(conta.getTitular());
	}
}
 