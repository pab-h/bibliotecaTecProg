package cliente;

public class Professor extends Cliente {
	public Professor(int matricula, String nome, double tps) {
		super(matricula, nome, tps);
		
		this.maximoEmprestimo = 10;
		this.maximoDiasEmprestimo = 20;
		this.custoParaEmprestimo = 25;
		
	}
}
