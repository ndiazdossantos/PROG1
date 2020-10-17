/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_2;

/**
 *
 * @author noese
 */
public class Boletin12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase1 obx1=new Clase1(5,4);
        System.out.println(obx1.modificar(4)+" ");
        Clase1 obx2=new Clase1(5,4);
        System.out.println(obx2.modificar(5)+" ");
        obx2=obx1;
        System.out.println(obx2.modificar(5)+" ");
   
    }
    
}
