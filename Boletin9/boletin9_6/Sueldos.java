/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Sueldos {
    private int contador=0;
    private int soldo;
    private int trabajadores1=0;
    private float trabajadores2=0;
    
    public Sueldos(){
        this.contador=contador;
        this.soldo=soldo;
        this.trabajadores1=trabajadores1;
        this.trabajadores2=trabajadores2;
    }
    
    public void setDatos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce soldo");
        soldo=sc.nextInt();
    }
    
    public void Calcular(){
        setDatos();
        while(soldo!=0){
            setDatos();
            if(soldo>=1000 && soldo<=1750){
               trabajadores1++;
            }
            else if(soldo<1000){
                trabajadores2++;
            }
            contador++;
          }
       System.out.println("Hay "+trabajadores1+"\ntrabajadores que ganen entre 1000 y 1750; "+"Hay un porcentaje de : "+((trabajadores2/contador)*100)+"% de trabajadores que ganen menos de 1000");
            
        
    }
}
