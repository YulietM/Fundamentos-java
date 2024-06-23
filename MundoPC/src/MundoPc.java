import com.co.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {

        Monitor monitorhp = new Monitor("hp", 13);
        Teclado teclado = new Teclado("cable", "hp");
        Raton raton = new Raton("cable", "logi");

        Computadora computadorhp = new Computadora("computador hp", monitorhp, teclado, raton);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadorhp);

        orden1.mostrarOrder();
    }
}
