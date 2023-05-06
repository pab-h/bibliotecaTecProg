package cliente;

public class Aluno extends Cliente{
	public Aluno(int matricula, String nome, double tps) {
		super(matricula, nome, tps);
	
		this.maximoDiasEmprestimo = 10;
		this.custoParaEmprestimo = 10;
		this.maximoEmprestimo = 5;
		
	}
}
