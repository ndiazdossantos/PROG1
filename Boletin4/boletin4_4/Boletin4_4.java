/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Boletin4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Conta cuenta1,cuenta2;
     Scanner sc = new Scanner(System.in);
     cuenta1=new Conta();
     cuenta2=new Conta();
     System.out.println("Introduce Nombre = ");
     cuenta1.setNome(sc.next());
     System.out.println("Introduce numero de cuenta = ");
     cuenta1.setNConta(sc.next());
     System.out.println("Introduce tipo interes = ");
     cuenta1.setInteres(sc.nextDouble());
     System.out.println("Introduce saldo= ");
     cuenta1.setSaldo(sc.nextDouble());
      System.out.println("Introduce Nombre = ");
     cuenta2.setNome(sc.next());
     System.out.println("Introduce numero de cuenta = ");
     cuenta2.setNConta(sc.next());
     System.out.println("Introduce tipo interes = ");
     cuenta2.setInteres(sc.nextDouble());
     System.out.println("Introduce saldo= ");
     cuenta2.setSaldo(sc.nextDouble());
     //mostramos que todos los datos se hayan introducido correctamente
     cuenta1.getDatos();
     cuenta2.getDatos();
     System.out.println("Introduzca el importe que desea ingresar en la cuenta 1 =  ");
     cuenta1.ingreso(sc.nextDouble());
     System.out.println("Introduzca el importe que desea ingresara la cuenta 2 = ");
     cuenta2.ingreso(sc.nextDouble());
     //mostramos si el ingreso se ha realizado correctamente en ambas cuentas
     cuenta1.getDatos();
     cuenta2.getDatos();
     //me realizaremos la transferencia de la cuenta 1 a la dos
     System.out.println("Introduzca el importe de la transferencia de la cuenta 1 a la 2= ");
     cuenta1.transferencia(cuenta2,sc.nextDouble());
     System.out.println(" La transferencia se realizo satisfactoriamente");
     //mostramos los cambios realizados
     cuenta1.getDatos();
     cuenta2.getDatos();
     
     
     
     
    }
    
}
