package publicacao;

public abstract class Publicacao {
	public String titulo;
	public int ano;
	public String autor;
	public int exemplares;
	
	public Publicacao(String titulo, int ano, String autor, int exemplares) {
		this.titulo = titulo;
		this.ano = ano;
		this.autor = autor;
		this.exemplares = exemplares;
	}
	
	public String toString() {
		return this.titulo + ", " + this.ano + ", " + this.autor + ", " + this.exemplares;
	}
	
}
