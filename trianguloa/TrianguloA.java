/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianguloa;

/**
 *
 * @author noese
 */
public class TrianguloA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obx1 = new Metodos(); // o para evitarnos darle valores en obx1 podemos hacer Metodos obx1 = new Metodos(2.3f,5);
        obx1.setAltura(5);
        obx1.setBase(6);
        obx1.amosar();
        
    }
    
}
