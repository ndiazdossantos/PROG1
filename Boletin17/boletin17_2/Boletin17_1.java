/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_1;

/**
 *
 * @author noese
 */
public class Boletin17_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Gato conbotas = new Gato();
       // conbotas.camiñar();
       // conbotas.nadar();
        
        Mamifero mami = new Mamifero();
        mami.camiñar();
        
        //Papagaio papa = new Papagaio();
        //papa.camiñar();
        
        Aves ave = new Aves();
        ave.volar();
        
        Avestruza avtruz = new Avestruza();
        avtruz.camiñar();
        
        Papagaio papa = new Papagaio();
        papa.camiñar();
        
        Morcego morceg = new Morcego();
        morceg.camiñar();
        morceg.volar();
        
        Felino fel = new Felino();
        fel.camiñar();
        fel.nadar();
        
        Gato conbotas = new Gato();
        conbotas.camiñar();
        conbotas.nadar();
        
        Tigre tig = new Tigre();
        tig.camiñar();
        
    }
    
}
