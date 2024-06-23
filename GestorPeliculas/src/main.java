import datos.AccesoDatosImpl;
import negocio.CatalogoPeliculas;
import negocio.CatalogoPeliculasImpl;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner imprimri = new Scanner(System.in);
        int opcion = 0;
        String nombreArchivo = "";
        String nombrePelicula = "";
        CatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl(new AccesoDatosImpl());

        System.out.println("Bienvenido Meli Prime");
        System.out.println("************ Menú ************");
        System.out.println("1. listar peliculas");
        System.out.println("2. Agregar pelicula");
        System.out.println("3. Buscar pelicula");
        System.out.println("4. Iniciar archivo");
        System.out.println("5. Borrar archivo");
        System.out.println("6. salir");
        System.out.println("por favor selecione una opcion: ");

        opcion = imprimri.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("por favor indique el archivo a consultar: ");
                nombreArchivo = imprimri.next();
                catalogoPeliculas.listarPeliculas(nombreArchivo);
                break;
            case 2:
                System.out.println("por favor indique el nombre de la pelicula: ");
                nombrePelicula = imprimri.next();
                System.out.println("ahora indique el nombre del archivo donde desea guardarla: ");
                nombreArchivo = imprimri.next();
                catalogoPeliculas.agrgarPelicula(nombrePelicula, nombreArchivo);
                break;
            case 3:
                System.out.println("por favor indique el nombre del archivo: ");
                nombreArchivo = imprimri.next();
                System.out.println("por favor indique el nombre de la pelicula: ");
                nombrePelicula = imprimri.next();
                catalogoPeliculas.buscarPelicula(nombreArchivo, nombrePelicula);
                break;
            case 4:
                System.out.println("por favor indique el nombre del archivo que desea iniciar: ");
                nombreArchivo = imprimri.next();
                catalogoPeliculas.iniciarArchivo(nombreArchivo);
                break;
            case 5:
                System.out.println("por favor indique el nombre del archivo para eliminar: ");
                nombreArchivo = imprimri.next();
                catalogoPeliculas.borrarArchivo(nombreArchivo);
                break;
            case 6:
                System.out.println("se finalizo el programa");
                break;
        }
    }
}
