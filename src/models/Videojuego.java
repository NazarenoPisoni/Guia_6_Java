package models;

import java.util.Objects;

public class Videojuego implements Entrega{
    private String titulo;
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String compania;

    public Videojuego() {
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego { " +
                "Título = '" + titulo + '\'' +
                ", Horas estimadas = " + horasEstimadas +
                ", Entregado = " + entregado +
                ", Género = '" + genero + '\'' +
                ", Compañía = '" + compania + '\'' +
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
    public int compareTo(Videojuego v) {
        int result = Integer.compare(getHorasEstimadas(), v.getHorasEstimadas());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Videojuego)) return false;
        Videojuego that = (Videojuego) o;
        return horasEstimadas == that.horasEstimadas && titulo == that.titulo && genero == that.genero && compania == that.compania;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, horasEstimadas, genero, compania);
    }
}
