package com.libros.model;

public class Autor {
    private String name;

    private int anioNacimiento;

    private int anioFallecimiento;
    
    

    public Autor() {
    }

    public Autor(DatosAutor autor) {
        this.name = autor.name();
        this.anioNacimiento = autor.anioNacimiento();
        this.anioFallecimiento = autor.anioFallecimiento();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getAnioFallecimiento() {
        return anioFallecimiento;
    }

    public void setAnioFallecimiento(int anioFallecimiento) {
        this.anioFallecimiento = anioFallecimiento;
    }

    



}
