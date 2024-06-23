package datos;
import domain.Pelicula;

import java.io.*;
import java.util.List;

public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        FileReader  fre = null;
        BufferedReader bre = null;
        if(archivo.exists()){
            try{
                fre = new FileReader(archivo);
                bre = new BufferedReader(fre);
                String s = null;
                while( (s = bre.readLine() ) != null) {
                    System.out.println(s);
                }
            }catch(IOException e) {
                System.out.println("Error al leer el archivo");
            }finally{
                System.out.println("fin del listado de peliculas "+ nombreArchivo);
             }
        }else{
            System.out.println("No existe el archivo "+nombreArchivo);
        }
        return List.of();
    }

    @Override
    public void borrar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("el archivo se elimino correctamente");
        }else{
            System.out.println("error en la eliminacion, no se encontro el archivo");
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        File archivo = new File(nombreArchivo);
        FileReader fre = null;
        BufferedReader bre = null;
        if (archivo.exists()) {
            System.out.println("Buscando archivo.....");
            System.out.println("se encontro archivo "+  nombreArchivo);
            System.out.println("buscando Pelicula......");
            try {
                fre = new FileReader(archivo);
                bre = new BufferedReader(fre);
                for(String s = null; (s = bre.readLine()) != null; ) {
                    if(s.equalsIgnoreCase(buscar)){
                        return s;
                    }continue;
                }
            }catch (IOException e){
                System.out.println("error buscando archivo "+nombreArchivo);
            }
        }else {
            System.out.println("el archivo no existe, verifiquelo");
        }
        return "";
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
        File archivo = new File(nombreArchivo);
        if(archivo.exists()){
            anexar = true;
            if (anexar == true){
                try{
                    PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
                    salida.println(pelicula.getNombre());
                    salida.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace(System.out);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }else{
            try{
                PrintWriter salida = new PrintWriter(archivo);
                salida.println(pelicula.getNombre());
                salida.close();
                System.out.println("se ha agregado la pelicula en el archivo "+ nombreArchivo);
            } catch (FileNotFoundException e) {
                e.printStackTrace(System.out);
            }
            System.out.println("se creo el archivo "+ nombreArchivo + " y se agrego la pelicula "+ pelicula.getNombre());
        }
    }

    public String crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            System.out.println("el archivo ya existe");
        } else {
            try {
                PrintWriter salida = new PrintWriter(archivo);
                salida.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace(System.out);
            }
        }
        return nombreArchivo;
    }

}

