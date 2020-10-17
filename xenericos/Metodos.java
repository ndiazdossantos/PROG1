
package xenericos;

import java.util.ArrayList;

public class Metodos {
   
    public static <T> void amosar2(ArrayList<? extends Persoa>lista){
        for(int i =0;i<lista.size();i++)
            System.out.println(lista.get(i));
    }
    
     public static <T> void amosar(ArrayList<Persoa>lista){
        for(int i =0;i<lista.size();i++)
            System.out.println(lista.get(i));
    }
    public static <T> void amosar3(ArrayList <T >lista){
         for(T ele : lista)
             System.out.println("**"+ ele);
    } 
    
}
