package com.sinensia;

/**
 *
 * @author Admin
 */
public class ClienteVip extends Cliente {
    
    private String Beneficios;

    public ClienteVip(long id, String nom, boolean act, char gen, int ed, String em, String ben) /*throws Exception*/ {
        super(id, nom, act, gen, ed, em);
        this.Beneficios = ben;
    }

    /**
     * Get the value of Beneficios
     *
     * @return the value of Beneficios
     */
    public String getBeneficios() {
        return Beneficios;
    }

    /**
     * Set the value of Beneficios
     *
     * @param Beneficios new value of Beneficios
     */
    public void setBeneficios(String Beneficios) {
        this.Beneficios = Beneficios;
    }
    
    @Override
    public void mostrar() {
        System.out.print(" VIP ");
        super.mostrar();
        /*System.out.println(" id: " + this.id);
        System.out.println(" Email: " + this.getEmail());*/
        System.out.println(" Beneficios: " + this.getBeneficios());
    }

}
