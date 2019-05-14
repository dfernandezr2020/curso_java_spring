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
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


/**
 *
 * @author Admin
 */
public class Colecciones {
    
    public static void ejemploHasMap() {
        
        HashMap<String, Cliente> dicClientes;
        dicClientes = new HashMap<String, Cliente>();
        Cliente david = new Cliente(1, "David", true, 'H', 35, "rpires7@hotmail.com");
        Cliente juan = new Cliente(2, "Juan", true, 'H', 30, "juan@gmail.com");
        Cliente ana = new Cliente(3, "Ana", true, 'M', 25, "ana@hotmail.com");
        
        dicClientes.put("a1", david);
        dicClientes.put("b2", juan);
        dicClientes.put("c3", ana);
        
        System.out.println("Pires? " + dicClientes.get("a1").getNombre());
        
        if (!dicClientes.containsKey("a1")) {
            dicClientes.put("a1", new Cliente(1, "Pires", true,'H', 35, "rpires7@hotmail.com"));
        }
        System.out.println("Pires?: " + dicClientes.get("a1").getNombre());
        
        for (Map.Entry<String, Cliente> parClaveValor : dicClientes.entrySet()){
            
            System.out.println("Cliente " + parClaveValor.getKey());
            Cliente cliente = parClaveValor.getValue();
            System.out.println(" Nombre: " + cliente.getNombre());
        }
        
        dicClientes.put("d4", new Cliente(4, "Fulano", true, 'M', 60, "fulano@gmail.com"));
        Map<Date, Cliente> mapClietnesFEcha = new TreeMap<Date, Cliente>();
        mapClietnesFEcha.put(new Date(82, 4, 9), david);
        mapClietnesFEcha.put(new Date(81, 4, 9), new Cliente(5, "Fulano", true, 'H', 55, "fulano@gmail.es"));
        mapClietnesFEcha.put(new Date(119, 4, 19), new Cliente(6, "Mengano", true, 'H', 30, "mengano@gmail.es"));
        mapClietnesFEcha.put(new Date(80, 7, 10), dicClientes.get("a1"));
        
        System.out.println("\n\n***** Mapa ordenado fecha *****\n");
        for (Map.Entry<Date, Cliente> entrada : mapClietnesFEcha.entrySet())
        {
            System.out.println(" - Clave: " + entrada.getKey().toString());
            System.out.println(" Valor: " + entrada.getValue().toString());
        }
        
    }
    
    public static void ejemploLista() {
        
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        listaClientes.add(new Cliente(1, "David", true, 'H', 35, "rpires7@hotmail.com"));
        listaClientes.add(new Cliente(2, "Juan", true, 'H', 30, "juan@gmail.com"));
        listaClientes.add(new Cliente(3, "Ana", true, 'M', 25, "ana@hotmail.com"));
        
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println("Cliente " + i + ": Nombre: " + listaClientes.get(i).getNombre() 
                    + " Email: " + listaClientes.get(i).getEmail() + " Edad: " 
                    + listaClientes.get(i).getEdad() + " Genero: " + listaClientes.get(i).getGenero());
        }
        
        listaClientes.remove(0);
        
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println("Cliente " + i + ": Nombre: " + listaClientes.get(i).getNombre() 
                    + " Email: " + listaClientes.get(i).getEmail() + " Edad: " 
                    + listaClientes.get(i).getEdad() + " Genero: " + listaClientes.get(i).getGenero());
        }
        
        Cliente David = listaClientes.get(1);
        David.setEmail("david@gmail.com");
        
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println("Cliente " + i + ": Nombre: " + listaClientes.get(i).getNombre() 
                    + " Email: " + listaClientes.get(i).getEmail() + " Edad: " 
                    + listaClientes.get(i).getEdad() + " Genero: " + listaClientes.get(i).getGenero());
        }
        
        for (Cliente cliente : listaClientes){
            
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Cliente: " + cliente.getEmail());
        }
    }
    
    public static void ejemploSet() {
        
        HashSet<Cliente> conjuntoClientes = new HashSet<Cliente>();
        conjuntoClientes.add(new Cliente(1, "David", true, 'H', 35, "rpires7@hotmail.com"));
        conjuntoClientes.add(new Cliente(2, "Juan", true, 'H', 30, "juan@gmail.com"));
        Cliente clienteKilian = new Cliente(3, "Kilian", true, 'H', 20, "kilian@gmail.com");
        conjuntoClientes.add(clienteKilian);
        conjuntoClientes.add(clienteKilian);
        for (Cliente cli : conjuntoClientes) {
            cli.mostrar();
        }
        /*Iterator<Cliente> iterador = conjuntoClientes.iterator();
        while (iterador.hasNext()) {
            Cliente clienteIterador = iterador.next();
            clienteIterador.mostrar();*/
        }
}
