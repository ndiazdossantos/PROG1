/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_2;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Articulos {

    private int unidades;
    private float precio;
    Scanner sc = new Scanner(System.in);

    public Articulos() {

    }

    public Articulos(int unidades, float precio) {
        this.unidades = unidades;
        this.precio = precio;
    }

    public void setUnidades(Scanner sc) {
        System.out.println("Introduce las unidades = ");
        unidades = sc.nextInt();

    }

    public void setPrecio(Scanner sc) {
        System.out.println("Introduce el precio = ");
        precio = sc.nextFloat();
    }

    public int getUnidades() {
        return unidades;
    }

    public float getPrecio() {
        return precio;
    }

    public void desconto(int uni, float pre) {
        int descuento;
        float valor = uni * pre;
        if (uni < 100) {
            descuento = 0;
        } else if (uni < 200) {
            if (pre > 4000f)
                descuento = 5;
            else 
                descuento = 2;
            }
            else {
            if (uni>4000f)
            descuento=10;
            else descuento=8;
    }
  System.out.println("Unidades :" +uni+ "\tPrecio :" + pre + "\tDescuento : "+descuento+"%"+"\tTotal a pagar : " +(valor -((valor*descuento)/100)));
        }
    }
