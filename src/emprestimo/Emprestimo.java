package emprestimo;

import cliente.Aluno;
import cliente.Cliente;
import publicacao.Artigo;
import publicacao.Livro;
import publicacao.Publicacao;
import publicacao.Revista;

public final class Emprestimo {
	public Publicacao publicacao;
	public Cliente cliente;
	public int devolucao;	
	public double custo;
	
	public Emprestimo(Publicacao publicacao, Cliente cliente, int devolucao) throws Error {
		this.publicacao = publicacao;
		this.cliente = cliente;
		this.devolucao = devolucao;
		
		if (this.publicacao.exemplares == 0) {
			throw new Error("Nâo há exemplares suficiente de " + this.publicacao.titulo);
		}
		
		if (this.cliente.getEmprestimosFeitos().size() > this.cliente.getMaximoEmprestimo()) {
			throw new Error(this.cliente.getNome() + " execedeu o número de emprestimos máximos");
		}
		
		if (this.devolucao > this.cliente.getMaximoDiasEmprestimo()) {
			throw new Error("Quantidade máxima de dias execidada");
		}
		
		this.custo = this.cliente.getCustoParaEmprestimo(); 
		
		if (this.cliente instanceof Aluno) {
			if (this.publicacao instanceof Livro) {
				this.custo *= 1 - 0.10; 
			}
			
			if (this.publicacao instanceof Revista) {
				this.custo *= 1 - 0.01; 
			}
			
			if (this.publicacao instanceof Artigo) {
				this.custo *= 1 - 0.50; 
			}
		}
		
		if ((this.cliente.getTps() - this.custo) % 50 == 0) {
			throw new Error("O cliente" + this.cliente.getNome() + " deve doar um livro!");
		}
		
		if (this.cliente.getTps() - this.custo <= 0) {
			throw new Error("O cliente" + this.cliente.getNome() + " nâo tem tps o suficiente");
		}
		
		this.publicacao.exemplares--;
		this.cliente.setTps(this.cliente.getTps() - this.custo);
		
	}
	
	@Override
	public String toString() {
		return this.cliente.getNome() + "; " + this.publicacao.titulo + "; " + this.custo + "; " + this.devolucao;
	}
	
}
