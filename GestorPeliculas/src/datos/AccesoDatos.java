package datos;

import domain.Pelicula;
import java.util.List;

public interface AccesoDatos {
    /*nota:
    tener en cuenta que las interfaces son para definir comportamiento
    y siempre los metodos van a ser final, constantes y publicos por default
     */

    boolean existe(String nombreArchivo);
    List<Pelicula> listar(String nombreArchivo);
    void borrar(String nombreArchivo);
    String buscar(String nombreArchivo, String buscarPelicula);
    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar);
    String crearArchivo(String nombreArchivo);


}
