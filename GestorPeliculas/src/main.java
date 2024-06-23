import datos.AccesoDatos;
import datos.AccesoDatosImpl;
import domain.Pelicula;
import exepciones.AccesoDatosEx;
import negocio.CatalogoPeliculas;
import negocio.CatalogoPeliculasImpl;

public class main {
    public static void main(String[] args) {
        //AccesoDatos datos = new AccesoDatosImpl();
        //datos.escribir("emperadorCusco.txt");
        CatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl(new AccesoDatosImpl());

        //datos.crearArchivo("emperadorCusco.txt");
        //datos.escribir(new Pelicula("Toy story") , "animados.txt", false);
        //datos.existe("animados.txt");
        //datos.borrar("emperadorCusco.txt");
        //datos.listar("animados.txt");
        //datos.buscar("animados.txt", "luca");

        catalogoPeliculas.agrgarPelicula("intensamente 2", "animados.txt");
        //catalogoPeliculas.listarPeliculas("anidados");

    }
}
