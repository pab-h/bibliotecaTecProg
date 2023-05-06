package cliente;

public class Servidor extends Cliente {
	public Servidor(int matricula, String nome, double tps) {
		super(matricula, nome, tps);
		
		this.maximoDiasEmprestimo = 15;
		this.custoParaEmprestimo = 15;
		this.maximoEmprestimo = 7;
		
	}
}
