
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaPaola = new Conta();
		System.out.println(contaDaPaola.getSaldo());

		contaDaPaola.titular = new Cliente();
		System.out.println(contaDaPaola.titular);

		contaDaPaola.titular.nome = "paola";
		System.out.println(contaDaPaola.titular.nome);

	}
}
