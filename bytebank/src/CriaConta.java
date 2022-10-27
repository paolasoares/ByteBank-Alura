
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
	
	
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		System.out.println("primeira conta tem "+primeiraConta.saldo);
		System.out.println("segunda conta tem "+segundaConta.saldo);
		if(primeiraConta == segundaConta) {
			
			System.out.println("sao a mesmissima conta");
		}else {
			System.out.println("sao digferentes");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	} 
	
	
}
 