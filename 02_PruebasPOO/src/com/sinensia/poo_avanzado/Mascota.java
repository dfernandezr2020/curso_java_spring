
package com.sinensia.poo_avanzado;

import com.sinensia.Cliente;

public abstract class Mascota extends Animal {
    
    public Cliente propietario;
    
    public Mascota(int patas, boolean aerobico, boolean acuatico, String nombre, float tamanho) {
        super(patas, aerobico, acuatico, nombre, tamanho);
    }

    public void pedirComida() {
        System.out.println(propietario.getNombre() + " Alimentame..");
    }
    
    public abstract void saludarAlPropietario();
    
    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
     
}
