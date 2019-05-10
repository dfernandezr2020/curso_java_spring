package com.sinensia;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Cliente {
    
    protected long id;
    protected String Nombre;
    boolean Activo;
    private char Genero;
    private int Edad;
    private String Email;
    
    public Cliente() {
    }
    
    public Cliente(long id, String nom, boolean act, char gen, int ed,
            String em) /*throws Exception*/ {
        this.id = id;
        if (Nombre == null || Nombre == "") {
            //throw new Exception("Nombre de cliente inválido");
            System.err.println("Nombre de cliente inválido");
        }
        this.Nombre = nom;
        this.Activo = act;
        this.Genero = gen;
        this.Edad = ed;
        this.Email = em;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public void mostrar() {
        System.out.println("Cliente: " + Nombre);
        System.out.println(" id: " + this.id);
        System.out.println(" Email: " + this.getEmail());
    }
}
