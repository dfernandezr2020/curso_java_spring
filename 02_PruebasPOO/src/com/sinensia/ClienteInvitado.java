package com.sinensia;

/**
 *
 * @author Admin
 */
public class ClienteInvitado extends Cliente {

    public ClienteInvitado(int id, String nom, boolean act, char gen, int ed, String em) /*throws Exception*/ {
        super(id, nom, act, gen, ed, em);
    }

        private int duracionMax;

    /**
     * Get the value of duracionMax
     *
     * @return the value of duracionMax
     */
    public int getDuracionMax() {
        return duracionMax;
    }

    /**
     * Set the value of duracionMax
     *
     * @param duracionMax new value of duracionMax
     */
    public void setDuracionMax(int duracionMax) {
        this.duracionMax = duracionMax;
    }

    @Override
     public void mostrar() {
        System.out.print(" INVITADO ");
        super.mostrar();
        /*System.out.println(" id: " + this.id);
        System.out.println(" Email: " + this.getEmail());*/
        System.out.println(" Duración máxima: " + duracionMax);
    }
}
