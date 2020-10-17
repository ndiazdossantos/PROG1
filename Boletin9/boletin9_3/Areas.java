/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Areas {
    private int base;
    private int altura;
    
    public Areas(){
        this.base=base;
        this.altura=altura;
    }
    public void setDatos(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce base: ");
        base=sc.nextInt();
        System.out.println("Introduce altura: ");
        altura=sc.nextInt();
    }
    
    public void Area(){
        setDatos();
        do{
            System.out.println("Area =  "+(base*altura));
            setDatos();
        }while(base>0 && altura>0);
        setDatos();
        }
    }
    
    

