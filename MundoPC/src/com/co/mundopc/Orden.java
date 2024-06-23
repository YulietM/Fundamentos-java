package com.co.mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("superado el limite");
        }
    }

    public void mostrarOrder(){
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Computadoras de la orden : " + this.idOrden);
        for(int i = 0; i< this.contadorComputadoras; i++){
            System.out.println(this.computadoras[i]);
        }
    }
}
