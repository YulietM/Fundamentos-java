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
            System.out.println("error: no se agrego la pelicula " + nombrePelicula+ ", el archivo no existe");
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        if(accesoDatos.existe(nombreArchivo)){
            accesoDatos.listar(nombreArchivo);
            System.out.println("fin de ls lista "+nombreArchivo);
        }else{
            System.out.println("no existe el archivo "+nombreArchivo);
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        if(accesoDatos.existe(nombreArchivo)){
            if(accesoDatos.buscar(nombreArchivo, buscar).equals(buscar)){
                System.out.println("se encontro la pelicula "+buscar);
            }else{
                System.out.println("no existe la pelicula "+buscar);
            }
        }else{
            System.out.println("no existe el archivo  "+nombreArchivo);
        }
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        if(accesoDatos.existe(nombreArchivo)){
            System.out.println("el nombre de archivo ya existe");
        }else{
            accesoDatos.crearArchivo(nombreArchivo);
            System.out.println("se creo el archihvo "+nombreArchivo);
        }
    }
}
