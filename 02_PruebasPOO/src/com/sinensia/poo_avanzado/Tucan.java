package com.sinensia.poo_avanzado;

public class Tucan extends AnimalSalvaje {
    
    public Tucan(String nombre, float tamanho) {
        super(2, true, false, nombre, tamanho);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " Valoando voy!");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " Come alpiste..");
    }
    public void volar() {
        System.out.println(nombre + " Si vuela");
    }
}
