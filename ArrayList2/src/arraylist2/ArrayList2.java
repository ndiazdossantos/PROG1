/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author noese
 */
public class ArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obx = new Metodos();
        ArrayList <Integer> listaNumeros = new ArrayList();
        
// https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

        //engadir
        
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(2);
        listaNumeros.add(5);// perderan su funcion despues del remove
        listaNumeros.add(3);
        listaNumeros.add(2);
        
        //cambio valor posición
        
        listaNumeros.set(2,3); // el primero correcponde con la posición y el segundo por el numero que queremos sustituir, sustituimos el valor de la posicion 2 (0-1-2-3) por el 3
        
        // eliminar un elemento (int i)
        
        listaNumeros.remove(2);
        
        // eliminar por valor (obx)
        
        listaNumeros.remove(new Integer(5));
        listaNumeros.add(5);
        listaNumeros.add(3);  // los de arriba pasan a no servir de nada
        listaNumeros.add(2);
        
        // cambio valor sen posicion
        
        int posicion = listaNumeros.lastIndexOf(new Integer(5));
        listaNumeros.set(posicion,7);
     // obx.amosar(listaNumeros);
        
        // ordenar
        
        Collections.sort(listaNumeros);
        obx.amosar(listaNumeros);
        
        
        // metodo ver
        
        obx.ver(listaNumeros);
        
        
        
    }
    
}
