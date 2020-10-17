/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_3;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Boletin8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mes obx1 = new Mes();
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del mes : ");
       obx1.setMes(sc.nextInt());
       obx1.Dias();
    }
    
}
