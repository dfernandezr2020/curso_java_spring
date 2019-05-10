
package com.sinensia.poo_avanzado;

public abstract class Tigre extends AnimalSalvaje implements Depredador, Mamifero{

    public Tigre(String nombre, float tamanho) {
        super(4, true, false, nombre, tamanho);
    }
    @Override
    public void volar() {
        /*throw new UnsupportedOperationException("Error: " + nombre + " no puede volar");*/
    }
    @Override
    public void comer() {
        System.out.println(nombre + " Come tucanes!");
    }
    @Override
    public void mover() {
        System.out.println(nombre + " Se mueve muy rápido!");
    }
   @Override
    public void cazar(String presa) {
        System.out.println(nombre + " quema, vuela y caza a " + presa);
    }
    
    @Override
    public String mamar(Mamifero dragon){
        /*return dragon.toString();*/
        /*return dragon.toString();*/
        
        /*return nombre + " mama del" + dragon + dragon.nombrar();*/
        if(dragon instanceof Animal){
            Animal a =(Animal) dragon;
            return "El tigre " + nombre + " mama de " + a.getNombre();
        } else {
            return null;
        }
    }
    
    @Override
    public String nombrar() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Tigre " + nombre; 
    }
}
