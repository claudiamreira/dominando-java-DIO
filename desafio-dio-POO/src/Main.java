import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {

	public static void main(String [] args) {
		
			Curso curso = new Curso();
			curso.setTitulo("Programação Orientada a Objetos");
			curso.setDescricao("Introdução, Fundamentos, Estrutura Básica da Orientação a Objetos"
					+ "As Relações: Herança, Associação, Interface; A Organização de Pacotes e Visibilidade");
			curso.setCargaHoraria(8);
			
			Curso curso1 = new Curso();
			curso1.setTitulo("HTML/CSS/JS");
			curso1.setDescricao("Introdução, Fundamentos, Projeto Integrador");
			curso1.setCargaHoraria(6);
			
			Mentoria mentoria = new Mentoria();
			mentoria.setTitulo("Mentora: Claudia"); 
			mentoria.setDescricao("Analista de Sistemas - Santander");
			mentoria.setData(LocalDate.now());
			
			Bootcamp bootcamp = new Bootcamp();
			bootcamp.setNome("Bootcamp Java Developer");
			bootcamp.setDescricao("Descrição Bootcamp Java Developer");
			bootcamp.getConteudos().add(curso);
			bootcamp.getConteudos().add(mentoria);
			
			Dev devHeitor = new Dev();
			devHeitor.setNome("Heitor");
			devHeitor.inscreverBootcamp(bootcamp);
			System.out.println("Conteúdos Inscritos " + devHeitor.getConteudosInscritos());
			
			devHeitor.progredir();
			devHeitor.progredir();			
			
			System.out.println("-");
			System.out.println("Conteúdos Inscritos " + devHeitor.getConteudosInscritos());
			System.out.println("Conteúdos Concluídos " + devHeitor.getConteudosConcluidos());
			System.out.println("XP: " + devHeitor.calcularTotalXp());
			
			System.out.println("\n-----------");
			
			
			Dev devVitoria = new Dev();
			devVitoria.setNome("Vitória");
			devVitoria.inscreverBootcamp(bootcamp);
			System.out.println("Conteúdos Inscritos " + devVitoria.getConteudosInscritos());
			System.out.println("Conteúdos Concluídos " + devVitoria.getConteudosConcluidos());
			System.out.println("XP: " + devVitoria.calcularTotalXp());
			
			
			
			
	}
}
