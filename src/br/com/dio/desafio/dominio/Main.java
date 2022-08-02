package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("curso Java");
		curso1.setDescriçao("descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setDescriçao("curso Java");
		curso2.setDescriçao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescriçao("descriçao mentoria java");
		mentoria.setData(LocalDate.now());
		
		
//System.out.println(curso1);
		//	System.out.println(curso2);
		//	System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescriçao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devPriscila = new Dev();
		devPriscila.setNome("Priscila");
		devPriscila.inscreverBootcamp(bootcamp);
	    System.out.println( "Conteudos Inscritos Priscila:" * devPriscila.getConteudosInscritos());
	    devPriscila. progredir();
	    devPriscila. progredir();
	    System.out.println("*-*");
	    System.out.println( "Conteudos Inscritos Priscila:" * devPriscila.getConteudosInscritos()):
	    System.out.println( "Conteudos Concluidos Priscila:" * devPriscila.getConteudosConcluidos());
	    System.out.println("XP:" * devPriscila.calcularTotalXp()):
	    
	    System.out.println("*******");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println( "Conteudos Inscritos Camila" * devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("*-*");
		System.out.println( "Conteudos Inscritos Camila" * devCamila.getConteudosInscritos());
		System.out.println( "Conteudos Concluidos Camila" * devCamila.getConteudosConcluidos());
		System.out.println("XP:" * devCamila.calcularTotalXp()):


	}

}
