/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Numeros {

    private int num;

    public Numeros() {

    }

    public Numeros(int num) {
        this.num = num;
    }

    public void darDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca datos :");
        num = sc.nextInt();

    }

    public int getNum() {
        return num;
    }

    public void Calcular() {
        darDatos();
        int contPositivo = 0;
        int contNegativo = 0;
        int contCero = 0;
        int repeticion=0;
        do{
        if (num == 0) {
            contCero++;
        }
        System.out.println("Nº de 0 : "+contCero);
        if (num<0){
            contNegativo++;
        }
        System.out.println("Nº de negativos : "+contNegativo);
        if (num>0){
            contPositivo++;
        }
        System.out.println("Nº de positivos : "+contPositivo);
        repeticion++;
        darDatos();
        }while(repeticion<10);
       

        }

    }
