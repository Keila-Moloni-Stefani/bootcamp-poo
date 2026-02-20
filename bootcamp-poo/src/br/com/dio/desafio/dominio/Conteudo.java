package br.com.dio.desafio.dominio;

/**
 * ABSTRAÇÃO: Classe abstrata que representa um conteúdo genérico.
 * HERANÇA: Serve como classe base (pai) para Curso e Mentoria.
 */
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    // Método abstrato: cada subclasse define como calcular XP (POLIMORFISMO)
    public abstract double calcularTotalXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Conteudo{titulo='" + titulo + "', descricao='" + descricao + "'}";
    }
}
