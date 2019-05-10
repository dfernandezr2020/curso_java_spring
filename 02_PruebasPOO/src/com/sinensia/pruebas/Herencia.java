/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.ClienteInvitado;
import com.sinensia.ClienteVip;

/**
 *
 * @author Admin
 */
public class Herencia {
    
    public static void probandoHerencia() {
        
        ClienteInvitado invitado = new ClienteInvitado(2, "Juan", true, 'H', 30, 
                        "juan@gmail.com");
        invitado.setDuracionMax(10);
        System.out.println("Cliente: " + invitado.getNombre() 
                + " Duración: " + invitado.getDuracionMax());
        
        ClienteVip vip = new ClienteVip(2, "Juan", true, 'H', 30, 
                        "juan@gmail.com","Descuentos aplicables en seguros,"
                + " transporte público, etc.");
        System.out.println("Cliente: " + vip.getNombre() + " Beneficios: " 
                + vip.getBeneficios());
    }   
}
