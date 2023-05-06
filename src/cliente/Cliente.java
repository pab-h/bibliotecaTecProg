package cliente;

import java.util.ArrayList;

import emprestimo.Emprestimo;

public abstract class Cliente {
	protected int matricula;
	protected String nome;
	protected double tps;
	protected ArrayList<Emprestimo> emprestimosFeitos;
	protected int maximoEmprestimo;
	protected int maximoDiasEmprestimo;
	protected double custoParaEmprestimo;
	
	public Cliente(int matricula, String nome, double tps) {
		this.matricula = matricula;
		this.nome = nome;
		this.tps = tps;
		this.emprestimosFeitos = new ArrayList<Emprestimo>();
	}
	
	@Override
	public String toString() {
		return this.matricula + "; " + this.nome + "; " + this.tps; 
	}
	
	public void setTps(double tps) {
		this.tps = tps;
	}
	
	public double getTps() {
		return this.tps;
	}
	
	public double getCustoParaEmprestimo() {
		return this.custoParaEmprestimo;
	}
	
	public int getMaximoDiasEmprestimo() {
		return this.maximoDiasEmprestimo;
	}
	
	public int getMaximoEmprestimo() {
		return this.maximoEmprestimo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	@SuppressWarnings("unchecked")	
	public ArrayList<Emprestimo> getEmprestimosFeitos() {
		return (ArrayList<Emprestimo>) this.emprestimosFeitos.clone();
	}
 	
	@SuppressWarnings("unchecked")
	public ArrayList<Emprestimo> getHistorico() {
		return (ArrayList<Emprestimo>) this.emprestimosFeitos.clone();
	}
	
	public void anotaEmprestimo(Emprestimo emprestimo) {
		this.emprestimosFeitos.add(emprestimo);
	}
	
}
