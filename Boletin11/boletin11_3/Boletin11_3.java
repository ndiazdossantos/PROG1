/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_3;

/**
 *
 * @author noese
 */
public class Boletin11_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Meses obx1 = new Meses();
        obx1.setDia(4);
        obx1.setMes(5);
        obx1.setAny(2043);
        System.out.println("Dia "+obx1.getDia()+"Mes " + obx1.getMes()+ "Any " + obx1.getAny());
    }
    
    
}
