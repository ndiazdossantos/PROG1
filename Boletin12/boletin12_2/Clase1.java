/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_2;

/**
 *
 * @author noese
 */
public class Clase1 {
    int p1;
    int p2;
    public Clase1(int i,int j){
        p1=i;
        p2=j;
    }
    public int modificar(int i){
        p1=p1+i;
        p2=p2+i;
        System.out.println(p2+" ");
        return p1;
    }
}
