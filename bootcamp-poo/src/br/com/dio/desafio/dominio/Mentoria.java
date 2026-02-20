package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * HERANÇA: Mentoria herda de Conteudo.
 * POLIMORFISMO: sobrescreve calcularTotalXp() com sua própria lógica.
 */
public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularTotalXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                ", xp=" + calcularTotalXp() +
                '}';
    }
}
