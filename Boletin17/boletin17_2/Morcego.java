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
public class Morcego extends Mamifero implements IPodeVolar {

    @Override
    public void volar() {
        System.out.println("El morcego pode volar");
    }
    
}
