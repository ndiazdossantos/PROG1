/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa8;

/**
 *
 * @author noese
 */
public class Operacions {
    
    
    // apartado 1 :  Calcular o elemento mínimo dun  array; 
    public static Integer elementoMinimo(Integer[][]array){
        
     int minimo = array[0][0];
     
     for(int i = 0;i<array.length;i++){
        int elementoMinimoFila = array[i][0];
        for(int j= 1;j<array[i].length;j++){
            if(array[i][j]<elementoMinimoFila)
                elementoMinimoFila= array[i][j];
                
        }
        
        if(elementoMinimoFila<minimo)
            minimo = elementoMinimoFila;      
    }
    return minimo; 
        
    }
    
    
    // apartado 2: Calcular o elemento máximo dun  array; 
    
    public static Integer elementoMaximo(Integer[][]array){
        
        int maximo = array[0][0];
        
         for(int i = 0;i<array.length;i++){
        int elementoMaximoFila = array[i][0];
        for(int j= 1;j<array[i].length;j++){
            if(array[i][j]>elementoMaximoFila)
                elementoMaximoFila= array[i][j];
                
        }
        
        if(elementoMaximoFila>maximo);
            maximo = elementoMaximoFila;      
    }
    return maximo; 
        
        
    }
    
    // apartado 3: Buscar un Obxecto nun array, devolvendo a posición da primeira aparición do Obxecto no array ou -1 se non existe. 
    
    public static void buscarObxecto(Integer[][] array, Integer valor) {
        loop: {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j]!= null) {
                        if (array[i][j].equals(valor)) {
                            System.out.println("Fila: " + i + "\nPosición: " + j);
                            break loop;
                        }
                    }
                }
            }
            System.out.println("-1");
        }
    }
    
   
    
    // exercicio 2
    
    public static void borrarObxecto(Integer[][]array,Integer valor) {
        loop: {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] != null) {
                        if (array[i][j].equals(valor)) {
                            array[i][j] = null;
                            System.out.println(valor);
                            break loop;
                        }
                    }
                }
            }
            System.out.println("null");
        }
    }
    
}
