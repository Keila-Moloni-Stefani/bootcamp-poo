package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 * ABSTRAÇÃO: Representa um desenvolvedor.
 * ENCAPSULAMENTO: lógica de negócio encapsulada nos métodos.
 */
public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /**
     * Inscreve o Dev em um Bootcamp, copiando todos os conteúdos do bootcamp
     * para a lista de conteúdos inscritos do Dev.
     */
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
        System.out.println("✅ " + this.nome + " inscrito no Bootcamp: " + bootcamp.getNome());
    }

    /**
     * Avança para o próximo conteúdo, movendo-o de inscritos para concluídos.
     */
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
            System.out.println("📚 " + this.nome + " concluiu: " + conteudo.get().getTitulo());
        } else {
            System.err.println("⚠️ " + this.nome + " não está inscrito em nenhum conteúdo!");
        }
    }

    /**
     * Calcula o total de XP somando todos os conteúdos concluídos.
     * POLIMORFISMO: calcularTotalXp() é chamado em objetos de tipos diferentes (Curso, Mentoria).
     */
    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularTotalXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                ", totalXp=" + calcularTotalXp() +
                '}';
    }
}
