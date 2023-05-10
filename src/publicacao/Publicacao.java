package publicacao;

public abstract class Publicacao {
	private String titulo;
	private int ano;
	private String autor;
	private int exemplares;
	
	public Publicacao(String titulo, int ano, String autor, int exemplares) {
		this.titulo = titulo;
		this.ano = ano;
		this.autor = autor;
		this.exemplares = exemplares;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public int getExamplares() {
		return this.exemplares;
	}
	
	public void setExamplares(int exemplares) {
		this.exemplares = exemplares;
	}
	
	public boolean temExemplares() {
		return this.exemplares != 0;
	}
	
	public String toString() {
		return this.titulo + ", " + this.ano + ", " + this.autor + ", " + this.exemplares;
	}
	
}
