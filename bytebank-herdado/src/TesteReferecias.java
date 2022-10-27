
public class TesteReferecias {

	public static void main(String[] args) {
	
	  //Funcionario g1 = new Gerente; E chamada de polimorfismo pode usar a referencia tantto funcionario quanto Gerente		
		Gerente g1 = new Gerente();  //pode ser usada dessa duas formas para acessar o objeto
		
		//Chamar os metodos
		g1.setNome("paola");
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.00);
		
		Designer d = new Designer();
		d.setSalario(2000.00);
		
		
		ControleBonificacao controle =  new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		

	}

}
