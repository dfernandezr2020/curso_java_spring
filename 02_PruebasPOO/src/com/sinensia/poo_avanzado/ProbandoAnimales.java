package com.sinensia.poo_avanzado;

import com.sinensia.Cliente;

public class ProbandoAnimales {
    
    public static void probandoClasesAbstractas() {
        
        Tucan unTucan = new Tucan("Tutigualpa", 15.8f);
        unTucan.mover();
        unTucan.volar();
        //Mascota miMascota = new Mascota(0, true, true, "", 0);
        TortugaNinja michelangelo = new TortugaNinja("Michelangelo", 175.f);
        michelangelo.mover();
        try {
            michelangelo.volar();
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.err.println(ex.getMessage());
        } catch (StringIndexOutOfBoundsException ex) {
            System.err.println(" Error en el String " + ex.getMessage());
        } catch (Exception e) {
            System.err.println(" Error general " + e.getMessage());
        } finally {
            System.err.println("Siempre me ejecuto. Cerramos recursos.");
        }
        
        Tigre unTigre = new Tigre("Tigreton", 75.50f) {};
        unTigre.comer();
        unTigre.mover();
        unTigre.volar();
        
        Loro unLoro = new Loro("Pepito", 25.0f);
        unLoro.comer();
        unLoro.mover();
        unLoro.volar();
        
        Cliente yo = new Cliente(3, "Yo", true, 'M', 35, "rpires7@hotmail.com");
        Animal miDragon = new Dragon("Viserion", 5000);
        Mascota miMascota = (Mascota) miDragon;
        miMascota.setPropietario(yo);
        /*((Mascota) miMascota).setPropietario(yo);*/
        //((Mascota) miDragon).pedirComida();
        // Hay que hacer Casting del de la clase abstracta de Mascota de Animal y ejecutamos así el método
        // de Mascota
        ((Dragon) miDragon).saludarAlPropietario();
        miDragon.volar();
        Animal otroDragon = new Dragon("Drogo", 6000);
        otroDragon.mover();
        otroDragon.comer();
        otroDragon.volar();
        
        Dragon dragon = new Dragon("Raeghal", 4000);
        Tigre otroTigre = new Tigre("Tigrecito", 25.9f) {};
        
        System.out.println("¿Que mama el tigre? " + unTigre.mamar(dragon));
        
        System.out.println("¿Que mama el tigre?" + unTigre.mamar(dragon));
        
        System.out.println("¿Que mama el dragon? " + dragon.mama(otroTigre));
        
        System.out.println("¿Que mama el dragon? " + dragon.mamar(otroTigre));
        
        }
}
