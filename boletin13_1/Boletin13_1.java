/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13_1;

/**
 *
 * @author noese
 */
public class Boletin13_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Xogador xo = new Xogador(12, "dianteiro", 4, "Pepe", "Garcia", 21);
        Adestrador ades = new Adestrador("32a", 7, "Benito","Camela", 37);
        Masaxista masa = new Masaxista("licenciatura", 6, 34, "Carmena", "Diaste", 45);
        Seleccion sele = new Seleccion();
        
        xo.concentrarse();
        ades.concentrarse();
        masa.concentrarse();
        
        xo.viaxar();
        ades.viaxar();
        masa.viaxar();
        
        //sele.dirixir COMPROBE QUE NO FUNCIONA
        
    }
    
}
