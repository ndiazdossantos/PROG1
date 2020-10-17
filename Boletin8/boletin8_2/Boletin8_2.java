/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_2;

/**
 *
 * @author noese
 */
public class Boletin8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Articulos obx1= new Articulos();
       obx1.setPrecio(obx1.sc);
       obx1.setUnidades(obx1.sc);
       obx1.desconto(obx1.getUnidades(),obx1.getPrecio());
       
    }
    
}
