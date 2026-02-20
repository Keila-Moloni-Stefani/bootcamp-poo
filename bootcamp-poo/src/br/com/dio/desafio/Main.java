package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

/**
 * Classe principal para testar o projeto de POO - Bootcamp DIO
 */
public class Main {

    public static void main(String[] args) {

        // ============================================================
        // CRIANDO OS CONTEÚDOS (Cursos e Mentorias)
        // ============================================================

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Fundamentos");
        cursoJava.setDescricao("Aprenda os fundamentos da linguagem Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoPoo = new Curso();
        cursoPoo.setTitulo("Programação Orientada a Objetos com Java");
        cursoPoo.setDescricao("Os 4 pilares da POO na prática");
        cursoPoo.setCargaHoraria(16);

        Curso cursoSpring = new Curso();
        cursoSpring.setTitulo("Spring Framework");
        cursoSpring.setDescricao("Desenvolvimento Back-End com Spring Boot");
        cursoSpring.setCargaHoraria(20);

        Mentoria mentoriaCarreira = new Mentoria();
        mentoriaCarreira.setTitulo("Mentoria de Carreira Dev");
        mentoriaCarreira.setDescricao("Dicas para alavancar sua carreira como desenvolvedor");
        mentoriaCarreira.setData(LocalDate.now());

        // ============================================================
        // CRIANDO O BOOTCAMP E ADICIONANDO OS CONTEÚDOS
        // ============================================================

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Torne-se um desenvolvedor Java completo com projetos reais");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPoo);
        bootcamp.getConteudos().add(cursoSpring);
        bootcamp.getConteudos().add(mentoriaCarreira);

        // ============================================================
        // CRIANDO OS DEVS E INSCREVENDO NO BOOTCAMP
        // ============================================================

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        // ============================================================
        // SIMULANDO PROGRESSO DOS DEVS
        // ============================================================

        System.out.println("\n--- Progresso da Ana ---");
        devAna.progredir(); // Conclui: Java Fundamentos
        devAna.progredir(); // Conclui: POO com Java
        devAna.progredir(); // Conclui: Spring Framework

        System.out.println("\n--- Progresso do João ---");
        devJoao.progredir(); // Conclui: Java Fundamentos

        // ============================================================
        // EXIBINDO RESULTADOS
        // ============================================================

        System.out.println("\n========================================");
        System.out.println("           RELATÓRIO FINAL              ");
        System.out.println("========================================");

        System.out.println("\n📋 Ana:");
        System.out.println("  Conteúdos inscritos  : " + devAna.getConteudosInscritos());
        System.out.println("  Conteúdos concluídos : " + devAna.getConteudosConcluidos());
        System.out.printf( "  XP Total             : %.0f XP%n", devAna.calcularTotalXp());

        System.out.println("\n📋 João:");
        System.out.println("  Conteúdos inscritos  : " + devJoao.getConteudosInscritos());
        System.out.println("  Conteúdos concluídos : " + devJoao.getConteudosConcluidos());
        System.out.printf( "  XP Total             : %.0f XP%n", devJoao.calcularTotalXp());

        System.out.println("\n🏆 Ranking de XP:");
        System.out.printf("  1º %s - %.0f XP%n", devAna.getNome(), devAna.calcularTotalXp());
        System.out.printf("  2º %s - %.0f XP%n", devJoao.getNome(), devJoao.calcularTotalXp());
    }
}
