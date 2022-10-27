
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("saldo da primeira conta "+ primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: "+ segundaConta.saldo);
		
		segundaConta.saldo +=100;
		System.out.println("Saldo da segunda conta: "+ segundaConta.saldo);
		
		System.out.println(segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("sao a mesmissima conta");
		}else {
			System.out.println("sao digferentes");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		/*atividade 
		
		Conta minhaConta = new Conta();
        minhaConta.saldo = 500.0;
        Conta outraConta = minhaConta;
        outraConta.saldo += 1000.0;
        System.out.println(minhaConta.saldo);*/
	}
	
}
