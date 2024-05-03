package com.libros.services;

public interface IConvierteDatos {


    <T>T convertidor(String json, Class<T> clase);


}
