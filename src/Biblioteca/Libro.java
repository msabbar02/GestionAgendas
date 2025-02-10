package Biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int anyoPublicacion;


    public Libro(String titulo, String autor, int anyoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                " Autor: " + autor +
                " Año Publicacion: " + anyoPublicacion ;
    }
}
