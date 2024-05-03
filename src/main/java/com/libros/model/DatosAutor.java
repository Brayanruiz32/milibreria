package com.libros.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutor(
    @JsonAlias("name") String name,

    @JsonAlias("birth_year") int anioNacimiento,

    @JsonAlias("death_year") int anioFallecimiento
) {
    
}
