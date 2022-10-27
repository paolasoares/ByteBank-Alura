
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paola = new Cliente();
		paola.nome = "paolaSoares";
		paola.cpf = "000.000.000.00";
		paola.profissao = "Programadora";
		
		Conta contaDaPaola = new Conta();
		contaDaPaola.deposita(100);
		
		//associa a cliente paola a contaDaPaola
		contaDaPaola.titular = paola;
		System.out.println(contaDaPaola.titular.nome);
	}
}
