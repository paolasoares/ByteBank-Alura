
public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente paola = new Gerente();
		paola.setNome("Paola Soares");
		paola.setCpf("00000000-00");
		paola.setSalario(2600.00);
		
		System.out.println(paola.getNome());
		System.out.println(paola.getBonificacao());
	}

}
