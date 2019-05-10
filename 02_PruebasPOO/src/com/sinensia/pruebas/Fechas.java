package com.sinensia.pruebas;

import com.sinensia.FechaSinMinutos;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class Fechas {
    
    public static void probar() {
        
        FechaSinMinutos fecha = new FechaSinMinutos(/*2019, 5, 8*/);
        fecha.set(2019, 5, 8);
                
        Date fechaDate = fecha.getTime();
        System.out.println("Fecha: " + fechaDate.toString());
    
        FechaSinMinutos miCumple = new FechaSinMinutos(2019, 5, 8);
        
        if(miCumple.equals(fecha)) {
            System.out.println("Cumpleaños feliz! ");
        } else if (miCumple.after(fecha)){
            System.out.println("Aún no cumples ");
        } else if (miCumple.before(fecha)){
            System.out.println("Ya cumpliste años!");
        }
    }
    
}
