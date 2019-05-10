package com.sinensia.poo_avanzado;

/**
 *
 * @author Admin
 */
public class Dragon extends Mascota implements Depredador, Mamifero{

    public Dragon(String nombre, float tamanho) {
        super(4, true, false, nombre, tamanho);
    }
    
    public Dragon(int patas, boolean aerobico, boolean acuatico, String nombre, float tamanho) {
        super(patas, aerobico, acuatico, nombre, tamanho);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " se mueve lento pero lanza fuego");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " come cabras");
    }
    
    @Override
    public void volar() {
        System.out.println(nombre + " vuela y lanza fuego");
    }

    @Override
    public void saludarAlPropietario() {
        System.out.println(propietario.getNombre() + " ARRRRHHHH " + propietario.getNombre() + "!!!");
    }

    @Override
    public void cazar(String presa) {
        System.out.println(nombre + " quema, vuela y caza a " + presa);
    }
 
    @Override
    public String mamar(Mamifero dragon) {
        return "El dragon " + nombre + " mama de " + dragon;
    }
    
    public String mama(Mamifero tigre) {
        /*return dragon.toString();*/
        /*return dragon.toString();*/
        
        /*return nombre + " mama del" + dragon + dragon.nombrar();*/
        if(tigre instanceof Animal){
            Animal a = (Animal) tigre;
            return "EL dragon " + nombre + " mama de " + a.getNombre();
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
        return "Dragon " + nombre; 
   /* public String nombrar(){
        return nombre;
    }*/
    }
}
