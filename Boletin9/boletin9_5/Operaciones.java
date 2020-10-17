/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Operaciones {
    private int numero;
    private int elementos;
    private int contador;
    private int a=1;
    
    
    public Operaciones(int numero,int elementos,int contador,int a){
        this.numero=numero;
        this.elementos=elementos;
        this.contador=contador;
        this.a=a;
    }
    
    public void setDatos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce numero: ");
        elementos=sc.nextInt();
    }
    
    public void Calcular(){
        setDatos();
        for (contador = 0; contador < elementos; contador++) {
            numero +=2;
            System.out.println(numero);
        }
        for(contador= 1; contador<= elementos; contador++){
            if(contador %2==0){
                numero=contador;}
            else{
                numero=-(contador);
            }
            System.out.println(numero);
        }
        numero=0;
        for(contador=0; contador<=elementos;contador++) {
            System.out.println(numero);
            numero=numero+a;
            a=numero-a;
            
        }
            
    }
    
            
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}