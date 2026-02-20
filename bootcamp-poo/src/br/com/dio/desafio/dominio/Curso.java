package br.com.dio.desafio.dominio;

/**
 * HERANÇA: Curso herda de Conteudo.
 * ENCAPSULAMENTO: atributos privados com getters/setters.
 * POLIMORFISMO: sobrescreve calcularTotalXp() com sua própria lógica.
 */
public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularTotalXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", xp=" + calcularTotalXp() +
                '}';
    }
}
