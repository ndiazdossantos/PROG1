/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author noese
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Conta obx1 = new Conta("Noe","BA1243",7.3f,5320);
       obx1.amosar();
       System.out.println("Ingreso 1500 cuenta de Noe");
       obx1.ingreso(1500);
       obx1.amosar();
        System.out.println("Reintegro 530 cuenta de Noe");
       obx1.reintegro(530);
       obx1.amosar();
       Conta obx2 = new Conta("Eduardo","A13242",8.5f,2342);
        System.out.println("Transferencia de 342 euros de la cuenta de Noe a la cuenta de Eduardo ");
       obx1.transferencia(obx2, 342);
       obx1.amosar();
       obx2.amosar();
       
    }
    
}
