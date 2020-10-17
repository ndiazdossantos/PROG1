/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_4;

/**
 *
 * @author noese
 */
public class Boletin11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumeroComplejo obx1= new NumeroComplejo( 1.0,2.0);
        NumeroComplejo obx2= new NumeroComplejo(2.0,-3.0);
        NumeroComplejo CERO= NumeroComplejo.CERO;
        System.out.println("Parte Real 1º Numero: "+obx1.getReal());
        System.out.println("Parte Real 2º Numero: "+obx1.getImaginario());
        System.out.println("Parte Imaginaria 2º Numero "+obx1.getImaginario());
        System.out.println("Suma de 1º Numera y el objeto CERO");
        NumeroComplejo nada=obx1.add(NumeroComplejo.CERO);
        System.out.println("Parte Real 1º Numero "+ nada.getReal());
        System.out.println("Parte Imaginaria 1º Numero: "+nada.getImaginario());
        System.out.println("Suma del 1º y 2º Numero");
        nada=obx1.add(obx2);
        System.out.println("Parte Real 1º Numero; "+nada.getReal());
        System.out.println("Parte Imaginaria 1º  Numero: "+nada.getImaginario());
        
    }
    
}
