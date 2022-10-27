
public class AutenticacaoUtil {
	
	private int senha;

	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;	
	}

	@Override
	public boolean autentica(int adm) {
		if (this.senha == adm) {
			return true;
		} else {
			return false;
		}
	}
}
