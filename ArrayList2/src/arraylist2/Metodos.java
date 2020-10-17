/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author noese
 */
public class Metodos {
    // distintos xeitos de percorrer unha coleccion : 
    public void amosar(ArrayList<Integer> lista){
        for(int i = 0; i<lista.size();i++)
            System.out.println(lista.get(i));
    }
    
    public void amosarForEach(ArrayList<Integer>lista){
        for(Integer ele :lista)
        System.out.println(ele);
    }
    
    // utilizando iteradores https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html
    
    public void amosarIteradores(ArrayList<Integer>lista){
       Iterator it = lista.iterator();
       while(it.hasNext())
            System.out.println(it.next());
       
       /* otra manera de hacerlo
       
          int valor=(Integer) it.next(); // hay que castearlo al tipo Integer o nos dará error de tipo
          System.out.println(valor);

         */
    }
    
    public void ver(ArrayList<Integer>lista){
           System.out.println(lista);
            }
    
    
}
