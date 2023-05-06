package sistema;

import biblioteca.Biblioteca;
import cliente.Aluno;
import cliente.Professor;
import cliente.Servidor;
import publicacao.Artigo;
import publicacao.Livro;
import publicacao.Revista;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.cadastro(new Livro("Como programa em Java", 2022, "Deitel", 20));
		biblioteca.cadastro(new Livro("Como ser aprovado em Técnicas de Programação;", 2023, "Geovana e Cauã", 10));
		
		biblioteca.cadastro(new Artigo("Um comparativo de desempenho entre Java e Python", 2021, "Silva", 10));
		biblioteca.cadastro(new Revista("INDICO: inclusão digital necessária para sociedade atual", 2023, "Geovana e Cauã", 10));
		
		biblioteca.cadastro(new Professor(30305, "João", 20));
		Professor fischer = new Professor(30305, "Fischer", 51);
		biblioteca.cadastro(fischer);
		
		biblioteca.cadastro(new Aluno(45456, "Maria", 2.2));
		biblioteca.cadastro(new Aluno(78877, "Ana", 3.8));
		
		biblioteca.cadastro(new Servidor(45456, "Michele", 5));
		biblioteca.cadastro(new Aluno(98888, "Thales", 4));
		
		System.out.println(fischer);
		
		Livro livro = (Livro) biblioteca.getPublicacao("Como programa em Java");
		
		System.out.println(livro + "\n");
		
		biblioteca.emprestarLivro(fischer, livro, 4);
		biblioteca.emprestarLivro(fischer, livro, 3);
		
		System.out.println(fischer.getEmprestimosFeitos() + "\n");
		
		System.out.println(biblioteca.mostrarAcervo() + "\n");
		System.out.println(biblioteca.mostrarClientes() + "\n");
		System.out.println(biblioteca.mostrarEmprestimos());
	}

}
