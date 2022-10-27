// dentro de uma inteface nao tem nada concreto, somente abstract
	//contrato Autenticavel
		//quem assina esse contrato, precisa implentar
			//metodo setSenha
			//metodo autentica
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int adm);


}	
