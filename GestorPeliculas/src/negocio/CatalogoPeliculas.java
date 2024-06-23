package negocio;

public interface CatalogoPeliculas {
    /*
    por default los metodos de las interfaces son publicas, finales y constantes
     */
    void agrgarPelicula(String nombrePelicula, String nombreArchivo);
    void listarPeliculas(String nombreArchivo);
    void buscarPelicula(String nombreArchivo, String buscar);
    void iniciarArchivo(String nombreArchivo);
    void borrarArchivo(String nombreArchivo);
}
