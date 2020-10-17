/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Operaciones {

    private int numero;

    public Operaciones() {
    }

    public void setDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = sc.nextInt();
    }

    public void Multiplicacion() {
        setDatos();
        while (numero != 0) {
            System.out.println("La tabla de multiplicar de:" +numero);
            for(int a=1;a<=10;a++){
                System.out.println(numero+"\nmultiplicado por"+a+" es igual a : "+(numero*a));
            }
            System.out.println("Introduzca otro numero: ");
        setDatos();
        }
         
    }

}
