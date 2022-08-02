package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	protected static final double XP_PADRÂO = 10d;
	
	private String titulo;
	private String descriçao;
	
	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}

	public static double getXpPadrâo() {
		return XP_PADRÂO;
	}
	
	
	
}
