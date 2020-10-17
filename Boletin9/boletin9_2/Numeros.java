/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author noese
 */
class Numeros {
    int acumuladorSuma=0;
    double acumuladorProducto=1;
    int contador=10;
    
    public Numeros(){
        
    }
    public void Calcular(){
        do{
            acumuladorSuma=contador+acumuladorSuma;
            acumuladorProducto=contador*acumuladorProducto;
            contador++;
        }while (contador <=90);
         System.out.println("Suma : "+acumuladorSuma+"\nProducto : "+acumuladorProducto);
        }
    
    }


