package com.libros.model;

import java.util.List;

public class Resultados {

    private List<DatosLibro> libros;

    public Resultados(DatosResultados resultados) {
        this.libros = resultados.libros();
    }

    public List<DatosLibro> getLibros() {
        return libros;
    }

    public void setLibros(List<DatosLibro> libros) {
        this.libros = libros;
    }

}
