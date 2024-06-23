package negocio;

import datos.AccesoDatos;
import domain.Pelicula;


public class CatalogoPeliculasImpl implements CatalogoPeliculas {

    private AccesoDatos accesoDatos;

    public CatalogoPeliculasImpl(AccesoDatos accesoDatos) {
        this.accesoDatos = accesoDatos;
    }

    @Override
    public void agrgarPelicula(String nombrePelicula, String nombreArchivo) {
        if(accesoDatos.existe(nombreArchivo)){
            accesoDatos.escribir(new Pelicula(nombrePelicula), nombreArchivo, true);
            System.out.println("se agrego la pelicula "+ nombrePelicula + " en el archivo "+ nombreArchivo);
        }else{
            System.out.println("no se pudo agregar el pelicula " + nombrePelicula+ "el archivo no existe");
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        if(accesoDatos.existe(nombreArchivo)){
            accesoDatos.listar(nombreArchivo);
            System.out.println("lista "+nombreArchivo);
        }else{
            System.out.println("no existe el archivo "+ nombreArchivo);
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {

    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {

    }
}
