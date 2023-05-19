package models;

import java.util.Objects;

public class Serie implements Entrega{
    private String titulo = "";
    private int nroTemporadas = 1;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int nroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.nroTemporadas = nroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNroTemporadas() {
        return nroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNroTemporadas(int nroTemporadas) {
        this.nroTemporadas = nroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie { " +
                "Título = '" + titulo + '\'' +
                ", Número de Temporadas = " + nroTemporadas +
                ", Entregado = " + entregado +
                ", Género = '" + genero + '\'' +
                ", Creador = '" + creador + '\'' +
                '}';
    }

    public void entregar(){
        entregado = true;
    }
    public void devolver(){
        entregado = false;
    }
    public boolean isEntregado(){
        return entregado;
    }
    public int compareTo(Object a) {
        Serie s = (Serie) a;
        int result = Integer.compare(getNroTemporadas(), s.getNroTemporadas());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie)) return false;
        Serie serie = (Serie) o;
        return titulo == serie.titulo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, nroTemporadas, genero, creador);
    }
}
