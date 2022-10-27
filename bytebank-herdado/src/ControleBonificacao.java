
public class ControleBonificacao {
	private double soma;

	
	public void registra(Funcionario f) {
		double paola = f.getBonificacao();
		this.soma =  this.soma+ paola;
	}

	public double getSoma() {
		return soma;
	}
	

}

