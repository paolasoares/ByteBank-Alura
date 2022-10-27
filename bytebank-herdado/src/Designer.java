//gerente e um funcinario, gerente herda da class funcionario
public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("chamando o metodo de bonificacao do Designer");
		return 200;

	}
}
