/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author noese
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ConversorTemperaturas obx1 = new ConversorTemperaturas();
     try{
         obx1.centigradosAFharenheit(50);
         }catch(TemperaturaErradaExcepcion a){
             System.out.println("erro "+a.toString());
     }
      try{
         obx1.centigradosAReamur(100);
         }catch(TemperaturaErradaExcepcion b){
             System.out.println("erro "+b.toString());
     }
     
    }
    
}
