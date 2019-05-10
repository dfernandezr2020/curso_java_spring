package com.sinensia.poo_avanzado;

public class TortugaNinja extends Mascota {

    public TortugaNinja(String nombre, float tamanho) {
        super(0, true, true, nombre, tamanho);
    }
    @Override
    public void mover() {
        System.out.println(nombre +  " Salto mortal de edificios");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " come pizza..");
    }
    
    @Override
    public void volar() {
       /* throw new UnsupportedOperationException("Error: " + nombre + " no puede volar");*/
    }

    @Override
    public void saludarAlPropietario() {
        System.out.println(propietario.getNombre() + " Hello" + propietario.getNombre() + " !!!");
    }
}
