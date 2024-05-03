# API de Biblioteca
En el siguiente codigo, se puede tener a disposición un codigo de prueba del consumo de una API de biblioteca. 
Despues le agregaré el texto necesario para poder explicar mejor lo que hay dentro :)
## En la lupa del codigo 
Para la creación de este consumo de API se utilizaron diversas herramientas como: 
-[Clase Optional](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html):El uso de este contenedor es necesario recibir de manera segura los datos que se hayan de depositar o no dentro de el, brindando un extra de seguridad ante alguna excepcion que pueda suceder.
-[Tipo Generico](https://docs.oracle.com/javase/tutorial/java/generics/types.html):Es necesario su uso para poder elaborar un codigo más flexible y que acepte diferentes tipos de clases, y en este caso en particular como parametro dentro de un metodo asi como tambien su valor de retorno en la firma del método.
-[Interfaces](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html):Esta se implemento en la estructura del convertidor de datos y estuvo declarado con una sola firma de metodo dentro de su declaración.
-[Jackson](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind):Es el hermano gemelo de Gson y tiene casi los mismos usos, en este caso se hizo uso del @JsonAlias ya que sirve de lectura solamente, en el caso que se quiera hacer tanto serializacion como deserializacion, se debe utilizar @JsonProperty
-[Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html):Una gran herramienta para el manejo de arreglos y listas, ultra recomendadisimo y me encantó su flujo de trabajo, recomendado aprenderlo. ;)
-[DoubleSummaryStatistics](https://docs.oracle.com/javase/8/docs/api/java/util/DoubleSummaryStatistics.html):Sirve para poder tener datos generales del listado de objetos que le pases por parametro, te brinda el promedio, máximo, mínimo y un conteo de los objetos
-[Record](https://blogs.oracle.com/javamagazine/post/records-come-to-java):Necesario para ser el intermediario entre el uso de la clase Jackson y los objetos de clase, en estos se declara las anotaciones de Jackson, asi como tambien los ignoradores de las demás propiedades @JsonIgnoreProperties(unknownProperty = true)
