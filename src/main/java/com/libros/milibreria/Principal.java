package com.libros.milibreria;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.libros.model.DatosLibro;
import com.libros.model.DatosResultados;
import com.libros.services.ConsumoAPI;
import com.libros.services.ConvierteDatos;

public class Principal {
    private ConsumoAPI consumidora = new ConsumoAPI();

    private ConvierteDatos convertidora = new ConvierteDatos();
    private Scanner entrada = new Scanner(System.in);

    public void ejecucionPrincipal() {
        // conseguimos los datos mediante la API
        String json = consumidora.obtenerDatos("https://gutendex.com/books/");
        System.out.println(json);
        // usamos el jackson convertidor para pasar a clase el json
        var datos = convertidora.convertidor(json, DatosResultados.class);
        // System.out.println(datos);
        // creamos un nuevo array en el que guardar los datos
        ArrayList<DatosLibro> libros = new ArrayList<>();
        // recorremos el array agregando los nuevos libros en el array
        // for (DatosLibro libro : datos.libros()) {

        // libros.add(libro);
        // }
        // System.out.println(libros);

        // convertimos los autores en objetos
        // libros.stream().forEach(l -> l.getAutores().stream().forEach(a -> new
        // Autor(a.getName(), a.getAnioNacimiento(), a.getAnioFallecimiento())));

        // System.out.println(misDatosLibros);

        System.out.println("Datos");
        datos.libros()
                .stream()
                .forEach(l -> libros.add(new DatosLibro(l.id(), l.titulo(), l.autores(),
                        l.descargas())));
        libros.stream().limit(5).forEach(e-> System.out.println(e));


        System.out.println("TOP 10 LIBROS MÁS DESCARGADOS");
        json =  consumidora.obtenerDatos("https://gutendex.com/books/?sort=popular");
        var top10 = convertidora.convertidor(json, DatosResultados.class);
        top10.libros().stream().limit(10).forEach(e-> System.out.println(e.titulo().toUpperCase()));

        // libros.stream()
        //         .sorted(Comparator.comparing(DatosLibro::descargas).reversed())
        //         .map(e-> e.titulo().toUpperCase())
        //         .limit(10)
        //         .forEach(System.out::println);

        System.out.println("Indique el libro que desea buscar");
        String tituloBusqueda = entrada.nextLine();
        json = consumidora.obtenerDatos("https://gutendex.com/books/?search=" + tituloBusqueda.replace(" ", "+"));
        DatosResultados busqueda = convertidora.convertidor(json, DatosResultados.class);
        Optional<DatosLibro> libroBuscado = Optional.of(busqueda.libros().stream().findFirst().get());
        libroBuscado.ifPresent(t -> System.out.println("Libro Encontrado\n"+ t));
        libroBuscado.orElse(null);
        DoubleSummaryStatistics est = libros.stream()
                .collect(Collectors.summarizingDouble(DatosLibro::descargas));

        System.out.println("Media de descargas:"+est.getAverage());
        System.out.println("Numero mayor de descargas:"+est.getMax());
        System.out.println("Numero menor de descargas:"+est.getMin());
        System.out.println("Numero de registros contados:"+est.getCount());
        /*
         * traes los datos del api
         * convertir los datos a objetos
         * top 10 libros más descargados
         * hacer una búsqueda de libro
         * 
         * mostrar los datos del libro buscado
         * 
         * mostrar datos estadísticos generales
         */
    }

}
