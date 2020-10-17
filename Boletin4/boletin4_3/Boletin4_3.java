/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Boletin4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo obx1 = new Circulo();
        System.out.println("Introduce radio de la circunferencia = ");
        obx1.setRadio(sc.nextDouble());
        System.out.println("Con los datos introducidos el Area es: "+obx1.calcularArea());
        System.out.println("Con los datos introducidos la Longitud es: "+obx1.calcularLonxitude());
                
    }
    
}
