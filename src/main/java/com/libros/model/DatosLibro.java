package com.libros.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
    @JsonAlias("id") int id,

    @JsonAlias("title") String titulo,

    @JsonAlias("authors") List<DatosAutor> autores,

    @JsonAlias("download_count")int descargas
) {

}
