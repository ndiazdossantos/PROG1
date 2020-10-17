/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_4;

/**
 *
 * @author noese
 */
public class Boletin18_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Metodos NIF = new Metodos();
        int[] numero={3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
        char[] letra=new char []{'a','b','c','d','e','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
            NIF.letraDni(numero, letra);
    }
    
}
