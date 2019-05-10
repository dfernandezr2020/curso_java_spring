package com.sinensia.poo_avanzado;

public abstract class Animal {
    
    protected int patas;
    protected boolean aerobico;
    protected boolean acuatico;
    protected String nombre;
    protected float tamanho;

    public Animal(String nombre, float tamanho) {
        this.nombre = nombre;
        this.tamanho = tamanho;
        this.aerobico = false;
        this.acuatico = false;
        this.patas = 0;
    }
    
    public abstract void mover();
    public abstract void comer();
    public abstract void volar();

    public Animal(int patas, boolean aerobico, boolean acuatico, String nombre, float tamanho) {
        this.patas = patas;
        this.aerobico = aerobico;
        this.acuatico = acuatico;
        this.nombre = nombre;
        this.tamanho = tamanho;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isAerobico() {
        return aerobico && acuatico;
    }

    public void setAerobico(boolean aerobico) {
        this.aerobico = aerobico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
