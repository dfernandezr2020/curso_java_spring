package com.sinensia.poo_avanzado;

public class Loro extends Mascota {

    public Loro(String nombre, float tamanho) {
        super(2, false, false, nombre, tamanho);
    }
    
    public void volar() {
        System.out.println(nombre + " vuela en la casa");
    }
    
    @Override
    public void comer() {
        System.out.println(nombre + " Come pero tambien habla!");
    }

    @Override
    public void mover() {
        System.out.println(nombre + " No se mueve");
    }

    public void pedirComida() {
        System.out.println(propietario.getNombre() + " Alimentame..");
    }
    
    @Override
    public void saludarAlPropietario() {
        System.out.println(propietario.getNombre() + " Pio, pio" + propietario.getNombre() + " !!!");
    }
}
