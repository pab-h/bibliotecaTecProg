package biblioteca;

import java.util.ArrayList;

import publicacao.Publicacao;

import cliente.Cliente;

import emprestimo.Emprestimo;

public final class Biblioteca {
	private ArrayList<Publicacao> acervo;
	private ArrayList<Cliente> clientes; 
	private ArrayList<Emprestimo> emprestimos;
	
	public Biblioteca() {
		this.acervo = new ArrayList<Publicacao>();
		this.clientes = new ArrayList<Cliente>(); 
		this.emprestimos = new ArrayList<Emprestimo>();
		
	}
	
	public void cadastro(Publicacao publicacao) {
		this.acervo.add(publicacao);
		
	}
	
	public void cadastro(Cliente cliente) {
		this.clientes.add(cliente);
		
	}
	
	public Publicacao getPublicacao(String titulo) {		
		for (Publicacao publicacao : this.acervo) {
			if (publicacao.getTitulo().equals(titulo)) {
				return publicacao;
			}
		}
		
		return null;
	}
	
	public ArrayList<Emprestimo> getEmprestimoCliente(int matricula) {
		ArrayList<Emprestimo> emprestimos = null;
		
		for (Cliente cliente : this.clientes) {
			if (cliente.getMatricula() == matricula) {
				return cliente.getEmprestimosFeitos();
			}
			
		}
		
		return emprestimos;
	}
	
	public String mostrarClientes() {
		String out = "";
		
		for (Cliente cliente : this.clientes) {
			out += cliente + "\n";
			
		}
		
		return out;	
	}
	
	public String mostrarAcervo() {
		String out = "";
		
		for (Publicacao publicacao : this.acervo) {
			out += publicacao + "\n";
			
		}
		
		return out;
	}
	
	public String mostrarEmprestimos() {
		String out = "";
		
		for (Emprestimo emprestimo: this.emprestimos) {
			out += emprestimo + "\n";
			
		}
		
		return out;
	}
	
	public boolean emprestarLivro(Cliente cliente, Publicacao publicacao, int devolucao) {
		try {
			Emprestimo emprestimoFeito = new Emprestimo(publicacao, cliente, devolucao);
			
			this.emprestimos.add(emprestimoFeito);
			cliente.anotaEmprestimo(emprestimoFeito);

			return true;
		} catch (Error error) {
			return false;
		}
		
	}
	
}
