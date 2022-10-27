
public class testaMetodo {
	public static void main(String[] args) {
		Conta contaDaPaola = new Conta();
		contaDaPaola.saldo = 100;
		contaDaPaola.deposita(50);
		System.out.println(contaDaPaola.saldo);
		
		boolean conseguiuRetirar = contaDaPaola.saca(20);
		System.out.println(contaDaPaola.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaNaza = new Conta();
		contaDaNaza.deposita(1000);
		
		if(contaDaNaza.transfere(3000 , contaDaPaola)) {
			System.out.println("tranferencia com sucesso");
		}else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaNaza.saldo);
		System.out.println(contaDaPaola.saldo);
	}

}
