/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_2;

/**
 *
 * @author noese
 */
public class Boletin11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Media obx1 = new Media();
       obx1.setAutor("Jose Roberto");
       obx1.setNom("La piedrita");
       obx1.setDuradaSegons(34);
        System.out.println("AUTOR: "+obx1.getAutor()+"\nNombre : "+obx1.getNom()+"\nDuración : "+obx1.getDurada());
    }
    
}
