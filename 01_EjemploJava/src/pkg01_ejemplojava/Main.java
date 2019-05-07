package pkg01_ejemplojava;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        
        boolean condicion = 5 == 5 && true;
        if (3 < 5) {
            if (condicion || false) {
               System.out.println("Es verdadero"); 
            }        
        } else if (5 < 7) {
            System.out.println("No se ejecuta");
        } else if (8 < 9) {
            System.out.println("No se ejecuta");
        } else {
            System.out.println("Cualquier otro caso");
        }
        char letra = 'B';
        switch (letra) {
            case 'A':
                System.out.println("Aaaaaa");
                break;
            case 'B':
                System.out.println("Bbbbb");
                break;
            case 'C':
                System.out.println("Ccccc");
                break;
        }
        String formateado = nombreApellido("German", "Caballero Rodriguez");
        System.out.println(formateado);
        
        Tucan miPajaro;
        miPajaro = new Tucan();
        miPajaro.longitud = 20.5f;
        Tucan otroPajaro;
        otroPajaro = new Tucan();
        otroPajaro.longitud = 30.9f;
        System.out.println("Mi tucan: " + miPajaro.longitud);
        
        System.out.println("Otro tucan: " +  otroPajaro.longitud);
        
        System.out.println("Otro Tucan: " + otroPajaro);
        
        otroPajaro = miPajaro;
        
        System.out.println("Otro Tucan: " + otroPajaro.longitud);
        
        miPajaro.longitud = 67.6f;
        
        System.out.println("Otro tucan: " + otroPajaro.longitud);
        
        otroPajaro.edad = 11;
        System.out.println("Otro tucan: " + miPajaro.edad);
        otroPajaro.piar();
        miPajaro.piar();
        
        Tucan nuevoTucan = new Tucan();
        System.out.println("Nuevo tucan: " + nuevoTucan.longitud);
    } 
    
    static String nombreApellido(String nombre, String apellidos){
        return apellidos + ", " + nombre;
    }    
}
