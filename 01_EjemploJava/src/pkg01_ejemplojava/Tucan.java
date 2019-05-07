package pkg01_ejemplojava;

/**
 *
 * @author Admin
 */
public class Tucan {
    
    String[] colores;
    float longitud;
    int edad;
    
    public Tucan() {
        this.edad = 0;
        this.longitud = 5f;
        this.colores = new String[] {"blanco", "negro"};
    }
    /**
     * Un pajaro dice pio y su edad.
     * 
     */
    public void piar() {
        System.out.println("Pio pio " + edad + " años");
    }
}
