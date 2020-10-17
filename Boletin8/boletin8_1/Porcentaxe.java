/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_1;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Porcentaxe {
    private int dato;
    Scanner sc=new Scanner(System.in);
    
   public Porcentaxe(){
       
   }
   public Porcentaxe(int dato){
       this.dato=dato;
       
   }
   public void setDato(Scanner sc){
       System.out.println("Introduce la cantidad= ");
       dato=sc.nextInt();
   }
   public int getDato(){
       return dato;
   }
   public void porcentaxes(){
       if(dato<=500)
           System.out.println("La cantidad introducida: "+dato+"Incremento :"+((dato*50)/100)+"Obtenemos cantidad final : "+ (dato+(dato*50)/100));
       else if(dato<=1000)
            System.out.println("La cantidad introducida: "+dato+"Incremento :"+((dato*7)/100)+"Obtenemos cantidad final : "+ (dato+(dato*7)/100));
       else if(dato<=5000)
           System.out.println("La cantidad introducida: "+dato+"Incremento :"+((dato*15)/100)+"Obtenemos cantidad final : "+ (dato+(dato*15)/100));
       else
           System.out.println("La cantidad introducida: "+dato+"Incremento :"+((dato*3)/100)+"Obtenemos cantidad final : "+ (dato+(dato*3)/100));
   }
}
