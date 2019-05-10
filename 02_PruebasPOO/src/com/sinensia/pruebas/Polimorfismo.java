/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
import com.sinensia.ClienteVip;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class Polimorfismo {
    
    public static ArrayList<Cliente> clientes;
    
    public static void polimorfeando() {
        
        ClienteInvitado invitado;
        invitado = new ClienteInvitado(0, "Juan", true, 'b', 0, "rpi@hotmail.com");
        invitado.setDuracionMax(10);
        invitado.mostrar();
         // Este es un objeto de tipo Cliente Invitado con la forma de Cliente
        Cliente clienteNormal = invitado;
        //System.out.println("Normal: " + clienteNormal.getNombre());
        clienteNormal.mostrar();
        clienteNormal.getClass();
                
        ClienteInvitado elMismoInv = (ClienteInvitado) clienteNormal;
        /* Provoca una excepcion de error de casting       
        Cliente normal = new Cliente(0, "", true, 'a', 0, "rpi@hotmail.com");
        ClienteInvitado normalEnInvit = (ClienteInvitado) normal;
        System.out.println("Nombre: " + normalEnInvit.getDuracionMax());*/
    }
    
    public static void polimorfeandoConListas() {
        
        clientes = new ArrayList<Cliente>();
        
        clientes.add(new Cliente(1, "David", true, 'H', 35, "rpires7@hotmail.com"));
        clientes.add(new Cliente(2, "Juan", true, 'H', 30, "juan@gmail.com"));
        clientes.add(new ClienteInvitado(3, "Ana", true, 'M', 25, "ana@hotmail.com"));
        clientes.add(new ClienteInvitado(4, "Sara", true, 'M', 27, "sara@hotmail.com"));
        clientes.add(new ClienteVip(5, "Jose", true, 'H', 40, "jose@gmail.com","Trasporte gratuito anual"));
        clientes.add(new ClienteVip(6, "Maria", true, 'M', 18, "maria@hotmail.com","Todos los beneficios disponibles"));
        
        for (Cliente cliente : clientes) {
            cliente.mostrar();
        } 
    }
    
    public static void polimorfeandoConHashMap() {
        
        HashMap<String, Cliente> clientes;
        clientes = new HashMap<String, Cliente>();
        
        Cliente david = new Cliente(1, "David", true, 'H', 35, "rpires7@hotmail.com");
        Cliente juan = new Cliente(2, "Juan", true, 'H', 30, "juan@gmail.com");
        ClienteInvitado ana = new ClienteInvitado(3, "Ana", true, 'M', 25, "ana@hotmail.com");
        ClienteInvitado jose = new ClienteInvitado(4, "Jose", true, 'H', 50, "jose@hotmail.com");
        ClienteVip sara = new ClienteVip(5, "Sara", true, 'M', 30, "maria@gmail.com","Trasporte gratuito anual");
        ClienteVip maria = new ClienteVip(6, "Maria", true, 'M', 18, "maria@hotmail.com","Todos los beneficios disponibles");
        
        clientes.put("a1", david);
        clientes.put("b2", juan);
        clientes.put("c3", ana);
        clientes.put("d4", jose);
        clientes.put("f5", sara);
        clientes.put("g6", maria);
        
        for (Map.Entry<String, Cliente> valoresCliente : clientes.entrySet()){
            
            String clave = valoresCliente.getKey();
            System.out.println("Clave: " + clave);
            Cliente c = valoresCliente.getValue();
            if (c instanceof ClienteInvitado) {
                ClienteInvitado cliInv = (ClienteInvitado) c;
                cliInv.setDuracionMax(cliInv.getDuracionMax() + 100);
            } else if (c instanceof ClienteVip) {
                ClienteVip cliVip = (ClienteVip) c;
                cliVip.setBeneficios(cliVip.getBeneficios() +  "Todos los beneficios");
            }
            
            TreeMap<String, Cliente> cOrdenados;
            cOrdenados = new TreeMap<String, Cliente>();
            
        //Modificamos la duracion máxima de un cliente invitado y los beneficios de un cliente vip
        
        if (clientes.containsKey("d4")){
            jose = (ClienteInvitado) valoresCliente.getValue();
            jose.setDuracionMax(jose.getDuracionMax()+7);
        }else if(clientes.containsKey("f5")){
            sara = (ClienteVip) valoresCliente.getValue();
            sara.setBeneficios(sara.getBeneficios() + "Todos los beneficios");
        }
        //Modificamos todos los clientes invitados y vips
        if (valoresCliente.getValue() instanceof ClienteInvitado){
            ClienteInvitado todosInvitados = (ClienteInvitado) valoresCliente.getValue();
            todosInvitados.setDuracionMax(todosInvitados.getDuracionMax()+100);
        }else if(valoresCliente.getValue() instanceof ClienteVip){
            ClienteVip todosVip = (ClienteVip) valoresCliente.getValue();
            todosVip.setBeneficios(todosVip.getBeneficios() + "Todos los beneficios");
        }
        
        /*for (Cliente cli : clientes) {
            cliente.put(" - " + cli.getId() + " " + cli.getNombre(), cli);
        } */
        
        /*for (Map.Entry<String, Cliente> valoresClienteModif : clientes.entrySet()) {
            
            String clave = valoresClienteModif.getKey();
            System.out.println("Clave: " + clave);
            Cliente clientesModif = valoresClienteModif.getValue();
            System.out.println(" Nombre: " + clientesModif.getNombre()
            );
        }*/
        }
    }
}
