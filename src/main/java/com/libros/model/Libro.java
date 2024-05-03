package com.libros.model;

import java.util.List;

public class Libro {
    private int id;

    private String titulo;

    private List<DatosAutor> autores;

    private int descargas;

    public Libro(DatosLibro libro) {
        this.id = libro.id();
        this.titulo = libro.titulo();
        this.autores = libro.autores();
        this.descargas = libro.descargas();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDescargas() {
        return descargas;
    }

    public void setDescargas(int descargas) {
        this.descargas = descargas;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autores=" + autores + ", descargas=" + descargas + "]";
    }

    public List<DatosAutor> getAutores() {
        return autores;
    }

    public void setAutores(List<DatosAutor> autores) {
        this.autores = autores;
    }


}
