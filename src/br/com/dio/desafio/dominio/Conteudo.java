package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	protected static final double XP_PADR�O = 10d;
	
	private String titulo;
	private String descri�ao;
	
	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescri�ao() {
		return descri�ao;
	}

	public void setDescri�ao(String descri�ao) {
		this.descri�ao = descri�ao;
	}

	public static double getXpPadr�o() {
		return XP_PADR�O;
	}
	
	
	
}
